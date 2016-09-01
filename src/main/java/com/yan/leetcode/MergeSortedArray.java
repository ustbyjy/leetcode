package com.yan.leetcode;

import org.junit.Test;

/**
 * Merge Sorted Array
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-01 9:20
 */
public class MergeSortedArray {

    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    /**
     * 笨办法
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        if (m == 0 || nums2[0] > nums1[m - 1]) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
        }
        int step = 0;
        for (int i = 0; i < m; i++) {
            for (int j = step; j < n; j++) {
                if (nums2[j] <= nums1[i]) {
                    for (int k = m; k > i; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[i] = nums2[j];
                    if (m + 1 < nums1.length)
                        m++;
                    step++;
                    break;
                }
            }
        }
        for (int i = step; i < n; i++) {
            nums1[m + (i - step)] = nums2[i];
        }
    }

    /**
     * 神级方法：从m和n的后面往前遍历
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int j = m - 1;
        int k = n - 1;
        if (m == 0)
            while (k >= 0) {
                nums1[k] = nums2[k];
                k--;
            }
        while (j >= 0 && k >= 0) {
            if (nums1[j] > nums2[k])
                nums1[i--] = nums1[j--];
            else
                nums1[i--] = nums2[k--];
        }
        while (k >= 0) {
            nums1[i--] = nums2[k--];
        }

    }
}
