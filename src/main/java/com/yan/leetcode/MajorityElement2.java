package com.yan.leetcode;

import org.junit.Test;

/**
 * 使用快排实现，因为有递归调用，所以数组非常大的时候栈溢出
 * Created by Administrator on 2016/9/25.
 */
public class MajorityElement2 {
    @Test
    public void test() {
        int[] nums = {1, 1, 2};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length / 2];
    }

    private void quickSort(int[] nums, int left, int right) {
        int mid;
        if (left < right) {
            mid = partition(nums, left, right);
            // mid为nums.length/2，排序结束
            if (mid == nums.length / 2)
                return;
            quickSort(nums, left, mid - 1);
            quickSort(nums, mid + 1, right);
        }

    }

    private int partition(int[] nums, int left, int right) {
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
