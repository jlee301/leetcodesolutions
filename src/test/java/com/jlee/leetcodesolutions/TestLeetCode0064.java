package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0064;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0064 {
  @Test
  public void testProblemCase() {
    int[][] grid = { {1,3,1},
                     {1,5,1}, 
                     {4,2,1} };
    LeetCode0064 solution = new LeetCode0064();
    Assert.assertEquals(7, solution.minPathSum(grid));
  }

  @Test
  public void testEmptyRow() {
    int[][] grid = {};
    LeetCode0064 solution = new LeetCode0064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }

  @Test
  public void testEmptyCol() {
    int[][] grid = {{}};
    LeetCode0064 solution = new LeetCode0064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }

  @Test
  public void testNull() {
    int[][] grid = null;
    LeetCode0064 solution = new LeetCode0064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }
}
