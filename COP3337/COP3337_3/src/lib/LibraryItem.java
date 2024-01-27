package lib;

public class LibraryItem {
	private final String title;
	private final String creator;
	private final int itemId;
	private boolean available;
	
	public LibraryItem(String title, String creator, int itemId) {
		this.title = title;
		this.creator = creator;
		this.itemId = itemId;
		available = true;
	}
	
	public void checkoutItem() {
		if (available) {
			available = false;
			System.out.println("Item '" + title + "' checked out successfully.");
		} else {
			System.out.println("Item '" + title + "' not available.");
		}
	}
	
	public void returnItem() {
		if (!available) {
			available = true;
			System.out.println("Item '" + title + "' returned successfully.");
		} else {
			System.out.println("Item '" + title + "' not accepted.");
		}
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public String toString() {
		return "Title: " + title + ", Creator: " + creator + ", itemID: " + getItemId() + ", isAvailable: " + isAvailable();
	}
}