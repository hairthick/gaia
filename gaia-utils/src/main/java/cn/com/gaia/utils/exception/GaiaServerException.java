package cn.com.gaia.utils.exception;

public class GaiaServerException extends GaiaException{

    public GaiaServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public GaiaServerException(String message) {
        super(message);
    }
}
