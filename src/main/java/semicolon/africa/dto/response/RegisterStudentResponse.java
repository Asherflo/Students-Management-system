package semicolon.africa.dto.response;

import lombok.Data;
import semicolon.africa.util.enums.StudentType;

@Data
public class RegisterStudentResponse {
    private String FirstName;
    private String LastName;
    private String className;
    private String email;
    private String dateCreated;
    private StudentType studentType;

}
