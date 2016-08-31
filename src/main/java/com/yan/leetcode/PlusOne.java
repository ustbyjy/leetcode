package com.yan.leetcode;

import org.junit.Test;

/**
 * Plus One
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-08-31 10:57
 */
public class PlusOne {
    @Test
    public void test() {
        int[] digits = new int[]{9, 9, 9, 9, 9, 9, 9};
        print(digits);
        int[] newDigits = plusOne(digits);
        print(newDigits);
    }

    public int[] plusOne(int[] digits) {
        int[] newDigits = digits;
        int ahead = 1;
        for (int i = digits.length - 1; i > 0; i--) {
            digits[i] += ahead;
            if (digits[i] > 9) {
                digits[i] -= 10;
                ahead = 1;
            } else {
                ahead = 0;
            }
        }
        digits[0] += ahead;
        if (digits[0] > 9) {
            digits[0] -= 10;
            ahead = 1;
            newDigits = new int[digits.length + 1];
            newDigits[0] = ahead;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
        }

        return newDigits;
    }

    private void print(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
    }
}
