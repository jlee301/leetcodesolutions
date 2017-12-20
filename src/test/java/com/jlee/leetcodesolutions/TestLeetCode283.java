package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode283;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode283 {
  @Test
  public void testProblemCase() {
    int[] nums = { 0, 1, 0, 3, 12 };
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(3, nums[1]);
    Assert.assertEquals(12, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testAllZeroes() {
    int[] nums = { 0, 0, 0, 0, 0 };
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(0, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testAllNonZeroes() {
    int[] nums = { 1, 2, 3, 4, 5 };
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
    Assert.assertEquals(5, nums[4]);
  }

  @Test
  public void testZerosAlreadyAtEnd() {
    int[] nums = { 1, 2, 3, 0, 0 };
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode283 solution = new LeetCode283();
    solution.moveZeroes(nums);
    Assert.assertNull(nums);
  }
}
