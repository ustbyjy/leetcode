/**
 * 
 */
package com.yan.leetcode;

/**
 * @Description: ZigZagConvertion
 * @author Yanjingyang
 * @date 2016年8月15日 下午4:11:09
 * @version 1.0
 */
public class ZigZagConvertion {

	/**
	 * @Description: main
	 * @date 2016年8月15日 下午4:11:09
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(s);
		int numRows = 3;
		String cs = convert(s, numRows);
		System.out.println(cs);
	}

	private static String convert(String s, int numRows) {
		int length = s.length();
		if (length <= numRows || numRows == 1)
			return s;
		char[] chars = new char[length];
		int step = 2 * (numRows - 1);
		int count = 0;
		for (int i = 0; i < numRows; i++) {
			int interval = step - 2 * i;
			for (int j = i; j < length; j += step) {
				chars[count] = s.charAt(j);
				count++;
				if (interval < step && interval > 0 && j + interval < length && count < length) {
					chars[count] = s.charAt(j + interval);
					count++;
				}
			}
		}
		return new String(chars);

	}
}
