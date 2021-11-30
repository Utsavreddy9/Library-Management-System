package business;


import java.io.Serializable;
import java.util.*;

public class LibraryMember extends Person implements Serializable {
	
// it will check the records and fill the data in given parameters, which will then be structured and presented in the FRAME	
	private List<CheckoutRecordEntry> record;
	
	public LibraryMember(String firstName, String lastName, String phone, String memeberID) {
		super(firstName, lastName, phone, null);
		record = new LinkedList<>();
		this.memeberID =  memeberID;
	}
	
	private String memeberID;
	
	public String getMemeberID() {
		return memeberID;
	}

	public void addCheckout(CheckoutRecordEntry entry) {
		record.add(entry);
	}

	public List<CheckoutRecordEntry> getEntries() {
		return record;
	}
/* serialVersionUID :-
 * The serialization at runtime associates with each serializable class a version number called a serialVersionUID, 
 * which is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization.	
 */
	private static final long serialVersionUID = -2226197306790714013L;
}
