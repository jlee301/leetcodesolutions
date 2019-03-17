package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0861;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0861 {
  @Test
  public void testProblemCase() {
    // Input: [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
    // Output: 39
    int[][] A = { {0,0,1,1}, {1,0,1,0}, {1,1,0,0} };
    LeetCode0861 solution = new LeetCode0861();
    Assert.assertEquals(39, solution.matrixScore(A));
  }
}
