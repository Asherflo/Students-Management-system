package semicolon.africa.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private String message;
    @Override
    public String toString(){
        return  message;
    }
}
