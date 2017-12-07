package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode020ValidParenthesis;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode020ValidParenthesis {

	@Test
	public void testBasicParenthesis() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("()");
		Assert.assertTrue(result);
	}

	@Test
	public void testBasicBraces() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testBasicBrackets() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("[]");
		Assert.assertTrue(result);
	}

	@Test
	public void testAllParenthesis() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("()[]{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testRepeatParenthesis() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("()[]{}()[]{}");
		Assert.assertTrue(result);
	}

	@Test
	public void testMixParenthesisClose() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("(]");
		Assert.assertFalse(result);
	}

	@Test
	public void testInvalidCloseOrder() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("([)]");
		Assert.assertFalse(result);
	}

	@Test
	public void testAllOpenParenthesis() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid(")(}{][");
		Assert.assertFalse(result);
	}

	@Test
	public void testInvalidCharacters() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("abc12345");
		Assert.assertFalse(result);
	}

	@Test
	public void testEmptyString() {
		LeetCode020ValidParenthesis solution = new LeetCode020ValidParenthesis();
		boolean result = solution.isValid("");
		Assert.assertFalse(result);
	}
}