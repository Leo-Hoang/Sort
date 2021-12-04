package com.sparta.sort;

import java.util.ArrayList;

public class TreeSort implements Sort{

    // Inner Node Class
    class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    // Attributes
    private Node root;
    private int[] treeArray;
    private int[] treeList;
    private int counter = -1;
    public TreeSort() { root = null;} // Constructor

    private Node insertRecursive(Node root, int value)
    {
        // Tree is empty...
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        // Insert
        if (value <= root.value) root.left = insertRecursive(root.left, value);
        else if (value > root.value) root.right = insertRecursive(root.right, value);
        return root;
    }

    private void traverseArray(Node root)
    {
        if (root != null)
        {
            traverseArray(root.left);
            counter++;
            treeArray[counter] = root.value;
            traverseArray(root.right);
        }
    }

    public void sort(int[] array)
    {
        treeArray = new int[array.length];
        for(int i = 0; i < array.length; i++) root = insertRecursive(root, array[i]);
        traverseArray(root);

        // Reset class
        root = null;
        counter = -1;

        for (int i=0; i < treeArray.length; i++) array[i] = treeArray[i];
    }

    public void sort(ArrayList<Container> list) {

    }


}

