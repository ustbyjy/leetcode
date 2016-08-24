package com.yan.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		System.out.println("new length: " + removeDuplicates(nums));
	}

	private static int removeDuplicates(int[] nums) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.offer(Integer.MAX_VALUE);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != deque.peekLast()) {
				deque.offer(nums[i]);
			}
		}
		deque.poll();
		System.out.println("new: " + deque);

		return deque.size();
	}
}
