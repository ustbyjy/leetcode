/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: PalindromeNumber
 * @author Yanjingyang
 * @date 2016年8月16日 上午11:18:49
 * @version 1.0
 */
public class PalindromeNumber {

	/**
	 * @Description: main
	 * @date 2016年8月16日 上午11:18:49
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 12321;
		int y = 234423;
		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome(y));
	}

	private static boolean isPalindrome(int n) {
		if (n < 0) {
			return false;
		}
		int len = 1;
		// 计算出有多少位
		while ((n / len) >= 10) {
			len *= 10;
		}

		while (n != 0) {
			int left = n / len;
			int right = n % 10;
			if (left != right) {
				return false;
			}
			n = (n % len) / 10;
			len /= 100;
		}

		return true;
	}

}
