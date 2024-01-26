package lib;

public class LibraryItem {
	private String title;
	private String creator;
 	private int itemId;
	private	boolean available;
	
	public void checkoutItem() {
		if(available) {
			available = false;
			System.out.println("Item '"+title+ "' checked out successfully.");
		} else {
			System.out.println("Item '"+title+ "' not available.");
		}
	}
	
	public void returnItem() {
		if(!available) {
			available = true;
			System.out.println("Item '"+title+ "' returned successfully.");
		} else {
			System.out.println("Item '"+title+ "' not accepted.");
		}
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public String toString() {
		return "Title: "+title+", Creator: "+creator+", itemID: " + getItemId()+", isAvailable: "+ isAvailable();
	}
}