package com.yan.leetcode;

public class ImplementstrStr {

	public static void main(String[] args) {
		String haystack = "dsfewrhsfewrdfsdf";
		String needle = "ewr";
		System.out.println(strStr(haystack, needle));
	}

	private static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0) {
			return 0;
		}
		if (needle.length() > haystack.length()) {
			return -1;
		}
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (needle.equals(haystack.substring(i, i + needle.length()))) {
				return i;
			}
		}
		return -1;
	}

	private static int strStr2(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		if (needle.length() > haystack.length())
			return -1;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			boolean successFlag = true;
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					successFlag = false;
					break;
				}
			}
			if (successFlag)
				return i;
		}
		return -1;
	}

}
