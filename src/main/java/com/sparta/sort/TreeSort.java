package com.sparta.sort;

import java.util.ArrayList;

public class TreeSort implements Sort{

    // Inner Node Class
    class Node {
        private int intValue;
        private Container value;
        private Node left;
        private Node right;

        public Node(int intValue) {
            this.intValue = intValue;
            left = null;
            right = null;
        }

        public Node(Container value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Attributes
    private Node root;
    private int[] treeArray;
    private ArrayList<Container> treeList;
    private int counter = -1;
    public TreeSort() { root = null;} // Constructor

    private Node insertRecursive(Node root, int intValue)
    {
        // Tree is empty...
        if (root == null)
        {
            root = new Node(intValue);
            return root;
        }
        // Insert
        if (intValue <= root.intValue) root.left = insertRecursive(root.left, intValue);
        else if (intValue > root.intValue) root.right = insertRecursive(root.right, intValue);
        return root;
    }

    private void traverseArray(Node root)
    {
        if (root != null)
        {
            traverseArray(root.left);
            counter++;
            treeArray[counter] = root.intValue;
            traverseArray(root.right);
        }
    }

    public void sort(int[] array)
    {
        System.out.println("Sorting an Array with Tree Sort...");
        treeArray = new int[array.length];
        for(int i = 0; i < array.length; i++) root = insertRecursive(root, array[i]);
        traverseArray(root);

        for (int i=0; i < treeArray.length; i++) array[i] = treeArray[i];

        // Reset class
        root = null;
        counter = -1;
    }

    public void sort(ArrayList<Container> list) {
        treeList = new ArrayList<>();
        System.out.println("Sorting an Array List with Tree Sort...");
        for(int i = 0; i < list.size(); i++) root = insertRecursive(root, list.get(i));
        traverseList(root);
        for (int i=0; i < treeList.size(); i++) list.set(i, treeList.get(i));

        // Reset class
        root = null;
        counter = -1;
    }

    private Node insertRecursive(Node root, Container value)
    {
        // Tree is empty...
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        // Insert
        if (value.compareTo(root.value) <= 0) root.left = insertRecursive(root.left, value);
        else if (value.compareTo(root.value) > 0) root.right = insertRecursive(root.right, value);
        return root;
    }

    private void traverseList(Node root)
    {
        //System.out.println(treeList.toString());
        if (root != null)
        {
            traverseList(root.left);
            treeList.add(root.value);
            traverseList(root.right);
        }
    }
}

