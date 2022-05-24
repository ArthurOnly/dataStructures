package dataStructures.linked_list;

public class SingleLinkedList {
	Node head;
	Node tail;
	int quantityOfItens;
	
	public SingleLinkedList(){
		this.head = null;
		this.tail = null;
		this.quantityOfItens = 0;
	}
	
	public int size() {
		return this.quantityOfItens;
	}
	
	public void add(Object o) {
		Node item = new Node(o);
		
		if (this.head == null) {
			this.head = item;
			this.tail = item;
		} else {
			this.tail.next = item;
			this.tail = item;
		}
		
		this.quantityOfItens++;
	}
	
	public void removeFirst() {
		if (this.quantityOfItens < 1)
			throw new RuntimeException("Index inválido");
		
		this.head = this.head.next;
		this.quantityOfItens--;
	}
	
	public Object get(int index) throws RuntimeException {
		if (index < 0 || index >= quantityOfItens)
			throw new RuntimeException("Index inválido");
		
		Node node = this.head;
		for (int i = 0; i < index; i++) {
			if (i == index) break;
			node = node.next;
		}
		
		return node.item;	
	}
	
	public Object pop() {
		if (quantityOfItens == 0)
			throw new RuntimeException("Lista ligada vazia");
		
		Node tail = this.tail;		
		if (quantityOfItens == 1) {
			this.head = null;
			this.tail = null;
			this.quantityOfItens--;
			return tail.item;
		}
		
		Node node = this.head;
		for (int i = 1; i < this.quantityOfItens-1; i++) 
			node = node.next;
		
		node.next = null;
		this.tail = node;
		this.quantityOfItens--;
		return tail.item;
	}
	
	public Object top() {
		return this.tail.item;
	}
	
}
