package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0805;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0805 {
  @Test
  public void testProblemCase() {
    // Input: [1,2,3,4,5,6,7,8]
    // Output: true
    int[] A = {1,2,3,4,5,6,7,8};
    LeetCode0805 solution = new LeetCode0805();
    Assert.assertTrue(solution.splitArraySameAverage(A));
  }
  
  @Test
  public void testTLE() {
    int[] A = {9990, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
    LeetCode0805 solution = new LeetCode0805();
    Assert.assertFalse(solution.splitArraySameAverage(A));
  }
}
