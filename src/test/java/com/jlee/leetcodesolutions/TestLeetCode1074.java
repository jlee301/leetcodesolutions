package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1074;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1074 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = {{0,1,0},{1,1,1},{0,1,0}};
    int target = 0;
    LeetCode1074 solution = new LeetCode1074();
    Assert.assertEquals(4, solution.numSubmatrixSumTarget(matrix, target));
  }

  @Test
  public void testProblemCase2() {
    int[][] matrix = {{1,-1},{-1,1}};
    int target = 0;
    LeetCode1074 solution = new LeetCode1074();
    Assert.assertEquals(5, solution.numSubmatrixSumTarget(matrix, target));
  }
}
