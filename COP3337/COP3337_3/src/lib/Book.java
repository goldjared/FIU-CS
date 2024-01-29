package lib;

// class extends LibraryItem class to inherit from it
public class Book extends LibraryItem {
	String genre;
	int numberOfPages;
	
	// Book constructor, inherits from LibraryItem class via super method
	public Book(String title, String creator, int itemId, String genre, int numberOfPages) {
		super(title, creator, itemId);
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}
	
	public String toString() {
		return "Genre: " + genre + ", NumberOfPages: " + numberOfPages;
		
	}
}
