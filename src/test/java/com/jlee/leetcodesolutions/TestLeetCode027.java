package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode027;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode027 {
	@Test
	public void testBasicRemove() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(2, result);
		Assert.assertEquals(2, nums[0]);
		Assert.assertEquals(2, nums[1]);
		Assert.assertEquals(2, nums[2]);
		Assert.assertEquals(3, nums[3]);
	}

	@Test
	public void testNothingToRemove() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = { 3, 2, 2, 3 };
		int val = 4;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(4, result);
		Assert.assertEquals(3, nums[0]);
		Assert.assertEquals(2, nums[1]);
		Assert.assertEquals(2, nums[2]);
		Assert.assertEquals(3, nums[3]);
	}

	@Test
	public void testRemoveAllButOne() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = { 3, 3, 3, 2 };
		int val = 3;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(1, result);
		Assert.assertEquals(2, nums[0]);
		Assert.assertEquals(3, nums[1]);
		Assert.assertEquals(3, nums[2]);
		Assert.assertEquals(2, nums[3]);
	}
	
	@Test
	public void testRemoveAll() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = { 3, 3, 3, 3 };
		int val = 3;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(0, result);
		Assert.assertEquals(3, nums[0]);
		Assert.assertEquals(3, nums[1]);
		Assert.assertEquals(3, nums[2]);
		Assert.assertEquals(3, nums[3]);
	}

	@Test
	public void testEmptyInput() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = {};
		int val = 3;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(0, result);
		Assert.assertEquals(0, nums.length);
	}

	@Test
	public void testNullInput() {
		LeetCode027 solution = new LeetCode027();
		int[] nums = null;
		int val = 3;
		int result = solution.removeElement(nums,  val);
		Assert.assertEquals(0, result);
		Assert.assertNull(nums);
	}
}
