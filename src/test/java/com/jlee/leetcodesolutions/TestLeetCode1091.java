package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1091;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1091 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0,1},{1,0}};
    LeetCode1091 solution = new LeetCode1091();
    Assert.assertEquals(2, solution.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
    LeetCode1091 solution = new LeetCode1091();
    Assert.assertEquals(4, solution.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,1},{1,0}};
    LeetCode1091 solution = new LeetCode1091();
    Assert.assertEquals(-1, solution.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = {{0,1},{1,1}};
    LeetCode1091 solution = new LeetCode1091();
    Assert.assertEquals(-1, solution.shortestPathBinaryMatrix(grid));
  }

  @Test
  public void testProblemCase5() {
    int[][] grid = {{0,1,0},{0,1,0},{0,1,0}};
    LeetCode1091 solution = new LeetCode1091();
    Assert.assertEquals(-1, solution.shortestPathBinaryMatrix(grid));
  }
}
