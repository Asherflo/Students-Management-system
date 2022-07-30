package semicolon.africa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import semicolon.africa.util.enums.Department;
import semicolon.africa.util.enums.Gender;
import semicolon.africa.util.enums.StudentType;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterStudentRequest {
    private String firstName;
    private String lastName;
    private String className;
    private int age;
    private String email;
    private String dateOfBirth;
    private Department department;
    private String subjects;
    private StudentType studentType;
    private Gender gender;

}
