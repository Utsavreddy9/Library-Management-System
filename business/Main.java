package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {	
	public Main() {
		SystemController controller = new SystemController(); // is a statement that determines whether the other statements will be executed or not. 

		try {
                    controller.savetoBookList(books);
                    
                    controller.getBooks().forEach((e)->{
                        System.out.println(e.getIsbn()); // for each book it will get ISBN number
                    });
     
		} catch (Exception e) { 
			e.printStackTrace();  // TODO Auto-generated catch block
		}
	}
	
	// adding predefined members
	List<User> testUsers = Arrays.asList(
			new User("lusam","Luswata Samuel" ,"12345", UserType.ADMIN),
			new User("niyo","Niyoshuti Moses" ,"12345", UserType.LIBRARAIN),
			new User("zebro","Zinash Negga Zebro" ,"12345", UserType.LIBRARAIN),
			new User("kedi","Kedi Emmanuel" ,"12345", UserType.BOTH));
	
	List<LibraryMember> listOfMembers = new ArrayList<>(Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			));
	
	List<Author> listOfAuthours = new ArrayList<>(Arrays.asList(
			new Author("Samuel", "Luswata", "0752816800", "610096","He is wonderful"),
			new Author("Zinash", "Negga", "0773927100", "610095","He is dhdhdhdhhdd")
			));
	
	Book b1 = new Book("HSUWYET3638", "Intro To JAVA", 21);
	Book b2 = new Book("JU274DHFY44", "Intro To ALGO", 7);
	Book b3 = new Book("DBVUDU38WNF", "Intro To DS", 21);
	Book b4 = new Book("BVYDHEY37DB", "Intro To SOFTWARE", 7);
	Book b5 = new Book("E03DBFYEJND", "Intro To PROGRAMMING", 21);
	Book b6 = new Book("DGEEICNIENBD", "Intro To MPP", 7);
	BookCopy bc1 =  new BookCopy("281736", b1);
	BookCopy bc2 = 	new BookCopy("46764", b1);
	BookCopy bc3 = 	new BookCopy("45345", b1);
	BookCopy bc4 = 	new BookCopy("3464", b2);
	BookCopy bc5 = 	new BookCopy("34677", b2);
	BookCopy bc6 = 	new BookCopy("78964", b2);
	BookCopy bc7 = 	new BookCopy("3346", b3);
	BookCopy bc8 = 	new BookCopy("23467", b3);
	BookCopy bc9 = 	new BookCopy("34689", b3);
	BookCopy bc10 = new BookCopy("372824", b4);
	BookCopy bc11 = new BookCopy("35678", b4);
	BookCopy bc12 = new BookCopy("98765", b4);
	BookCopy bc13 = new BookCopy("346742", b5);
	BookCopy bc14 = new BookCopy("35790", b5);
	BookCopy bc15 = new BookCopy("96434", b5);
	BookCopy bc16 = new BookCopy("46764", b6);
	BookCopy bc17 = new BookCopy("345790", b6);
	BookCopy bc18 = new BookCopy("64223", b6);
		
	List<Book> books = Arrays.asList(b1, b2, b3, b4, b5);
	 
	  
	public static void main(String[] args) {
		new Main();
	}
}
