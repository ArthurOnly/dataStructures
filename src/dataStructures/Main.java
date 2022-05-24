package dataStructures;

import dataStructures.linked_list.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		QueueLinkedList ql = new QueueLinkedList();
		ql.enqueue(1);
		ql.enqueue(2);
		ql.enqueue(3);
		System.out.println(ql.first());
		ql.dequeue();
		System.out.println(ql.first());
		ql.enqueue(9);
		System.out.println(ql.first());
		ql.dequeue();
		System.out.println(ql.first());
		//SingleLinkedList lk = new SingleLinkedList();
		//lk.add(1);
		//lk.add(2);
		//lk.add(3);
		//lk.pop();
		
		//Stack stack = new Stack();
		//stack.push(1);
		//stack.push(2);
		//stack.push(3);
		//System.out.println(stack.top());
		//stack.pop();
		//System.out.println(stack.top());
		//StackRedBlack stack = new StackRedBlack();
		//stack.pushBlack(5);
		//for (int i = 1; i < 17; i++) {
		//	stack.pushRed(i);
		//	stack.pushBlack(17-i);
		//}
		//System.out.println(stack.topBlack());
		//Queue f = new Queue();
		//f.enqueue(1);
		//System.out.println(f.first());
		//f.enqueue(2);
		//f.enqueue(3);
		//System.out.println(f.first());
		//f.dequeue();
		//System.out.println(f.first());
		//f.enqueue(1);
		//System.out.println(f.first());
		/*f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		try{
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
		
		}catch(EmptyQueueException erro){
			System.out.println(erro.getMessage());
			
		}*/
	}
	
}
