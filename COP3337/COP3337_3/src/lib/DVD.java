package lib;

public class DVD extends LibraryItem {
	String director;
	int duration;
	
	public DVD(String title, String creator, int itemId, String director, int duration) {
		super(title, creator, itemId);
		this.director = director;
		this.duration = duration;
	}
	
	public String toString() {
		return "Director: " + director + ", Duration: " + duration;
	}
	
}
