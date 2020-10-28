package exceptions;

public class SaveConfigFailException extends Throwable {
    public SaveConfigFailException()
    {
        super("Error:Failure in saving configuration");
    }
}
