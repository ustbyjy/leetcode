package com.yan.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/25.
 */
public class MajorityElement {
    @Test
    public void test() {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                if ((count + 1) > nums.length / 2)
                    return nums[i];
                else {
                    count++;
                    map.put(nums[i], count);
                }
            } else
                map.put(nums[i], 1);
        }
        int count = 0, result = -1;
        for (Integer key : map.keySet()) {
            if (map.get(key) > count) {
                result = key;
                count = map.get(key);
            }
        }
        return result;
    }
}
