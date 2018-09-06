package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode363;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode363 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = {{1,0,1},{0,-2,3}};
    int k = 2;
    LeetCode363 solution = new LeetCode363();
    Assert.assertEquals(2, solution.maxSumSubmatrix(matrix, k));
  }
}
