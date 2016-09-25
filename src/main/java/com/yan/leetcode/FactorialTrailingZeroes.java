package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class FactorialTrailingZeroes {

    @Test
    public void test() {
        int n = 6;
        System.out.println(trailingZeroes(n));
    }


    public int trailingZeroes(int n) {
        int count = 0;
        int div = 5;
        while (n > 0) {
            count += n / div;
            n /= div;
        }
        return count;
    }
}
