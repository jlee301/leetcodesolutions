package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode009PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode009PalindromeNumber {

	@Test
	public void testBasicPalindromeInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(1221);
		Assert.assertTrue(result);
	}

	@Test
	public void testNonPalindromeInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(1234);
		Assert.assertFalse(result);
	}

	@Test
	public void testNegativeInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(-1);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testZeroInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(0);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testSingleInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(1);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testEndsWithZeroInteger() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(12210);
		// The reverse is 1221
		// 12210 != 1221
		Assert.assertFalse(result);
	}

	@Test
	public void testPosOverflowIntegers() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(2147483647);
		Assert.assertFalse(result);
	}

	@Test
	public void testNegOverflowIntegers() {
		LeetCode009PalindromeNumber solution = new LeetCode009PalindromeNumber();
		boolean result = solution.isPalindrome(-2147483648);
		Assert.assertFalse(result);
	}
}