package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode378;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode378 {
  @Test
  public void testProblemCase() {
    int[][] matrix = {{ 1, 5, 9},
                      {10,11,13},
                      {12,13,15}};
    int k = 8;
    LeetCode378 solution = new LeetCode378();
    Assert.assertEquals(13, solution.kthSmallest(matrix, k));
  }

  @Test
  public void testReplacements() {
    int[][] matrix = {{ 1, 5, 9},
                      {10,11,25},
                      {12,13,26}};
    int k = 7;
    LeetCode378 solution = new LeetCode378();
    Assert.assertEquals(13, solution.kthSmallest(matrix, k));
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    int k = 8;
    LeetCode378 solution = new LeetCode378();
    Assert.assertEquals(Integer.MAX_VALUE, solution.kthSmallest(matrix, k));
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    int k = 8;
    LeetCode378 solution = new LeetCode378();
    Assert.assertEquals(Integer.MAX_VALUE, solution.kthSmallest(matrix, k));
  }
}
