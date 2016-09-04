package com.yan.leetcode;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {

	@Test
	public void test() {
		int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
		sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public int[] sort(int[] nums, int left, int right) {
		int mid = (left + right) / 2;
		if (left < right) {
			sort(nums, left, mid);
			sort(nums, mid + 1, right);
			mergeSort(nums, left, mid, right);
		}
		return nums;
	}

	public void mergeSort(int[] nums, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= right) {
			temp[k++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
		}

		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		while (j <= right) {
			temp[k++] = nums[j++];
		}

		for (int x = 0; x < temp.length; x++) {
			nums[x + left] = temp[x];
		}
	}
}
