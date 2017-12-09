package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode035;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode035 {
  @Test
  public void testTargetMatch() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 5;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testTargetLess() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 2;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testTargetLast() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 7;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(4, result);
  }

  @Test
  public void testTargetInitial() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = { 1, 3, 5, 6 };
    int target = 0;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testNullNums() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = null;
    int target = 0;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testEmptyNums() {
    LeetCode035 solution = new LeetCode035();
    int[] nums = {};
    int target = 0;
    int result = solution.searchInsert(nums, target);
    Assert.assertEquals(0, result);
  }
}
