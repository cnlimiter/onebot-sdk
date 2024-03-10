package cn.evole.onebot.sdk.exception;

/**
 * Assert exception
 * */
public class AssertException extends RuntimeException {

    public AssertException() {
    }

    public AssertException(String message) {
        super(message);
    }

    public AssertException(String message, Throwable cause) {
        super(message, cause);
    }

}
