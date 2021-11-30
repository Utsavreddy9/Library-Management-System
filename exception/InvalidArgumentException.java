package exception;

//The business class will throw many exceptions which will be handled in exception package
public class InvalidArgumentException extends Exception {

	/**
	 * This InvalidArgument exception is thrown when some one input wrong exceptions
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidArgumentException() {
		super();
	}
	
	public InvalidArgumentException(String msg) {
		super(msg);
	}
	public InvalidArgumentException(Throwable t) {
		super(t);
	}

}   
