package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode377;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode377 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,2,3};
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(7, solution.combinationSum4(nums, target));
  }

  @Test
  public void testProblemCaseNotOrdered() {
    int[] nums = {1,3,2};
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(7, solution.combinationSum4(nums, target));
  }

  @Test
  public void testContainsNumbersGreaterThanTarget() {
    int[] nums = {1,2,3,5,6,7,8};
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(7, solution.combinationSum4(nums, target));
  }

  @Test
  public void testAllNumbersGreaterThanTarget() {
    int[] nums = {5,6,7,8};
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(0, solution.combinationSum4(nums, target));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(0, solution.combinationSum4(nums, target));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 4;
    LeetCode377 solution = new LeetCode377();
    Assert.assertEquals(0, solution.combinationSum4(nums, target));
  }
}
