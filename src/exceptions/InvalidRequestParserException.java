package exceptions;

public class InvalidRequestParserException extends Throwable {
    public InvalidRequestParserException()
    {
        super("Error:Invalid parser request");
    }
}
