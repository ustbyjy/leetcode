package com.yan.leetcode;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class CompareVersionNumbers2 {

    @Test
    public void test() {
        String version1 = "1.2";
        String version2 = "13.37";
        System.out.println(compareVersion(version1, version2));
    }

    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");

        int length = Math.max(levels1.length, levels2.length);
        for (int i = 0; i < length; i++) {
            Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }
}
