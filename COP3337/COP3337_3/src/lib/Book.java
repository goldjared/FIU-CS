package lib;

public class Book extends LibraryItem {
	String genre;
	int numberOfPages;
	public Book(String title, String creator, int itemId, String genre, int numberOfPages) {
		super(title, creator);
	}
	
	public String toString() {
	
	}
}
