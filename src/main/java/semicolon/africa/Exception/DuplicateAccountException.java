package semicolon.africa.Exception;

public class DuplicateAccountException extends StudentDoesNotExistException {

    public DuplicateAccountException(String message) {
        super(message);
    }
}
