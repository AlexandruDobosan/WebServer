package exceptions;

public class InvalidMaintenanceException extends Throwable {
    public InvalidMaintenanceException()
    {
        super("Error:Invalid maintenance directory");
    }
}
