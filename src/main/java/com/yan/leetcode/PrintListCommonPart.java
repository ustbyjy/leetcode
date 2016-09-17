package com.yan.leetcode;

import org.junit.Test;

public class PrintListCommonPart {

	@Test
	public void test() {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(4);
		head1.next.next.next = new ListNode(6);
		head1.next.next.next.next = new ListNode(8);
		ListNode head2 = new ListNode(3);
		head2.next = new ListNode(4);
		head2.next.next = new ListNode(8);

		printCommonPart(head1, head2);
	}

	private void printCommonPart(ListNode head1, ListNode head2) {
		System.out.println("Common Part: ");
		while (head1 != null && head2 != null) {
			if (head1.val < head2.val) {
				head1 = head1.next;
			} else if (head1.val > head2.val) {
				head2 = head2.next;
			} else {
				System.out.println(head1.val + " ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		System.out.println();
	}
}
