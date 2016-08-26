package com.yan.leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int[] nums2 = { 1 };
		System.out.println("new length: " + removeElement2(nums, 3));
		System.out.println("new length: " + removeElement2(nums2, 1));
	}

	private static int removeElement(int[] nums, int val) {
		int count = 0, temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				count++;
			} else if (count > 0) {
				temp = nums[i - count];
				nums[i - count] = nums[i];
				nums[i] = temp;
			}
		}

		for (int i = 0; i < nums.length - count; i++) {
			System.out.println(nums[i] + " ");
		}

		return nums.length - count;
	}

	private static int removeElement2(int[] nums, int val) {
		int begin = 0;
		int end = nums.length - 1;
		while (begin <= end) {
			if (nums[begin] != val)
				begin++;
			else if (nums[end] == val)
				end--;
			else
				nums[begin++] = nums[end--];
		}

		for (int i = 0; i < nums.length - begin; i++) {
			System.out.println(nums[i] + " ");
		}

		return begin;
	}

	private static int removeElement3(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}

		return i;
	}
}
