/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: StringToInteger
 * @author Yanjingyang
 * @date 2016年8月16日 上午10:50:27
 * @version 1.0
 */
public class StringToInteger {

	/**
	 * @Description: main
	 * @date 2016年8月16日 上午10:50:27
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "-  15sfsdf8xcv  53dsf1   ";
		System.out.println(atoi(s));

	}

	private static int atoi(String str) {
		if (str == null || str.length() < 1)
			return 0;

		// trim white spaces
		str = str.trim();

		char flag = '+';

		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;

		// calculate value
		while (str.length() > i) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				result = result * 10 + (str.charAt(i) - '0');
			}
			i++;
		}

		if (flag == '-')
			result = -result;

		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		return (int) result;
	}

}
