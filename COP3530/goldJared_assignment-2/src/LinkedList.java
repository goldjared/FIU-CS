// LL uses generic to accept any types
public class LinkedList<T> {
	
	// Inner class Node, uses generic to accept any types
	static class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// LinkedList member values
	Node<T> head;
	
	LinkedList() {
		this.head = null;
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	// Reverse the linked list by copying next node
	public void reverse() {
		Node<T> previous = null;
		Node<T> current = head;
		Node<T> next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	// Print the linked list
	public void printList() {
		Node<T> current = head;
		System.out.print("[");
		while (current != null) {
			if(current.next == null) System.out.print(current.data);
			else System.out.print(current.data + ", ");
			
			current = current.next;
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Test list 1, int
		LinkedList<Integer> list = new LinkedList<>();
		// Fill list with ints
	  for(int i = 0; i < 9; i++) list.add(i);
		
		System.out.println("Original list1:");
		list.printList();
		
		list.reverse();
		
		System.out.println("Reversed list1:");
		list.printList();
		
		System.out.println();
		// Test list 2, string
		LinkedList<String> list2 = new LinkedList<>();
		// Fill list with strings
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		
		System.out.println("Original list2:");
		list2.printList();
		
		list2.reverse();
		
		System.out.println("Reversed list2:");
		list2.printList();
		
	}
}
