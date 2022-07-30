package semicolon.africa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import semicolon.africa.Exception.DuplicateAccountException;
import semicolon.africa.dto.request.RegisterStudentRequest;
import semicolon.africa.dto.response.ApiResponse;
import semicolon.africa.dto.response.RegisterStudentResponse;
import semicolon.africa.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/register")
    public ResponseEntity<?> registerStudent(@RequestBody RegisterStudentRequest request) {
        try{
            RegisterStudentResponse studentResponse = studentService.registerStudent(request);
            ApiResponse response = new ApiResponse(true,studentResponse);
            return  new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch(DuplicateAccountException a){
             ApiResponse response = new ApiResponse(false, a.getMessage());
            return  new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/getAll")
    public  ResponseEntity<?> getAllStudent(){
        var  serviceResponse = studentService.getAllStudent();
        ApiResponse apiResponse = new ApiResponse(true,serviceResponse);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }
    @GetMapping("/getClassName/{studentClass}")
    public ResponseEntity<?>  getStudentByClass( @PathVariable  String studentClass){
        var classResponse = studentService.getStudentByClass(studentClass);
        ApiResponse apiResponse = new ApiResponse(true,classResponse);
        return   new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }


}