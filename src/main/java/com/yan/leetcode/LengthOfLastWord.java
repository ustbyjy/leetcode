package com.yan.leetcode;

import org.junit.Test;

/**
 * Length of Last Word
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-08-31 9:10
 */
public class LengthOfLastWord {

    @Test
    public void test() {
        System.out.println(lengthOfLastWord("a b "));
    }

    private int lengthOfLastWord(String s) {
        if (s == null || "".equals(s))
            return 0;
        boolean flag = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (s.charAt(i) != ' ') {
                flag = true;
                count++;
            } else {
                flag = false;
            }
            if (flag == false && count > 0)
                break;
        }
        return count;
    }
}
