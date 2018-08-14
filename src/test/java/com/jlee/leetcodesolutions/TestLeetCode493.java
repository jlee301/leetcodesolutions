package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode493;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode493 {
  @Test
  public void testProblemCase1() {
    // Input: [1,3,2,3,1]
    // Output: 2
    int[] nums = {1,3,2,3,1};
    LeetCode493 solution = new LeetCode493();
    Assert.assertEquals(2, solution.reversePairs(nums));
  }

  @Test
  public void testProblemCase2() {
    // Input: [2,4,3,5,1]
    // Output: 3    
    int[] nums = {2,4,3,5,1};
    LeetCode493 solution = new LeetCode493();
    Assert.assertEquals(3, solution.reversePairs(nums));
  }
}
