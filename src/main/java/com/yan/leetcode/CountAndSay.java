/**
 * 
 */
package com.yan.leetcode;

import org.junit.Test;

/**
 * @author yan
 *
 */
public class CountAndSay {

	@Test
	public void test() {
		for (int i = 1; i < 5; i++) {
			System.out.println(countAndSay(i));
		}
	}

	private String countAndSay(int n) {
		String str = "1";
		if (n == 1) {
			return str;
		}

		while (--n > 0)
			str = nextSeq(str);

		return str;
	}

	private String nextSeq(String str) {
		StringBuffer nextStr = new StringBuffer();
		int count = 1;
		int i;
		for (i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				nextStr.append(count).append(str.charAt(i - 1));
				count = 1;
			}
		}
		nextStr.append(count).append(str.charAt(i - 1));
		return nextStr.toString();

	}
}
