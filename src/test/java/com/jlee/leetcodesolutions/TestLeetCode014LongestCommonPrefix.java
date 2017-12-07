package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode014LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode014LongestCommonPrefix {

	@Test
	public void testBasic() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "leets", "leetcode", "leet", "leeds" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("lee",  result);
	}

	@Test
	public void testOneWord() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "leets" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("leets",  result);
	}

	@Test
	public void testLastWordShorterThanCommonLength() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "leets", "leetcode", "leet", "l" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("l",  result);
	}
	
	@Test
	public void testNoCommon() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "abc", "def", "ghi" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("",  result);
	}

	@Test
	public void testLastWordEmpty() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "leets", "leetcode", "leet", "" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("",  result);
	}

	@Test
	public void testSecondToLastWordEmpty() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = { "leets", "leetcode", "", "leeds" };
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("",  result);
	}

	@Test
	public void testNoWords() {
		LeetCode014LongestCommonPrefix solution = new LeetCode014LongestCommonPrefix();
		String[] input = {};
		String result = solution.longestCommonPrefix(input);
		Assert.assertEquals("",  result);
	}
}