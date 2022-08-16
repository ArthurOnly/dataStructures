package dataStructures;

import java.util.Iterator;

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
        BinaryTree tree = new BinaryTree(6);
        
        //tree.print();

        //slide
        // tree.insert(9);
        // tree.insert(8);
        // tree.insert(2);
        // tree.insert(1);
        // tree.insert(4);
        // tree.insert(3);
        // tree.insert(5);

        tree.insert(9);
        tree.insert(8);
        tree.insert(1);
        tree.insert(-1);
        tree.insert(4);
        tree.insert(2);
        // tree.insert(5);
        // tree.insert(3);
    
        tree.print();

        //tree.remove(1);

        //tree.print();
    }

    public static void TestHashTable()
    {
        HashTable table = new HashTable(2);
        table.insert(1, "Teste");
        table.insert(48, "Teste");
        table.insert(37, "Teste");
        table.insert(22, "Teste");
        table.insert("papai", "Teste");
        table.print();
        System.out.println("Buscando coisa...: "+table.search("Coisa"));
        table.remove("papai");
        System.out.println("Buscando coisa...: "+table.search("Coisa"));
    }

    public static void testHeap()
    {
        Heap heap = new Heap();
        heap.insert(5);
        heap.insert(7);
        heap.insert(9);
        heap.insert(11);
        heap.insert(2);
        heap.insert(3);
        heap.insert(25);
        heap.insert(1);
        heap.insert(30);
        heap.removeMin();
        heap.removeMin();
        heap.removeMin();
        heap.insert(12);
        heap.print();
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
        // testBinaryTree();
        // TestHashTable();
        testHeap();
    }

}
