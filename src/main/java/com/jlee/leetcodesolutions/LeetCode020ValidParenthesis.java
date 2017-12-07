package com.jlee.leetcodesolutions;

class LeetCode020ValidParenthesis {
	/*
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	 * determine if the input string is valid. The brackets must close in the correct
	 * order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 * 
	 * https://leetcode.com/problems/valid-parentheses/description/
	 */
	public boolean isValid(String s) {
		if(s.length() == 0) {
			// The string was empty to begin with return false
			return false;
		}

		// Remove all instances of () {} []
		s = s.replace("()", "").replace("{}", "").replace("[]", "");					
		if(s.length() == 0) {
			// Now if the string is empty return true
			return true;
		}
		else {
			// There's still characters left in the string return false
			return false;
		}
	}
}