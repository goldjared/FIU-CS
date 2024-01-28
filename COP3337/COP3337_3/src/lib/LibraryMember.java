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
	
	public int getBorrowedItemIndex(int itemId) {
		for (int i = 0; i < borrowedItemsCount; i++) {
			if (borrowedItems[i].getItemId() == itemId) return i;
		}
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
