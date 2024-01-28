package lib;

public class Library {
	private LibraryItem[] items;
	private int itemsLength;
	private int itemsCount;
	private LibraryMember[] members;
	private int membersLength;
	private int membersCount;
	
	public Library() {
		itemsCount = 0;
		itemsLength = 2;
		items = new LibraryItem[itemsLength];
		
		membersCount = 0;
		membersLength = 2;
		members = new LibraryMember[membersLength];
	}
	
	public void resizeLibArr() {
		LibraryItem[] itemsCopy = items;
		itemsLength *= 2;
		items = new LibraryItem[itemsLength];
		System.arraycopy(itemsCopy, 0, items, 0, itemsCopy.length);
	}
	
	public void resizeMemArr() {
		LibraryMember[] membersCopy = members;
		membersLength *= 2;
		members = new LibraryMember[membersLength];
		System.arraycopy(membersCopy, 0, members, 0, membersCopy.length);
	}
	
	public void addItem(LibraryItem item) {
		if (itemsCount == itemsLength) {
			resizeLibArr();
		}
		items[itemsCount] = item;
		itemsCount++;
	}
	
	public void addMember(LibraryMember member) {
		if (membersCount == membersLength) {
			resizeMemArr();
		}
		members[membersCount] = member;
		membersCount++;
	}
	
	public LibraryMember getMember(int memberId) {
		for (int i = 0; i < membersCount; i++) {
			if (memberId == members[i].getMemberId()) return members[i];
		}
		
		return null;
	}
	
	public LibraryItem getItem(int itemId) {
		for (int i = 0; i < itemsCount; i++) {
			if (itemId == items[i].getItemId()) return items[i];
		}
		
		return null;
	}
	
	public String toString() {
		return "Items: " + itemsCount + "; Members: " + membersCount;
	}
	
}
