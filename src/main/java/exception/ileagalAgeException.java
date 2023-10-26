package exception;

public class ileagalAgeException extends Exception{
    public ileagalAgeException() {
    }

    public ileagalAgeException(String message) {
        super(message);
    }

    public ileagalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ileagalAgeException(Throwable cause) {
        super(cause);
    }

    public ileagalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}