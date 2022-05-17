package dataStructures;

import dataStructures.Exceptions.EmptyQueueException;

public class Main {

	public static void main(String[] args) {
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
		Queue f = new Queue(5); //criando fila tamnho 1 e duplicação
		f.enqueue(1);
		f.enqueue(2);
		System.out.println(f.first());
		f.dequeue();
		System.out.println(f.first());
		f.enqueue(1);
		System.out.println(f.first());
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
