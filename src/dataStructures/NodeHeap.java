package dataStructures;

public class NodeHeap {
    public TreeNode root;
    public int size;
    public TreeNode last;

    public NodeHeap() {
        this.root = new TreeNode(null);
        this.size = 0;
        this.last = this.root;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private TreeNode getInsertionNode()
    {
        TreeNode node = this.last;

        while (node.getRootNode() != this.root)
        {
            node = node.getRootNode();

            right = node.getRightChild();
            if (right == null)
                break;
        }
        if (node == null){
            node.setRightChild(new TreeNode(null));
            return node.getRightChild();
        }
        node = node.getRightChild();
        while (node.getLeftChild() != null)
            node = node.getLeftChild();

        node.setLeftChild(new TreeNode(null));
        return node.getLeftChild();
    }

    public void insert(Object o) {
        TreeNode newNode = new TreeNode(o);
        if (this.isEmpty()) {
            this.root = newNode;
            this.last = newNode;
            this.size++;
            return;
        }

        TreeNode node = getInsertionNode();
        node.setElement(o);
        this.last = node;
        this.size++;
    }
}
