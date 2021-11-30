package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// taking a book 
public class CheckoutRecord implements Serializable {
	
	private static final long serialVersionUID = -3119855589946373695L;
	
	@SuppressWarnings("unused")
	private LibraryMember member;
	
	private List<CheckoutRecordEntry> entries = new ArrayList<>();
	
	public void addEntry(CheckoutRecordEntry c) {
		entries.add(c);
	}
	
	public String toString() {
		return entries.toString();
	}
}
