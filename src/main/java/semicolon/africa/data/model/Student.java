package semicolon.africa.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import semicolon.africa.util.enums.Department;
import semicolon.africa.util.enums.Gender;
import semicolon.africa.util.enums.StudentType;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("Students")
public class Student {
    @Id
    private String Id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String dateOfBirth ;
    private String className;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private Gender gender;
    private Department department;
    private StudentType studentType;
    private Set<String> subjects = new HashSet<>();




}
