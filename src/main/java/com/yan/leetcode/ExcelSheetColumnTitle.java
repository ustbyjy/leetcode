package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ExcelSheetColumnTitle {

    @Test
    public void test() {
        int n1 = 3;
        int n2 = 28;
        System.out.println(n1 + "-->" + convertToTitle(n1));
        System.out.println(n2 + "-->" + convertToTitle(n2));
    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n -= 1;
            sb.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }
}
