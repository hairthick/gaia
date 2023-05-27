package cn.com.gaia.utils.exception;

public class GaiaException extends RuntimeException {

    private final String message;

    private Throwable cause;

    public GaiaException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.cause = cause;
    }

    public GaiaException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
