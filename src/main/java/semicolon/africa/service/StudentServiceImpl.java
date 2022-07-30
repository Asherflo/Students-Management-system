package semicolon.africa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semicolon.africa.Exception.StudentDoesNotExistException;
import semicolon.africa.data.model.Student;
import semicolon.africa.data.repository.StudentRepository;
import semicolon.africa.dto.request.RegisterStudentRequest;
import semicolon.africa.dto.response.RegisterStudentResponse;
import semicolon.africa.util.Mapper;
import semicolon.africa.util.enums.StudentType;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl  implements  StudentService {
    @Autowired
    private StudentRepository studentRepository;



    @Override
    public RegisterStudentResponse registerStudent(RegisterStudentRequest registerStudentRequest) {

        if(registerStudentRequest == null){
            throw  new IllegalArgumentException("form can not be blank");
        }
        Student student = Mapper.map(registerStudentRequest);
        Student savedStudent = studentRepository.save(student);
        RegisterStudentResponse response = new RegisterStudentResponse();
        Mapper.map(savedStudent, response);
        return response;
    }

    @Override
    public Student getStudentId(String id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()){
            throw  new StudentDoesNotExistException("No student with id number: " + id);
        }
        return student.get();
    }

    @Override
    public List<Student> getAllStudent() {

        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentByClass(String className) {
        List<Student> studentList= studentRepository.findByClassName(className);
        if(studentList == null){
            throw  new IllegalArgumentException("Incorrect details");
        }
        return studentList;
    }

    @Override
    public List<Student> getStudentByStudentType(StudentType studentType) {
        List<Student> studentList = studentRepository.findByStudentType(studentType);
        if(studentList == null){
            throw  new IllegalArgumentException("Incorrect details");
        }
        return studentList;
    }


}
