package com.yan.leetcode;

import junit.framework.TestCase;

import org.junit.Test;

public class Print2TreeEdge extends TestCase {

	@Test
	public void test() {
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.right = new Node(4);
		head.right.left = new Node(5);
		head.right.right = new Node(6);
		head.left.right.left = new Node(7);
		head.left.right.right = new Node(8);
		head.right.left.left = new Node(9);
		head.right.left.right = new Node(10);
		head.left.right.right.right = new Node(11);
		head.right.left.left.left = new Node(12);
		head.left.right.right.right.left = new Node(13);
		head.left.right.right.right.right = new Node(14);
		head.right.left.left.left.left = new Node(15);
		head.right.left.left.left.right = new Node(16);

		printEdge1(head);

	}

	private void printEdge1(Node head) {
		if (head == null)
			return;
		int height = getHeight(head, 0);

		Node[][] edgeMap = new Node[height][2];
		setEdgeMap(head, 0, edgeMap);

		for (int i = 0; i < edgeMap.length; i++) {
			System.out.print(edgeMap[i][0].value + " ");
		}

		printLeafNotInMap(head, 0, edgeMap);

		for (int i = edgeMap.length - 1; i != 0; i--) {
			if (edgeMap[i][1] != edgeMap[i][0]) {
				System.out.print(edgeMap[i][1].value + " ");
			}
		}
	}

	private int getHeight(Node head, int l) {
		if (head == null)
			return l;

		return Math.max(getHeight(head.left, l + 1), getHeight(head.right, l + 1));
	}

	private void setEdgeMap(Node h, int l, Node[][] edgeMap) {
		if (h == null)
			return;
		edgeMap[l][0] = edgeMap[l][0] == null ? h : edgeMap[l][0];
		edgeMap[l][1] = h;
		setEdgeMap(h.left, l + 1, edgeMap);
		setEdgeMap(h.right, l + 1, edgeMap);

	}

	private void printLeafNotInMap(Node h, int l, Node[][] edgeMap) {
		if (h == null)
			return;
		if (h.left == null && h.right == null && h != edgeMap[l][0] && h != edgeMap[l][1]) {
			System.out.print(h.value + " ");
		}
		printLeafNotInMap(h.left, l + 1, edgeMap);
		printLeafNotInMap(h.right, l + 1, edgeMap);
	}
}
