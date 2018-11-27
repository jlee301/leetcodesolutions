package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode053;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode053 {
  @Test
  public void testProblemCase1() {
    LeetCode053 solution = new LeetCode053();
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int result = solution.maxSubArray(nums);
    Assert.assertEquals(6, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode053 solution = new LeetCode053();
    int[] nums = { 1, 2 };
    int result = solution.maxSubArray(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode053 solution = new LeetCode053();
    int[] nums = { -2, -1, -5, -4 };
    int result = solution.maxSubArray(nums);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode053 solution = new LeetCode053();
    int[] nums = { 5 };
    int result = solution.maxSubArray(nums);
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode053 solution = new LeetCode053();
    int[] nums = { -5 };
    int result = solution.maxSubArray(nums);
    Assert.assertEquals(-5, result);
  }
}
