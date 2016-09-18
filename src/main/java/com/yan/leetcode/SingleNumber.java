package com.yan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Single Number
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 16:20
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i]))
                numSet.remove(nums[i]);
            else
                numSet.add(nums[i]);
        }
        return numSet.iterator().next();
    }

    /**
     * 这个方法碉堡了
     *
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int record = nums[0];
        for (int i = 1; i < len; i++)
            record = record ^ nums[i];
        return record;
    }
}
