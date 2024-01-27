package lib;

import java.util.ArrayList;

public class LibraryMember {
	String name;
	String address;
	String contact;
	int memberId;
	ArrayList<LibraryItem> borrowedItems;
	double fines;
	
	public LibraryMember(String name, String address, String contact, int memberId) {
		borrowedItems = new ArrayList<>();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.memberId = memberId;
		fines = 0;
	}
	
	public void borrowItem(LibraryItem item) {
		borrowedItems.add(item);
	}
	
	public void returnItem(LibraryItem item) {
		borrowedItems.remove(item);
	}
	
	public int getMemberId() { return memberId; }
	
	public String toString() {
		return "Name: " + name + ", Address: " + address +
						", Contact: " + contact + ", Member ID: " + memberId +
						", Borrowed Items: " + borrowedItems + ", Fines: " + fines;
	}
	

}
