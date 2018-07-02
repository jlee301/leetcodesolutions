package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode861;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode861 {
  @Test
  public void testProblemCase() {
    // Input: [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
    // Output: 39
    int[][] A = { {0,0,1,1}, {1,0,1,0}, {1,1,0,0} };
    LeetCode861 solution = new LeetCode861();
    Assert.assertEquals(39, solution.matrixScore(A));
  }
}
