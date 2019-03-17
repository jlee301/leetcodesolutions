package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0035;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0035 {
  @Test
  public void testProblemCase1() {
    LeetCode0035 solution = new LeetCode0035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 5;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0035 solution = new LeetCode0035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 2;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0035 solution = new LeetCode0035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 7;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0035 solution = new LeetCode0035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 0;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0035 solution = new LeetCode0035();
    int[] nums = {};
    int target = 0;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(0, result);
  }
}
