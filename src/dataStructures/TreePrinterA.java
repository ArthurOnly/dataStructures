package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TreePrinterA {
    static final int COUNT = 10;

    static void printRec(TreeNode root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        printRec(root.getRightChild(), space);

        // Print current TreeNode after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getElement() + "\n");

        // Process left child
        printRec(root.getLeftChild(), space);
    }

    // Wrapper over printRec()
    static void print(TreeNode root) {
        // Pass initial space count as 0
        printRec(root, 0);
    }
}
