package semicolon.africa.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import semicolon.africa.data.model.Student;
import semicolon.africa.util.enums.StudentType;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByEmail(String email);
    List<Student>findByStudentType(StudentType studentType);
    List<Student>findByClassName(String className);
}
