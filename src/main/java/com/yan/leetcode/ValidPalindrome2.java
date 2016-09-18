package com.yan.leetcode;

import org.junit.Test;

/**
 * Valid Palindrome
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-18 15:45
 */
public class ValidPalindrome2 {

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
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < s.length() - 1 && !isAlphaandNum(chars[i]))
                i++;
            char left = chars[i];
            while (j > 0 && !isAlphaandNum(chars[j]))
                j--;
            char right = chars[j];

            if (i >= j)
                break;

            if (!isSame(left, right))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlphaandNum(char a) {
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a >= '0' && a <= '9')
            return true;
        return false;
    }

    public boolean isSame(char a, char b) {
        if (Character.toLowerCase(a) == Character.toLowerCase(b) || a == b)
            return true;
        return false;
    }

}
