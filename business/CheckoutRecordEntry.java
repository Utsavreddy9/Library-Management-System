package business;

import java.io.Serializable;
import java.time.LocalDate;

// entering details before taking the book
public class CheckoutRecordEntry implements Serializable {
	
	private static final long serialVersionUID = 8447984829265265909L;
	private BookCopy bookCopy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LibraryMember libMember;
	
	
	public CheckoutRecordEntry(BookCopy bookCopy, LibraryMember libMember){ 
		this.bookCopy = bookCopy;
		this.checkoutDate = LocalDate.now();
		this.dueDate = checkoutDate.plusDays(bookCopy.getBook().getMaxDays());
		this.libMember =libMember;
		libMember.addCheckout(this);
	}
		
	public String toString() {
		return "MemberID: "+ libMember.getMemeberID()+
				"\n"+
				"CopyID: "+bookCopy.getCopyID() +
				"\n"+
				"Book ISBN: "+ bookCopy.getBook().getIsbn()+
				"\n"+
				"CheckOutDate: "+ checkoutDate +
				"\n"+
				"DueDate: "+ dueDate +
				"\n";
	
	}
}
