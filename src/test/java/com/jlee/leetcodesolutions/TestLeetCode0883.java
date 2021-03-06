package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0883;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0883 {
  @Test
  public void testProblemCase1() {
    int[][] grid = { {2} };
    LeetCode0883 solution = new LeetCode0883();
    Assert.assertEquals(5, solution.projectionArea(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = { {1,2},{3,4} };
    LeetCode0883 solution = new LeetCode0883();
    Assert.assertEquals(17, solution.projectionArea(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = { {1,0},{0,2} };
    LeetCode0883 solution = new LeetCode0883();
    Assert.assertEquals(8, solution.projectionArea(grid));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = { {1,1,1},{1,0,1},{1,1,1} };
    LeetCode0883 solution = new LeetCode0883();
    Assert.assertEquals(14, solution.projectionArea(grid));
  }

  @Test
  public void testProblemCase5() {
    int[][] grid = { {2,2,2},{2,1,2},{2,2,2} };
    LeetCode0883 solution = new LeetCode0883();
    Assert.assertEquals(21, solution.projectionArea(grid));
  }
}
