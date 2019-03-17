package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0080;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0080 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,1,1,2,2,3};
    LeetCode0080 solution = new LeetCode0080();
    Assert.assertEquals(5, solution.removeDuplicates(nums));
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(2, nums[3]);
    Assert.assertEquals(3, nums[4]);
  }

  @Test
  public void testNeg() {
    int[] nums = {-3,-1,0,0,0,3,3};
    LeetCode0080 solution = new LeetCode0080();
    Assert.assertEquals(6, solution.removeDuplicates(nums));
    Assert.assertEquals(-3, nums[0]);
    Assert.assertEquals(-1, nums[1]);
    Assert.assertEquals(0, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(3, nums[4]);
    Assert.assertEquals(3, nums[5]);
  }

  @Test
  public void testOneEntry() {
    int[] nums = {1};
    LeetCode0080 solution = new LeetCode0080();
    Assert.assertEquals(1, solution.removeDuplicates(nums));
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0080 solution = new LeetCode0080();
    Assert.assertEquals(0, solution.removeDuplicates(nums));
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0080 solution = new LeetCode0080();
    Assert.assertEquals(0, solution.removeDuplicates(nums));
    Assert.assertNull(nums);
  }
}
