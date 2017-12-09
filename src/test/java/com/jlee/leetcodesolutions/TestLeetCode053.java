package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode053;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode053 {
	@Test
	public void testBasicSum() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(6, result);
	}

	@Test
	public void testAllPositive() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = { 1, 2 };
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(3, result);
	}

	@Test
	public void testAllNegative() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = { -2, -1, -5, -4 };
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(-1, result);
	}

	@Test
	public void testSingleNumber() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = { 5 };
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(5, result);
	}

	@Test
	public void testSingleNegativeNumber() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = { -5 };
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(-5, result);
	}

	@Test
	public void testEmptyInput() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = {};
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(0, result);
	}

	@Test
	public void testNullInput() {
		LeetCode053 solution = new LeetCode053();
		int[] nums = null;
		int result = solution.maxSubArray(nums);
		Assert.assertEquals(0, result);
	}
}