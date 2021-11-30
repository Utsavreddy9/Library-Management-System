package exception;

// The business class will throw many exceptions which will be handled in exception package
public class BookException extends Exception {

	
	private static final long serialVersionUID = 6210926373281795929L;

	public BookException() {
		// TODO Auto-generated constructor stub
	}

	public BookException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BookException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
