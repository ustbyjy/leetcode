package com.yan.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray3 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		System.out.println("new length: " + removeDuplicates(nums));
	}

	private static int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
				nums[count++] = nums[i];
			}
		}

		return count;
	}
}
