package dataStructures;

public class TreeNode {

    private Object element;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode rootNode;

    public TreeNode(Object o)
    {
        this.element = o;
    }

	public TreeNode(Object o, TreeNode node)
    {
        this.element = o;
        this.rootNode = node;
    }

    public void setElement(Object o)
    {
        this.element = o;
    }

    public Object getElement()
    {
        return this.element;
    }

    public void setLeftChild(TreeNode node)
    {
        this.leftChild = node;
    }

    public TreeNode getLeftChild()
    {
        return this.leftChild;
    }

    public void setRightChild(TreeNode node)
    {
        this.leftChild = node;
    }

    public TreeNode getRightChild()
    {
        return this.rightChild;
    }

    public void setRootNode(TreeNode node)
    {
        this.rootNode = node;
    }

    public TreeNode getRootNode()
    {
        return this.rootNode;
    }
}
