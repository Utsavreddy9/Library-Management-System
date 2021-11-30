package business;

// Admin role and info
public class Administrator extends Person {
	
	private static final long serialVersionUID = 7564194054635758559L;
	private String role;

	Administrator(String firstName, String lastName, String phone) {
		super(firstName, lastName, phone, null);
		this.role = "admin";
	}
	
	public String getRole() {
		return role;
	}

}
