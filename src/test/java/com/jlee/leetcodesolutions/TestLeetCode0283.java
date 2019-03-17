package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0283;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0283 {
  @Test
  public void testProblemCase1() {
    int[] nums = { 0, 1, 0, 3, 12 };
    LeetCode0283 solution = new LeetCode0283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(3, nums[1]);
    Assert.assertEquals(12, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = { 0, 0, 0, 0, 0 };
    LeetCode0283 solution = new LeetCode0283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(0, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = { 1, 2, 3, 4, 5 };
    LeetCode0283 solution = new LeetCode0283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
    Assert.assertEquals(5, nums[4]);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = { 1, 2, 3, 0, 0 };
    LeetCode0283 solution = new LeetCode0283();
    solution.moveZeroes(nums);
    Assert.assertEquals(5, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {};
    LeetCode0283 solution = new LeetCode0283();
    solution.moveZeroes(nums);
    Assert.assertEquals(0, nums.length);
  }
}
