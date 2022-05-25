package dataStructures;

import dataStructures.linked_list.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
            StackOfQueues st = new StackOfQueues();
            st.push(1);
            st.push(2);
            System.out.println(st.top());
            st.pop();
            System.out.println(st.top());
            st.pop();
            st.pop();
		/*QueueOfStacks ql = new QueueOfStacks();
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
		ql.dequeue();
		System.out.println(ql.first());*/
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
		/*StackRedBlack stack = new StackRedBlack();
		System.out.println(stack.sizeBlack());
		stack.pushRed(5);
		stack.pushRed(6);
		stack.pushRed(7);
		stack.pushRed(8);
		stack.pushRed(9);
		stack.pushRed(10);
		stack.pushBlack(3);
		System.out.println(stack.sizeBlack());
		System.out.println(stack.sizeRed());
		stack.printBlack();
		System.out.println();
		stack.printRed();*/
		
		//System.out.print(stack.isEmptyBlack());
		//System.out.print(stack.isEmptyRed());
		//stack.pushRed(5);
		//stack.pushRed(6);
		//stack.popRed();
		//stack.popRed();
		//System.out.print(stack.isEmptyRed());
		
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
