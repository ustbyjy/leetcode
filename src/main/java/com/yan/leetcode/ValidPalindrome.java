package com.yan.leetcode;

import org.junit.Test;

/**
 * Valid Palindrome
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 15:45
 */
public class ValidPalindrome {

    @Test
    public void test() {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println("s1: " + isPalindrome(s1));
        System.out.println("s2: " + isPalindrome(s2));
    }

    public boolean isPalindrome(String s) {
        if (s == null)
            return false;
        s = s.replace(" ", "").toLowerCase();
        if (s.length() <= 1)
            return true;

        int left = 0, right = s.length() - 1;
        while (left < right) {
            String leftStr = String.valueOf(s.charAt(left));
            if (leftStr.matches("[a-z]|[A-Z]|[0-9]")) {
                String rightStr = String.valueOf(s.charAt(right));
                if (rightStr.matches("[a-z]|[A-Z]|[0-9]")) {
                    if (!leftStr.equals(rightStr))
                        return false;
                    left++;
                    right--;
                    continue;
                } else {
                    right--;
                    continue;
                }
            } else {
                left++;
                continue;
            }
        }
        return true;
    }

}
