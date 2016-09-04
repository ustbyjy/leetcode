package com.yan.leetcode;

import org.junit.Test;

public class ShellSort {

	@Test
	public void test() {
		int[] nums = { 81, 94, 12, 35, 17, 95, 28, 58, 41, 75, 15 };
		print(nums);
		shellSort(nums);
		print(nums);
	}

	public int[] shellSort(int[] nums) {
		int j;
		int temp;
		for (int gap = nums.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < nums.length; i++) {
				temp = nums[i];
				for (j = i; j >= gap; j -= gap) {
					if (temp < nums[j - gap])
						nums[j] = nums[j - gap];
					else
						break;
				}
				nums[j] = temp;
			}
		}

		return nums;
	}

	public void print(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
