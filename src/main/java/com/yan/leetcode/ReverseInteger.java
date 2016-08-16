/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: TODO
 * @author Yanjingyang
 * @date 2016年8月16日 上午10:17:53
 * @version 1.0
 */
public class ReverseInteger {

	/**
	 * @Description: TODO
	 * @date 2016年8月16日 上午10:17:53
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 123;
		int y = -123;
		System.out.println(reverse(x));
		System.out.println(reverse(y));
	}

	private static int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return 0;
		}

		return (int) (result);
	}

}
