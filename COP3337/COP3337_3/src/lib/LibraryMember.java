package lib;

import java.util.Arrays;

public class LibraryMember {
	String name;
	String address;
	String contact;
	int memberId;
	LibraryItem[] borrowedItems;
	int borrowedItemsLength;
	int borrowedItemsCount;
	double fines;
	
	// LibMember constructor, initializes array length to 20, and items count to 0.
	// in order to keep track of when the array fills up.
	public LibraryMember(String name, String address, String contact, int memberId) {
		borrowedItemsLength = 20;
		borrowedItemsCount = 0;
		borrowedItems = new LibraryItem[borrowedItemsLength];
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.memberId = memberId;
		fines = 0;
	}
	
	// creates copy of array, doubles length of class array length,
	// initiates class array as new length, copies the copy array from start to end, into doubled array
	public void resizeBorrowedArr() {
		LibraryItem[] borrowedCopy = borrowedItems;
		borrowedItemsLength *= 2;
		borrowedItems = new LibraryItem[borrowedItemsLength];
		System.arraycopy(borrowedCopy, 0, borrowedItems, 0, borrowedCopy.length);
	}
	
	public void borrowItem(LibraryItem item) {
		if (borrowedItemsCount == borrowedItemsLength) {
			resizeBorrowedArr();
		}
		borrowedItems[borrowedItemsCount] = item;
		borrowedItemsCount++;
	}
	
	// searches borrowedItem array for itemId, returns arrays index location if item found
	// else returns -1 for non-existing
	public int getBorrowedItemIndex(int itemId) {
		// search goes to itemsCount instead of length, since the length may contain null values
		for (int i = 0; i < borrowedItemsCount; i++) {
			if (borrowedItems[i].getItemId() == itemId) return i;
		}
		// return value will be -1 if the item does not exist in array
		return -1;
	}
	
	public void returnItem(int index) {
		LibraryItem[] borrowedItemsCopy = new LibraryItem[borrowedItemsLength - 1];
		System.arraycopy(borrowedItems, 0, borrowedItemsCopy, index, index);
		System.arraycopy(borrowedItems, index + 1, borrowedItemsCopy, index, borrowedItemsLength - index - 1);
		borrowedItems = borrowedItemsCopy;
		borrowedItemsLength--;
		borrowedItemsCount--;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public String toString() {
		return "Name: " + name + ", Address: " + address +
						", Contact: " + contact + ", Member ID: " + memberId +
						", Borrowed Items: " + Arrays.toString(borrowedItems) + ", Fines: " + fines;
	}
	
	
}
