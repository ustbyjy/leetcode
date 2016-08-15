package com.yan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TwoSum
 * @author Yanjingyang
 * @date 2016年8月15日 下午4:11:18
 * @version 1.0
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = twoSum2(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println("index: " + result[i] + ", num: " + nums[i]);
		}

	}

	/**
	 * @Description: 最笨办法，时间复杂度o(n2)
	 * @date 2016年8月15日 下午3:14:57
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[] twoSum1(int[] nums, int target) {
		int[] result = {};
		outter: for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					break outter;
				}
			}
		}
		return result;
	}

	/**
	 * @Description: 时间复杂度o(n)，但有一定的空间开销
	 * @date 2016年8月15日 下午3:27:25
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) != null) {
				int[] result = { map.get(numbers[i]), i };
				return result;
			}
			map.put(target - numbers[i], i);
		}

		int[] result = {};
		return result;
	}

}
