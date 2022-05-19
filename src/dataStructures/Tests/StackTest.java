package dataStructures.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dataStructures.Stack;
import dataStructures.StackLinkedList;

class StackTest {

    @Test
    void push_top() {
    	StackLinkedList stack = new StackLinkedList();
    	stack.push(8);
        assertEquals(8, stack.top());
    }
    
    @Test
    void pop() {
    	StackLinkedList stack = new StackLinkedList();
    	stack.push(8);
    	Object n = stack.pop();
        assertEquals(8, n);
        assertEquals(0, stack.size());
    }

}