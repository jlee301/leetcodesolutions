package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0798;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0798 {
  @Test
  public void testProblemCase1() {
    // Input: [2, 3, 1, 4, 0]
    // Output: 3
    int[] A = {2,3,1,4,0};
    LeetCode0798 solution = new LeetCode0798();
    Assert.assertEquals(3, solution.bestRotation(A));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1, 3, 0, 2, 4]
    // Output: 0
    int[] A = {1,3,0,2,4};
    LeetCode0798 solution = new LeetCode0798();
    Assert.assertEquals(0, solution.bestRotation(A));
  }
}
