package dataStructures;

public class Main {

	public static void main(String[] args) {
		//Stack stack = new Stack();
		//stack.push(1);
		//stack.push(2);
		//stack.push(3);
		//System.out.println(stack.top());
		//stack.pop();
		//System.out.println(stack.top());
		StackRedBlack stack = new StackRedBlack();
		//stack.pushBlack(5);
		for (int i = 1; i < 17; i++) {
			stack.pushRed(i);
			stack.pushBlack(17-i);
		}
		System.out.println(stack.topBlack());
	}
	
}
