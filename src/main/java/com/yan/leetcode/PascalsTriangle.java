package com.yan.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle
 *
 * @author jingyangyan
 * @version 1.0
 * @create 2016-09-06 17:40
 */
public class PascalsTriangle {

    @Test
    public void test() {
        System.out.println(generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (numRows == 0)
            return res;
        list.add(1);
        res.add(list);
        while (--numRows > 0) {
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for (int i = 1; i < list.size(); i++) {
                newList.add(list.get(i) + list.get(i - 1));
            }
            newList.add(1);
            res.add(newList);
            list = newList;
        }
        return res;
    }
}
