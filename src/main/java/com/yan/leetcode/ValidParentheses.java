package com.yan.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s1 = "()[]{}";
		String s2 = "()";
		String s3 = "([)]";
		String s4 = "(]";
		String s5 = "";

		System.out.println(s1 + ": " + isValid(s1));
		System.out.println(s2 + ": " + isValid(s2));
		System.out.println(s3 + ": " + isValid(s3));
		System.out.println(s4 + ": " + isValid(s4));
		System.out.println(s5 + ": " + isValid(s5));
	}

	private static boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<Character>();

		if (s.length() == 0) {
			return true;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty())
					return false;

				char ch = stack.pop();
				if (map.get(ch) != s.charAt(i))
					return false;

			}
		}
		return stack.isEmpty();

	}

}
