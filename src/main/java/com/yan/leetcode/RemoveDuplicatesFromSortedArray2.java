package com.yan.leetcode;

public class RemoveDuplicatesFromSortedArray2 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
		print(nums);

		System.out.println("new length: " + removeDuplicates(nums));

	}

	private static int removeDuplicates(int[] nums) {
		int[] newNums = new int[10000];
		int newLength = 0;
		for (int i = 0; i < nums.length; i++) {
			if (newLength != 0) {
				if (nums[i] != newNums[newLength - 1]) {
					newNums[newLength] = nums[i];
					newLength++;
				}
			} else {
				newNums[newLength] = nums[i];
				newLength++;
			}
		}

		print(newNums);

		return newLength;
	}

	private static void print(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
