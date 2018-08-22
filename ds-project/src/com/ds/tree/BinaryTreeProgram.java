package com.ds.tree;

class Node {
	int key;
	Node right, left;

	public Node(int key) {
		this.key = key;
		right = left = null;
	}

}

public class BinaryTreeProgram {

	public static Node root;

	public BinaryTreeProgram() {
		root = null;
	}

	public BinaryTreeProgram(int item) {
		root = new Node(item);
	}

	public static void inorder(Node temp) {
		if (temp == null)
			return;
		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}

	public static void preorder(Node temp) {
		if (temp == null)
			return;
		System.out.print(temp.key + " ");
		preorder(temp.left);
		preorder(temp.right);
	}

	public static void postorder(Node temp) {
		if (temp == null)
			return;
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.key + " ");
	}

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(12);
		root.right = new Node(15);
		root.left.left = new Node(25);
		root.left.right = new Node(5);
		root.left.left.left = new Node(1);
		root.left.left.right = new Node(19);
		root.right.left = new Node(34);
		root.right.right = new Node(78);
		root.right.left.left = new Node(56);
		root.right.left.right = new Node(90);
		root.right.right.left = new Node(17);
		root.right.right.right = new Node(54);
		inorder(root);
	}
}
