package business;

// getting librarian info
public class Librarian extends Person{

	private static final long serialVersionUID = 7818609981642727915L;
	private String role;

	Librarian(String firstName, String lastName, String phone) {
		super(firstName, lastName, phone, null);
		this.role = "librarian";
	}
	
	public String getRole() {
		return role;
	}

}
