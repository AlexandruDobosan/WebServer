package exceptions;

public class InvalidPortNumberException extends Throwable {
    public InvalidPortNumberException()
    {
        super("Error:Invalid port number");
    }
}
