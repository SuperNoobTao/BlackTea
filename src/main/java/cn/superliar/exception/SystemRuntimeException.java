package cn.superliar.exception;


import cn.superliar.enums.ErrorType;


public class SystemRuntimeException extends RuntimeException {

  private static final long serialVersionUID = -5228947246289048733L;

  /**
   * Error Type
   */
  private ErrorType errorType;

  /**
   * Constructs an {@code ServiceRuntimeException} with the specified message and root cause.
   *
   * @param msg the {@link ErrorType}
   * @param t   the root cause
   */
  public SystemRuntimeException(ErrorType msg, Throwable t) {

    super(msg.name() + ": " + msg.description(), t);
    this.errorType = msg;
  }

  /**
   * Constructs an {@code ServiceRuntimeException} with the specified message and no root cause.
   *
   * @param msg the {@link ErrorType}
   */
  public SystemRuntimeException(ErrorType msg) {

    super(msg.name() + ": " + msg.description());
    this.errorType = msg;
  }

  /**
   * Constructs an {@code SystemRuntimeException}
   */
  public SystemRuntimeException() {
    this(ErrorType.SYS0001);
  }


  private ErrorType obtainErrorType() {
    if (errorType == null) {
      return ErrorType.SYS0001;
    }
    return errorType;

  }

  /**
   * Get error type
   *
   * @return {@link ErrorType}
   */
  public ErrorType getErrorType() {
    return obtainErrorType();
  }

  /**
   * Get error code
   *
   * @return error code
   */
  public String getErrorCode() {
    return obtainErrorType().name();
  }

  /**
   * Get error msg
   *
   * @return error msg
   */
  public String getErrorMsg() {
    return obtainErrorType().description();
  }
}
