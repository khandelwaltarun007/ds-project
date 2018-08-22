package com.ds.tree;

import com.ds.tree.Node;

public class BinarySearchTreeProgram {

	Node root;

	public BinarySearchTreeProgram() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(key, root);
	}

	public Node insertRec(int key, Node root) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertRec(key, root.left);
		} else if (key > root.key) {
			root.right = insertRec(key, root.right);
		}
		return root;
	}

	public void inorder() {
		inorderRec(root);
	}

	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}

	}

	public void delete(int key) {
		root = deleteRec(key, root);
	}

	public Node deleteRec(int key, Node root) {
		if(root==null) {
			System.out.println("No root Node Cannot delete..");
			return root;
		}
		if(key < root.key) {
			root.left = deleteRec(key,root.left);
		} else if(key> root.key) {
			root.right = deleteRec(key, root.right);
		} else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.key = minvalue(root.right);
			root.right = deleteRec(root.key, root.right);
			
		}
		return root;
	}
	
	public int minvalue(Node root) {
		int minval = root.key;
		while(root.left!=null) {
			if(minval> root.left.key) {
				minval = root.left.key;
				root = root.left;
			}
		}
		return minval;
	}

	public static void main(String[] args) {
		BinarySearchTreeProgram treeProgram = new BinarySearchTreeProgram();

		treeProgram.insert(50);
		treeProgram.insert(30);
		treeProgram.insert(20);
		treeProgram.insert(40);
		treeProgram.delete(20);
		treeProgram.insert(70);
		treeProgram.insert(60);
		treeProgram.delete(30);
		treeProgram.insert(80);
		treeProgram.delete(70);
		treeProgram.inorder();
	}
}
