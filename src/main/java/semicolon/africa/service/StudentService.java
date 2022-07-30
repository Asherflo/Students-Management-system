package semicolon.africa.service;

import semicolon.africa.data.model.Student;
import semicolon.africa.dto.request.RegisterStudentRequest;
import semicolon.africa.dto.response.RegisterStudentResponse;
import semicolon.africa.util.enums.StudentType;

import java.util.List;

public interface StudentService {
    RegisterStudentResponse registerStudent(RegisterStudentRequest registerStudentRequest);
    Student getStudentId(String id);
    List<Student> getAllStudent();
    List<Student> getStudentByClass(String studentClass);
    List<Student> getStudentByStudentType(StudentType boarding);


}
