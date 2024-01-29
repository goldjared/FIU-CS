package lib;

public class LibraryItem {
	private final String title;
	private final String creator;
	private final int itemId;
	private boolean available;
	
	// item constructor, sets each item available boolean to true
	public LibraryItem(String title, String creator, int itemId) {
		this.title = title;
		this.creator = creator;
		this.itemId = itemId;
		available = true;
	}
	
	// if item is available, change to false and print success.
	// else the item is not available
	public void checkoutItem() {
		if (available) {
			available = false;
			System.out.println("Item '" + title + "' checked out successfully.");
		} else {
			System.out.println("Item '" + title + "' not available.");
		}
	}
	
	// if item is not available, sets as available to return item.
	// else the return is not accepted.
	public void returnItem() {
		if (!available) {
			available = true;
			System.out.println("Item '" + title + "' returned successfully.");
		} else {
			System.out.println("Item '" + title + "' not accepted.");
		}
	}
	
	// returns boolean available value
	public boolean isAvailable() {
		return available;
	}
	
	// returns the itemId int value
	public int getItemId() {
		return itemId;
	}
	
	public String toString() {
		return "Title: " + title + ", Creator: " + creator + ", itemID: " + getItemId() + ", isAvailable: " + isAvailable();
	}
}