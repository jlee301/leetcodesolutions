package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0026;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0026 {
  @Test
  public void testProblemCase1() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = { 1, 1, 2 };
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(2, result);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = { 1, 1, 1, 2 };
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(2, result);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = { 1, 2, 3, 4 };
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(4, result);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = { 1 };
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(1, result);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = { 1, 1, 1, 1 };
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(1, result);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = {};
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(0, result);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0026 solution = new LeetCode0026();
    int[] nums = null;
    int result = solution.removeDuplicates(nums);
    Assert.assertEquals(0, result);
    Assert.assertNull(nums);
  }
}
