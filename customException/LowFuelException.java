package customException;

public class LowFuelException extends Exception {
    public LowFuelException(String str) {
        super(str);
    }
}
