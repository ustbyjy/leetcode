package com.yan.leetcode;

import org.junit.Test;

/**
 * 判断是否为平衡二叉树
 * 
 * @author yan
 *
 */
public class BalancedBinaryTree2 {

	@Test
	public void test() {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		System.out.println(isBalance(head));
		head.left.left = new Node(4);
		head.left.left.left = new Node(5);
		System.out.println(isBalance(head));
	}

	private boolean isBalance(Node head) {
		boolean[] res = new boolean[1];
		res[0] = true;
		getHeight(head, 1, res);
		return res[0];
	}

	private int getHeight(Node head, int level, boolean[] res) {
		if (head == null) {
			return level;
		}
		int lH = getHeight(head.left, level + 1, res);
		if (!res[0]) {
			return level;
		}
		int rH = getHeight(head.right, level + 1, res);
		if (!res[0]) {
			return level;
		}
		if (Math.abs(lH - rH) > 1) {
			res[0] = false;
		}
		return Math.max(lH, rH);
	}

}
