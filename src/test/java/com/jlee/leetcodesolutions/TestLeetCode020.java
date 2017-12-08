package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode020;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode020 {

	@Test
	public void testBasicParenthesis() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("()");
		Assert.assertTrue(result);
	}

	@Test
	public void testBasicBraces() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testBasicBrackets() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("[]");
		Assert.assertTrue(result);
	}

	@Test
	public void testAllParenthesis() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("()[]{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testRepeatParenthesis() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("()[]{}()[]{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testMixParenthesisClose() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("(]");
		Assert.assertFalse(result);
	}

	@Test
	public void testInvalidCloseOrder() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("([)]");
		Assert.assertFalse(result);
	}

	@Test
	public void testAllOpenParenthesis() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid(")(}{][");
		Assert.assertFalse(result);
	}

	@Test
	public void testInvalidCharacters() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("abc12345");
		Assert.assertFalse(result);
	}

	@Test
	public void testEmptyString() {
		LeetCode020 solution = new LeetCode020();
		boolean result = solution.isValid("");
		Assert.assertFalse(result);
	}
}