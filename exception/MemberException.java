package exception;

//The business class will throw many exceptions which will be handled in exception package
public class MemberException extends Exception {

	
	private static final long serialVersionUID = 6042934833930982619L;

	public MemberException() {
		// TODO Auto-generated constructor stub
	}

	public MemberException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MemberException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MemberException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MemberException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
