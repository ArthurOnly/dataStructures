package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dataStructures.Stack;

class StackTest {

    @Test
    void push_top() {
    	Stack stack = new Stack();
    	stack.push(8);
        assertEquals(8, stack.top());
    }
    
    @Test
    void pop() {
    	Stack stack = new Stack();
    	stack.push(8);
    	int n = stack.pop();
        assertEquals(8, n);
        assertEquals(0, stack.size());
    }

}