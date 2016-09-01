package com.yan.leetcode;

import java.util.Arrays;

/**
 * Reverse String
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-01 8:51
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 效率次之
     *
     * @param s
     * @return
     */
    public String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseString3(String s) {
        char[] array = s.toCharArray();
        String reverse = "";  //注意这是空串，不是null
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];
        return reverse;
    }

    /**
     * 效率最高
     *
     * @param s
     * @return
     */
    public String reverseString4(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }

        return new String(chars);
    }
}
