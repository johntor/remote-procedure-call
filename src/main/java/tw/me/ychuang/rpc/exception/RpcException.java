package tw.me.ychuang.rpc.exception;

import org.apache.commons.lang3.exception.ContextedException;
import org.apache.commons.lang3.exception.ExceptionContext;

/**
 * Exception thrown when failed to execute in rpc processing.
 * 
 * @author Y.C. Huang
 */
public class RpcException extends ContextedException {
	/**
	 * Constructor
	 * 
	 * @param message the description of this exception
	 */
	public RpcException(String message) {
		super(message);
	}

	/**
	 * Constructor
	 * 
	 * @param cause the cause of this exception
	 */
	public RpcException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor
	 * 
	 * @param message the description of this exception
	 * @param cause the cause of this exception
	 */
	public RpcException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 * 
	 * @param message the description of this exception
	 * @param cause the cause of this exception
	 * @param context a context stores the contextual information
	 */
	public RpcException(String message, Throwable cause, ExceptionContext context) {
		super(message, cause, context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.commons.lang3.exception.ContextedRuntimeException#addContextValue(java.lang.String, java.lang.Object)
	 */
	public RpcException addContextValue(String label, Object value) {
		super.addContextValue(label, value);

		return this;
	}
}
