package lib;

import java.util.ArrayList;

public class Library {
	private final ArrayList<LibraryItem> items;
	private final ArrayList<LibraryMember> members;
	
	public Library() {
		items = new ArrayList<>();
		members = new ArrayList<>();
	}
	
	public void addItem(LibraryItem item) {
		items.add(item);
	}
	
	public void addMember(LibraryMember member) {
		members.add(member);
	}
	
	public LibraryMember getMember(int memberId) {
		for (LibraryMember mem : members) {
			if (memberId == mem.getMemberId()) return mem;
		}
		return null;
	}
	
	public LibraryItem getItem(int itemId) {
		for (LibraryItem item : items) {
			if (itemId == item.getItemId()) return item;
		}
		return null;
	}
	
	public String toString() {
		return "Library items: " + items + ", Library members: " + members;
	}
	
}
