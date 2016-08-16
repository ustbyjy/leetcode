/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: LongestCommonPrefix
 * @author Yanjingyang
 * @date 2016年8月16日 下午2:12:56
 * @version 1.0
 */
public class LongestCommonPrefix {

	/**
	 * @Description: main
	 * @date 2016年8月16日 下午2:12:56
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs = { "123456789", "123", "12349853", "1234589634445553" };
		String s = longestCommonPrefix(strs);
		System.out.println(s);
	}

	private static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0 || strs == null)
			return "";

		if (strs.length == 1) {
			return strs[0];
		}

		int minLength = minLength(strs);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < minLength; i++) {
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != strs[0].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(strs[0].charAt(i));
		}

		return sb.toString();
	}

	private static int minLength(String[] strs) {
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (temp > strs[i].length())
				temp = strs[i].length();
		}
		return temp;
	}

}
