package lib;

public class LibraryMember {
	String name;
	String address;
	String contact;
	int memberId;
	LibraryItem[] borrowedItems;
	double fines;
	
	public LibraryMember(String name, String address, String contact, int memberId) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.memberId = memberId;
	}
	
	public void borrowItem(LibraryItem item) {
	
	}
	
	public void returnItem(LibraryItem item) {
	
	}
	
	public String toString() {
	
	}
	

}
