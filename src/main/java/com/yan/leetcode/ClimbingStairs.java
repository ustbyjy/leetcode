package com.yan.leetcode;

import org.junit.Test;

/**
 * Climbing Stairs
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-08-31 15:41
 */
public class ClimbingStairs {
    @Test
    public void test() {
        System.out.println(climbStairs(3));
    }

    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
