package lib;

import java.util.Arrays;

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
		System.out.println("old array length b4 copy" + items.length);
		itemsLength *= 2;
		items = new LibraryItem[itemsLength];
		System.out.println("new array length b4 copy" + items.length);
		System.arraycopy(itemsCopy, 0, items, 0, itemsCopy.length);
		System.out.println("new array length " + items.length);
	}
	
	public void resizeMemArr() {
		LibraryMember[] membersCopy = members;
		System.out.println("old array length b4 copy" + members.length);
		membersLength *= 2;
		members = new LibraryMember[membersLength];
		System.out.println("new array length b4 copy" + members.length);
		System.arraycopy(membersCopy, 0, members, 0, membersCopy.length);
		System.out.println("new array length " + members.length);
	}
	
	public void addItem(LibraryItem item) {
		if (itemsCount == itemsLength) {
			resizeLibArr();
		}
		items[itemsCount] = item;
		if (itemsCount == 2) System.out.println(items[0] + " X" + items[1] + "X " + items[2] + " X" + items[3]);
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
		return "Library items: " + Arrays.toString(items) + ", Library members: " + Arrays.toString(members);
	}
	
}
