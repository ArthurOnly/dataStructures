package dataStructures.linked_list;

public class Node {
	Node next;
	Object item;
	
	public Node(Object item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	public Node(Object item) {
		this.item = item;
		this.next = null;
	}
}
