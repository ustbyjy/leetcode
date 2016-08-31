package com.yan.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Add Binary
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-08-31 12:15
 */
public class AddBinary {

    @Test
    public void test() {
        System.out.println(addBinary("11", "1"));
        StringBuilder sb = new StringBuilder();
        sb.insert(0, 1);
        sb.insert(0, 2);
        System.out.println(sb.toString());
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int sub = Math.abs(a.length() - b.length());
        int ai = 0, bi = 0, ahead = 0;
        if (a.length() > b.length()) {
            for (int i = a.length() - 1; i >= 0; i--) {
                ai = a.charAt(i) - '0';
                bi = i - sub >= 0 ? b.charAt(i - sub) - '0' : 0;
                sb.insert(0, (ahead + ai + bi) % 2);
                ahead = (ahead + ai + bi) / 2;
            }
            if (ahead > 0)
                sb.insert(0, ahead);
        } else {
            for (int i = b.length() - 1; i >= 0; i--) {
                bi = b.charAt(i) - '0';
                ai = i - sub >= 0 ? a.charAt(i - sub) - '0' : 0;
                sb.insert(0, (ahead + ai + bi) % 2);
                ahead = (ahead + ai + bi) / 2;
            }
            if (ahead > 0)
                sb.insert(0, ahead);
        }

        return sb.toString();
    }
}
