/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: RemoveNthNodeFromEndOfList
 * @author Yanjingyang
 * @date 2016年8月16日 下午3:26:19
 * @version 1.0
 */
public class RemoveNthNodeFromEndOfList {

	/**
	 * @Description: main
	 * @date 2016年8月16日 下午3:26:19
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		
		System.out.println(node);

		node = removeNthFromEnd(node, 2);
		
		System.out.println(node);
	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = head;
		ListNode second = head;
		if (head.next == null)
			return null;
		while (n != 0) {
			first = first.next;
			n--;
		}
		if (first == null)
			return head.next;
		while (first.next != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return head;
	}

}