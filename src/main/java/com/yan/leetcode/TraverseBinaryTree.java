package com.yan.leetcode;

public class TraverseBinaryTree {

	public static void main(String[] args) {

		Node head = new Node(1);
		head.left = new Node(2);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right = new Node(3);
		head.right.right = new Node(6);

		preOrder(head);
		System.out.println();

		inOrder(head);
		System.out.println();

		posOrder(head);
		System.out.println();

	}

	private static void preOrder(Node head) {
		if (head == null)
			return;
		System.out.print(head.value + " ");
		preOrder(head.left);
		preOrder(head.right);
	}

	private static void inOrder(Node head) {
		if (head == null)
			return;
		inOrder(head.left);
		System.out.print(head.value + " ");
		inOrder(head.right);
	}

	private static void posOrder(Node head) {
		if (head == null)
			return;
		posOrder(head.left);
		posOrder(head.right);
		System.out.print(head.value + " ");
	}

}
