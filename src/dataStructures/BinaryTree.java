package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree {
    
    private int IS_SMALLER = 1;
    private int IS_GREATER = -1;
    private int IS_EQUAL = 0;


    private TreeNode root;
    private int tamanho;
    private TreeComparatorNumber comparator;

    public BinaryTree(Object o)
    {
        this.root = new TreeNode(o);
        this.tamanho++;
        this.comparator = new TreeComparatorNumber();
    }

    public int size()
    {
        return this.tamanho;
    }

    public int height()
    {
        int profundidade = 0;
 
        Iterator el = Nos();
 
        while (el.hasNext()) {
            No v = (No) el.next();
            if (profundidade(v) > profundidade)
                profundidade = profundidade(v);
        }
 
        return profundidade;
    }

    public boolean isEmpty()
    {
        return this.tamanho == 0;
    }

    public Iterator elements()
    {
        ArrayList array = new ArrayList<>();
        this.iterTreeElements(array, this.root);
        return array.iterator();
    }

    private void iterTreeElements(ArrayList array, TreeNode node)
    {
        if (node == null) return;
        array.add(node.getElement());
        iterTreeElements(array, node.getLeftChild());
        iterTreeElements(array, node.getRightChild());
    }

    public Iterator nos()
    {
        ArrayList array = new ArrayList<>();
        this.iterTreeNos(array, this.root);
        return array.iterator();
    }

    private void iterTreeNos(ArrayList array, TreeNode node)
    {
        if (node == null) return;
        array.add(node);
        iterTreeNos(array, node.getLeftChild());
        iterTreeNos(array, node.getRightChild());
    }

    public TreeNode root()
    {
        return this.root;
    }

    public parent(TreeNode node)
    {
        return node.getRootNode();
    }

    public TreeNode leftChild(TreeNode node)
    {
        return node.getLeftChild();
    }

    public TreeNode rightChild(TreeNode node)
    {
        return node.getRightChild();
    }

    public boolean hasLeft(TreeNode node)
    {
        return node.getLeftChild() != null;
    }

    public boolean hasRight(TreeNode node)
    {
        return node.getRightChild() != null;
    }

    public boolean isInternal(TreeNode node)
    {
        return node.getLeftChild() != null || node.getRightChild() != null;
    }

    public boolean isExternal(TreeNode node)
    {
        return node.getLeftChild() == null && node.getRightChild() == null;
    }

    public boolean isRoot(TreeNode node)
    {
        return node == this.root;
    }

    public int depth(TreeNode node)
    {
        if (this.isRoot(node)) return 0;
        return 1 + depth(node.getRootNode());
    }

    public void replace(TreeNode node, Object o)
    {
        node.setElement(o);
    }

    public TreeNode search(Object key)
    {
        return searchRec(key, this.root);
    }

    private TreeNode searchRec(Object key, TreeNode root)
    {
        System.out.println(root.getLeftChild() == null && root.getRightChild() == null);
        if (this.isExternal(root))
            return root;

        if (this.comparator.compare(key, root.getElement()) == this.IS_SMALLER)
            return searchRec(key, root.getLeftChild());

        else if (this.comparator.compare(key, root.getElement()) == this.IS_EQUAL)
            return root;

        else
            return searchRec(key, root.getRightChild());
    }

    public void insert(Object key)
    {
        TreeNode node = this.search(key);
        TreeNode newNode = new TreeNode(key, node);

        if (this.comparator.compare(key, root.getElement()) == this.IS_SMALLER)
            node.setLeftChild(newNode);
        else if (this.comparator.compare(key, root.getElement()) == this.IS_GREATER)
            node.setRightChild(newNode);
    }

    // public void insertRec(Object key, TreeNode node)
    // {       
    //     TreeNode node = this.search(key)
    //     if (node == null) {
    //         node = new TreeNode(key);
    //         this.tamanho++;
    //         return;
    //     }
 
    //     if (this.comparator.compare(key, root.getElement()) == this.IS_SMALLER)
    //         insertRec(key, node.getLeftChild());
    //     else if (this.comparator.compare(key, root.getElement()) == this.IS_GREATER)
    //         insertRec(key, node.getRightChild());
    // }

    public void print()
    {
        TreePrinter.print(this.root);
    }

}
