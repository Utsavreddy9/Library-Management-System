package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Adding a new Author and Serializing that data
public class Author extends Person implements Serializable{

	private static final long serialVersionUID = 214235419350328684L;
	private String authorCredentials;
	private String authorBio;
	private List<Book> books;
	
	public Author(String firstName, String lastName, String phone, String authorCredentials, String authorBio) {
		super(firstName, lastName, phone, null);
		this.authorCredentials = authorCredentials;
		this.authorBio = authorBio;
		books = new ArrayList<>();
	}
        
        public void addBookToAuthor(Book book){
            books.add(book);
        }

	public String getAuthorCredentials() {
		return authorCredentials;
	}

	public void setAuthorCredentials(String authorCredentials) {
		this.authorCredentials = authorCredentials;
	}

	public String getAuthorBio() {
		return authorBio;
	}

	public void setAuthorBio(String authorBio) {
		this.authorBio = authorBio;
	}

	@Override
	public String toString() {
		return "Author [authorCredentials=" + authorCredentials + ", authorBio=" + authorBio + "]";
	}
	
}
