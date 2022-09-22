package com.BL.BST;

public class BinarySearchTreeMain {
	public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree" +
                 "program");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is adding in root

        root = bst.insert(root, 30);

        root = bst.insert(root, 70);

        bst.print(root);

    }
}
