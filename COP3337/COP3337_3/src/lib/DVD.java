package lib;

// class extends LibraryItem class to inherit from it
public class DVD extends LibraryItem {
	String director;
	int duration;
	
	// Book constructor, inherits from LibraryItem class via super method
	public DVD(String title, String creator, int itemId, String director, int duration) {
		super(title, creator, itemId);
		this.director = director;
		this.duration = duration;
	}
	
	public String toString() {
		return "Director: " + director + ", Duration: " + duration;
	}
	
}
