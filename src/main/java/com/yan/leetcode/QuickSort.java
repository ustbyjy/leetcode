package com.yan.leetcode;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort {

	@Test
	public void test() {
		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
		quickSort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public void quickSort(int[] nums, int left, int right) {
		int mid;
		if (left < right) {
			mid = partition(nums, left, right);
			quickSort(nums, left, mid - 1);
			quickSort(nums, mid + 1, right);
		}

	}

	public int partition(int[] nums, int left, int right) {
		int point = nums[left];
		while (left < right) {
			while (left < right && nums[right] >= point)
				right--;
			if (left < right)
				nums[left++] = nums[right];
			while (left < right && nums[left] <= point)
				left++;
			if (left < right)
				nums[right--] = nums[left];
		}

		nums[left] = point;

		return left;
	}
}
