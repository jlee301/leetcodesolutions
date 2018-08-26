package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode892;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode892 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{2}};
    LeetCode892 solution = new LeetCode892();
    Assert.assertEquals(10, solution.surfaceArea(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,2},{3,4}};
    LeetCode892 solution = new LeetCode892();
    Assert.assertEquals(34, solution.surfaceArea(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,0},{0,2}};
    LeetCode892 solution = new LeetCode892();
    Assert.assertEquals(16, solution.surfaceArea(grid));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = {{1,1,1},{1,0,1},{1,1,1}};
    LeetCode892 solution = new LeetCode892();
    Assert.assertEquals(32, solution.surfaceArea(grid));
  }

  @Test
  public void testProblemCase5() {
    int[][] grid = {{2,2,2},{2,1,2},{2,2,2}};
    LeetCode892 solution = new LeetCode892();
    Assert.assertEquals(46, solution.surfaceArea(grid));
  }
}
