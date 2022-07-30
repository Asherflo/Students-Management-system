package semicolon.africa.util;

import semicolon.africa.data.model.Student;
import semicolon.africa.dto.request.RegisterStudentRequest;
import semicolon.africa.dto.response.RegisterStudentResponse;

import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Mapper {
    public  static Student map(RegisterStudentRequest registerStudentRequest){
        Student student = new Student();
        student.setFirstName(registerStudentRequest.getFirstName());
        student.setLastName(registerStudentRequest.getLastName());
        student.setClassName(registerStudentRequest.getClassName());
        student.setAge(registerStudentRequest.getAge());
        student.setEmail(registerStudentRequest.getEmail());
        student.setDateOfBirth(registerStudentRequest.getDateOfBirth());
       student.setStudentType(registerStudentRequest.getStudentType());
        student.setDepartment(registerStudentRequest.getDepartment());
        student.setGender(registerStudentRequest.getGender());
        student.getSubjects().add(registerStudentRequest.getSubjects());

        return student;
    }
    public static void map(Student savedStudent, RegisterStudentResponse response){
        response.setFirstName(savedStudent.getFirstName());
        response.setLastName(savedStudent.getLastName());
        response.setClassName(savedStudent.getClassName());
        response.setEmail(savedStudent.getEmail());
        response.setClassName(savedStudent.getClassName());
        response.setStudentType(savedStudent.getStudentType());
        response.setDateCreated(DateTimeFormatter.ofPattern("EEEE,dd/MM/yy,hh-mm,a").format(savedStudent.getDateCreated()));
    }
}
