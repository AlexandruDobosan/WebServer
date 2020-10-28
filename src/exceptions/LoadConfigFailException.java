package exceptions;

public class LoadConfigFailException extends Throwable {
    public LoadConfigFailException()
    {
        super("Error:Failure in loading configuration");
    }

}
