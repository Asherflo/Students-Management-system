package semicolon.africa.util;

import org.springframework.stereotype.Service;
import semicolon.africa.data.repository.StudentRepository;
@Service
public class GeneratedId {
    private StudentRepository studentRepository;
    public GeneratedId (StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }
    public  String generateStudentID9(){
        Long number = studentRepository.count() + 1;
        String id =String.format("%04d",number);
        return  "STUD" + id;
    }
}
