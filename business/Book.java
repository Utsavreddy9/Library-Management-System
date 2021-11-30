package business;
import java.io.Serializable;
import java.util.*;

// viewing and adding new books 
public class Book implements Serializable{

	private static final long serialVersionUID = 2619007614613572916L;
	private String isbn;
	private String title;
	private Author author;
	private boolean available = false;
	private ArrayList<BookCopy> bookCopies;
	
	public ArrayList<BookCopy> getBookCopies() {
		return bookCopies;
	}
        
        public int getNumberCopies(){
            return bookCopies.size();
        }
	public int getMaxDays() {
		return maxDays;
	}

	private int maxDays;
	
	public Book(String isbn, String title, int maxDays){
		this.maxDays = maxDays;
		this.isbn = isbn;
		this.title = title;
		bookCopies = new ArrayList<BookCopy>();
	}
	public boolean isAvailable() {
		return available;
	}
	
	public void addBookCopy(BookCopy bookCopy) {
		if(!available) available = true;
		bookCopies.add(bookCopy);
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String toString(){
        StringBuilder sb = new StringBuilder();
        bookCopies.forEach((e)->{
            sb.append(e.getCopyID() + " ");
        });
        return sb.toString();
    }
    	
}
