package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode329;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode329 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = { {9,9,4},
                       {6,6,8},
                       {2,1,1} };
    LeetCode329 solution = new LeetCode329();
    Assert.assertEquals(4, solution.longestIncreasingPath(matrix));
  }

  @Test
  public void testProblemCase2() {
    int[][] matrix = { {3,4,5},
                       {3,2,6},
                       {2,2,1} };
    LeetCode329 solution = new LeetCode329();
    Assert.assertEquals(4, solution.longestIncreasingPath(matrix));
  }

  @Test
  public void testProblemCase3() {
    int[][] matrix = { {1,1,1},
                       {1,1,1},
                       {1,1,1} };
    LeetCode329 solution = new LeetCode329();
    Assert.assertEquals(1, solution.longestIncreasingPath(matrix));
  }

  @Test
  public void testProblemCase4() {
    int[][] matrix = {};
    LeetCode329 solution = new LeetCode329();
    Assert.assertEquals(0, solution.longestIncreasingPath(matrix));
  }

  @Test
  public void testProblemCase5() {
    int[][] matrix = null;
    LeetCode329 solution = new LeetCode329();
    Assert.assertEquals(0, solution.longestIncreasingPath(matrix));
  }
}
