package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode845;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode845 {
  @Test
  public void testProblemCase1() {
    // Input: [2,1,4,7,3,2,5]
    // Output: 5
    int[] A = {2,1,4,7,3,2,5};
    LeetCode845 solution = new LeetCode845();
    Assert.assertEquals(5, solution.longestMountain(A));
  }

  @Test
  public void testProblemCase2() {
    // Input: [2,2,2]
    // Output: 0
    int[] A = {2,2,2};
    LeetCode845 solution = new LeetCode845();
    Assert.assertEquals(0, solution.longestMountain(A));
  }
}
