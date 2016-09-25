package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class MajorityElement3 {
    @Test
    public void test() {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] num) {
        int maj = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                maj = num[i];
                count++;
            } else if (num[i] == maj) {
                count++;
                if (count > num.length / 2)
                    return maj;
            } else
                count--;
        }
        return maj;
    }
}
