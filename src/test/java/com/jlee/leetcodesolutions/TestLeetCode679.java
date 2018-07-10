package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode679;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode679 {
  @Test
  public void testProblemCase1() {
    // Input: [4, 1, 8, 7]
    // Output: True
    int[] nums = {4,1,8,7};
    LeetCode679 solution = new LeetCode679();
    Assert.assertTrue(solution.judgePoint24(nums));
  }

  @Test
  public void testProblemCase2() {
    // Input: [1, 2, 1, 2]
    // Output: False
    int[] nums = {1,2,1,2};
    LeetCode679 solution = new LeetCode679();
    Assert.assertFalse(solution.judgePoint24(nums));
  }
}
