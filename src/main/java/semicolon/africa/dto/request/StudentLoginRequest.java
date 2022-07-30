package semicolon.africa.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import semicolon.africa.dto.response.Response;

public class StudentLoginRequest extends Response {
    public StudentLoginRequest(String message) {
        super(message);
    }
}

