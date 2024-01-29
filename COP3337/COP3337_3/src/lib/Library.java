package lib;

public class Library {
	// member values, each array has a length and count value
	// to keep track of when the array is filled for resizing purposes, and since the array
	// can contain null values, the count ignores the null values.
	private LibraryItem[] items;
	private int itemsLength;
	private int itemsCount;
	private LibraryMember[] members;
	private int membersLength;
	private int membersCount;
	
	// library constructor, initializes both arrays with length 20, and count 0.
	// count 0 in order to keep track of how many values are in array, and when the arrays
	// are filled.
	public Library() {
		itemsCount = 0;
		itemsLength = 20;
		items = new LibraryItem[itemsLength];
		
		membersCount = 0;
		membersLength = 20;
		members = new LibraryMember[membersLength];
	}
	
	// creates copy of array, doubles length of class array length,
	// initiates class array as new length, copies the copy array from start to end, into doubled array
	public void resizeLibArr() {
		LibraryItem[] itemsCopy = items;
		itemsLength *= 2;
		items = new LibraryItem[itemsLength];
		System.arraycopy(itemsCopy, 0, items, 0, itemsCopy.length);
	}
	
	// creates copy of array, doubles length of class array length,
	// initiates class array as new length, copies the copy array from start to end, into doubled array
	public void resizeMemArr() {
		LibraryMember[] membersCopy = members;
		membersLength *= 2;
		members = new LibraryMember[membersLength];
		System.arraycopy(membersCopy, 0, members, 0, membersCopy.length);
	}
	
	public void addItem(LibraryItem item) {
		// if the array is full, call resize method to double array
		if (itemsCount == itemsLength) {
			resizeLibArr();
		}
		// itemsCount value is the current index, since if there is 1 count, it's next
		// index will be 1. since the '1' count value would be at index 0.
		items[itemsCount] = item;
		// increment the itemsCount value
		itemsCount++;
	}
	
	public void addMember(LibraryMember member) {
		// if the array is full, call resize method to double array
		if (membersCount == membersLength) {
			resizeMemArr();
		}
		// membersCount value is the current index, since if there is 1 count, it's next
		// index will be 1. since the '1' count value would be at index 0.
		members[membersCount] = member;
		// increment count
		membersCount++;
	}
	
	// searches member array for a matching member id
	public LibraryMember getMember(int memberId) {
		// loops run to memberCount since the length could have null values
		for (int i = 0; i < membersCount; i++) {
			// if the memberId parameter matches the current iterated member ID in member array
			// return that member object
			if (memberId == members[i].getMemberId()) return members[i];
		}
		// if no match return null
		return null;
	}
	
	public LibraryItem getItem(int itemId) {
		// loops run to itemsCount since the length could have null values
		for (int i = 0; i < itemsCount; i++) {
			// if the itemId parameter matches the current iterated item ID in item array
			// return that item object
			if (itemId == items[i].getItemId()) return items[i];
		}
		
		// if no match return null
		return null;
	}
	
	public String toString() {
		return "Items: " + itemsCount + "; Members: " + membersCount;
	}
	
}
