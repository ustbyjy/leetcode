package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class CompareVersionNumbers {

    @Test
    public void test() {
        String version1 = "1.2";
        String version2 = "13.37";
        System.out.println(compareVersion(version1, version2));
    }

    public int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");
        int[] nums1 = new int[strings1.length];
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = Integer.parseInt(strings1[i]);
        int[] nums2 = new int[strings2.length];
        for (int i = 0; i < nums2.length; i++)
            nums2[i] = Integer.parseInt(strings2[i]);
        int shorter = Math.min(nums1.length, nums2.length);
        int longer = Math.max(nums1.length, nums2.length);
        int i;
        for (i = 0; i < shorter; i++) {
            if (nums1[i] > nums2[i])
                return 1;
            else if (nums1[i] < nums2[i])
                return -1;
        }
        for (; i < longer; i++) {
            if (nums1.length > nums2.length && nums1[i] != 0)
                return 1;
            else if (nums1.length < nums2.length && nums2[i] != 0)
                return -1;
        }
        return 0;
    }
}
