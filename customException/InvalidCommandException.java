package customException;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String str) {
        super(str);
    }
}
