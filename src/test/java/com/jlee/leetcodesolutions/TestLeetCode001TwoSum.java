package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode001TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode001TwoSum {
	
	@Test
	public void testBeginOfArray() {
		LeetCode001TwoSum solution = new LeetCode001TwoSum();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(1, result[1]);
	}

	@Test
	public void testMiddleOfArray() {
		LeetCode001TwoSum solution = new LeetCode001TwoSum();
		int[] nums = new int[] { 11, 2, 7, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
	}

	@Test
	public void testEndOfArray() {
		LeetCode001TwoSum solution = new LeetCode001TwoSum();
		int[] nums = new int[] { 11, 15, 2, 7 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		Assert.assertEquals(2, result[0]);
		Assert.assertEquals(3, result[1]);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testNoneInArray() {
		LeetCode001TwoSum solution = new LeetCode001TwoSum();
		int[] nums = new int[] { 11, 15, 16, 17 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		Assert.fail("IllegalArgumentException was not thrown when input has no two sum solution.");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testNotEnoughInputsInArray() {
		LeetCode001TwoSum solution = new LeetCode001TwoSum();
		int[] nums = new int[] { 11 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		Assert.fail("IllegalArgumentException was not thrown when input has no two sum solution.");
	}
}