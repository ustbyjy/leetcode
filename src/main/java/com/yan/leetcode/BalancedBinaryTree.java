package com.yan.leetcode;

import org.junit.Test;

/**
 * 判断是否为平衡二叉树
 * 
 * @author yan
 *
 */
public class BalancedBinaryTree {

	@Test
	public void test() {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		System.out.println(isBalance(head, 0));
		head.left.left = new Node(4);
		head.left.left.left = new Node(5);
		System.out.println(isBalance(head, 0));
	}

	private boolean isBalance(Node head, int l) {
		if (head == null) {
			return true;
		}
		Node left = head.left;
		Node right = head.right;
		int abs = Math.abs(getHeight(left, l) - getHeight(right, l));
		if (isBalance(left, l + 1) && isBalance(right, l + 1) && abs < 1) {
			return true;
		}

		return false;
	}

	private int getHeight(Node head, int l) {
		if (head == null) {
			return l;
		}
		return Math.max(getHeight(head.left, l + 1), getHeight(head.right, l + 1));
	}

}
