package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ExcelSheetColumnNumber {
    @Test
    public void test() {
        String s1 = "C";
        String s2 = "AB";
        System.out.println(s1 + "-->" + titleToNumber(s1));
        System.out.println(s2 + "-->" + titleToNumber(s2));
    }

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
//            result += (s.charAt(i) - 64) * Math.pow(26, s.length() - 1 - i);
            result = (s.charAt(i) - 'A' + 1) + result * 26;
        }
        return result;
    }
}
