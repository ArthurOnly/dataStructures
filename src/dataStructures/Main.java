package dataStructures;

import java.util.Iterator;
<<<<<<< HEAD

import dataStructures.SimpleTree.No;
import dataStructures.linked_list.SingleLinkedList;
=======
>>>>>>> 8aa05dee5c7fdd93174a358b956d039029dee6ab

import dataStructures.linked_list.SingleLinkedList;

public class Main {

    public static void testVector() {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.insert(i);
        v.print();
        v.replaceAt(3, 30);
        v.print();
        System.out.println(v.size());
        v.insertAt(5, 80);
        v.print();
        v.removeAt(5);
        v.print();
    }

    public static void testVectorLinkedList() {
        VectorLinkedList v = new VectorLinkedList();
        for (int i = 0; i < 10; i++)
            v.insert(i);
        v.print();
        v.replaceAt(3, 30);
        v.print();
        System.out.println(v.size());
        v.insertAt(5, 80);
        v.print();
        v.removeAt(5);
        v.print();
    }

    public static void testQueueVector() {
        QueueVector ql = new QueueVector();
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
        System.out.println(ql.first());
    }

    public static void testStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }

    public static void testStackOfQueues() {
        StackOfQueues st = new StackOfQueues();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        st.pop();
    }

    public static void testStackRedBlack() {
        StackRedBlack stack = new StackRedBlack();
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
        stack.printRed();
        System.out.print(stack.isEmptyBlack());
        System.out.print(stack.isEmptyRed());
        stack.pushRed(5);
        stack.pushRed(6);
        stack.popRed();
        stack.popRed();
        System.out.print(stack.isEmptyRed());

        for (int i = 1; i < 17; i++) {
            stack.pushRed(i);
            stack.pushBlack(17 - i);
        }

        System.out.println(stack.topBlack());
    }

    public static void testQueue() {
        Queue f = new Queue();
        f.enqueue(1);
        System.out.println(f.first());
        f.enqueue(2);
        f.enqueue(3);
        System.out.println(f.first());
        f.dequeue();
        System.out.println(f.first());
        f.enqueue(1);
        System.out.println(f.first());
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
    }

    public static void testQueueOfStacks() {
        QueueOfStacks f = new QueueOfStacks();
        f.enqueue(1);
        System.out.println(f.first());
        f.enqueue(2);
        f.enqueue(3);
        System.out.println(f.first());
        f.dequeue();
        System.out.println(f.first());
        f.enqueue(1);
        f.dequeue();
        System.out.println(f.first());
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
        System.out.println(f.first());
    }

    public static void testSequence() {
        Sequence l = new Sequence();
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.insertFirst(8);
        l.insertFirst(9);
        l.insertFirst(10);
        l.print();
        System.out.println("Size: " + l.size());
        System.out.println("Is empty: " + l.isEmpty());
        // System.out.println("Is first: " + l.isFirst(1));
        // System.out.println("Is last: " + l.isLast(10));
        System.out.println("First: " + l.first());
        System.out.println("Last: " + l.last());
        System.out.println("Before: " + l.before(1));
        System.out.println("After: " + l.after(10));
        l.replaceElement(1, 11);
        l.print();
        l.swapElements(11, 10);
        l.print();
        l.insertBefore(5, 12);
        l.print();
        l.insertAfter(5, 13);
        l.print();
        l.remove(10);
        l.print();
    }

    public static void testList() {
        List l = new List();
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.insertFirst(8);
        l.insertFirst(9);
        l.insertFirst(10);
        l.print();
        System.out.println("Size: " + l.size());
        System.out.println("Is empty: " + l.isEmpty());
        System.out.println("Is first: " + l.isFirst(1));
        System.out.println("Is last: " + l.isLast(10));
        System.out.println("First: " + l.first());
        System.out.println("Last: " + l.last());
        System.out.println("Before: " + l.before(1));
        System.out.println("After: " + l.after(10));
        l.replaceElement(1, 11);
        l.print();
    }

    public static void testListLinkedList() {
        ListLinkedList l = new ListLinkedList();
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertFirst(6);
        l.insertFirst(7);
        l.insertFirst(8);
        l.insertFirst(9);
        l.insertFirst(10);
        l.print();
        System.out.println("Size: " + l.size());
        System.out.println("Is empty: " + l.isEmpty());
        System.out.println("Is first: " + l.isFirst(1));
        System.out.println("Is last: " + l.isLast(10));
        System.out.println("First: " + l.first());
        System.out.println("Last: " + l.last());
        System.out.println("Before: " + l.before(1));
        System.out.println("After: " + l.after(10));
        l.replaceElement(1, 11);
        l.print();
    }

    public static void testBinaryTree() {
        BinaryTree tree = new BinaryTree(1);
        Iterator treeElements = tree.elements();
        while (treeElements.hasNext())
            System.out.print(treeElements.next() + " ");
        System.out.println();
        System.out.println(tree.search(1, tree.root()));
    }

    public static void main(String[] args) {
        // testVectorLinkedList();
        // System.out.println();
        // testVector();
        // testQueueVector();
        // testStack();
        // testStackOfQueues();
        // testQueueOfStacks();
        // testStackRedBlack();
        // testQueue();
        // testSequence();
        // testList();
        // testListLinkedList();
        testBinaryTree();
    }

}
