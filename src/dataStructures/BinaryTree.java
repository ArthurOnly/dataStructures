package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree {
    
    private int IS_SMALLER = -1;
    private int IS_EQUAL = 0;
    private int IS_GREATER = 1;

    private TreeNode root;
    private int tamanho;
    private TreeComparatorNumber comparator;

    public BinaryTree(Object o)
    {
        this.root = new TreeNode(o);
        this.root.setLeftChild(new TreeNode(null, this.root));
        this.root.setRightChild(new TreeNode(null, this.root));
        this.tamanho++;
        this.comparator = new TreeComparatorNumber();
    }

    public int size()
    {
        return this.tamanho;
    }

    public int height()
    {
        int depth = 0;
 
        Iterator el = nos();
 
        while (el.hasNext()) {
            TreeNode v = (TreeNode) el.next();
            if (depth(v) > depth)
                depth = depth(v);
        }
 
        return depth;
    }

    public boolean isEmpty()
    {
        return this.tamanho == 0;
    }

    public Iterator elements()
    {
        ArrayList array = new ArrayList<>();
        this.elementsRec(array, this.root);
        return array.iterator();
    }

    private void elementsRec(ArrayList array, TreeNode node)
    {
        if (node.getElement() == null) return;
        array.add(node.getElement());
        elementsRec(array, node.getLeftChild());
        elementsRec(array, node.getRightChild());
    }

    public Iterator nos()
    {
        ArrayList array = new ArrayList<>();
        this.nosRec(array, this.root);
        return array.iterator();
    }

    private void nosRec(ArrayList array, TreeNode node)
    {
        if (node.getElement() == null) return;
        array.add(node);
        nosRec(array, node.getLeftChild());
        nosRec(array, node.getRightChild());
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

    public TreeNode search(Object o)
    {
        return this.searchRec(o, this.root);
    }

    private TreeNode searchRec(Object key, TreeNode node)
    {
        if (this.isExternal(node) || this.comparator.compare(key, node.getElement()) == IS_EQUAL)
            return node;
        
        else if (this.comparator.compare(key, node.getElement()) == IS_SMALLER)
            return searchRec(key, node.getLeftChild());
        
        return searchRec(key, node.getRightChild());
    }

    public void insert(Object key)
    {
        TreeNode node = this.search(key);
        if (node.getElement() == null){
            node.setElement(key);
            node.setLeftChild(new TreeNode(null, node));
            node.setRightChild(new TreeNode(null, node));
            this.tamanho++;
        }
        else
            throw new IllegalArgumentException("Elemento ja existe");
    }

    public void remove(Object key)
    {
        TreeNode node = this.search(key);
        if (node.getElement() == null)
            throw new IllegalArgumentException("Elemento nao existe");
       
        // se for externo
        if (isExternal(node.getLeftChild()) && isExternal(node.getRightChild())){
            node.setElement(null);
            node.setLeftChild(null);
            node.setRightChild(null);
        } else if (isExternal(node.getLeftChild()) && !isExternal(node.getRightChild())){
            node.setElement(node.getRightChild().getElement());
            node.setLeftChild(null);
            node.setRightChild(node.getRightChild().getRightChild());
        } else if (!isExternal(node.getLeftChild()) && isExternal(node.getRightChild())){
            node.setElement(node.getLeftChild().getElement());
            node.setLeftChild(node.getLeftChild().getLeftChild());
            node.setRightChild(null);
        } else {
            TreeNode aux = node.getRightChild();
            while (aux.getLeftChild().getElement() != null)
                aux = aux.getLeftChild();
            System.out.println(aux.getRootNode());

            node.setElement(aux.getElement());
            aux.setElement(null);

            if (aux.getRightChild().getElement() != null)
                aux.getRootNode().setLeftChild(aux.getRightChild());
                     
            aux.setRightChild(null);
            aux.setLeftChild(null);
        }
    }
    
    public void print()
    {
        //TreePrinter.print(this.root);
        TreePrinterB.print(this);
    }

}
