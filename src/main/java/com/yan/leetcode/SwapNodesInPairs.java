package com.yan.leetcode;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		head = swapPairs(head);

		System.out.println(head);

	}

	private static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 负责结果
		ListNode result = new ListNode(0);
		// 负责结果的指针
		ListNode p = result;
		// head负责原来链表的指针
		while (head != null) {
			ListNode nextNode = head.next;
			if (nextNode == null) {
				p.next = head;
				break;
			}

			p.next = nextNode;
			head.next = nextNode.next;
			nextNode.next = head;

			head = head.next;
			p = p.next.next;

		}

		return result.next;
	}

}
