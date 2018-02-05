package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode064;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode064 {
  @Test
  public void testProblemCase() {
    int[][] grid = { {1,3,1},
                     {1,5,1}, 
                     {4,2,1} };
    LeetCode064 solution = new LeetCode064();
    Assert.assertEquals(7, solution.minPathSum(grid));
  }

  @Test
  public void testEmptyRow() {
    int[][] grid = {};
    LeetCode064 solution = new LeetCode064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }

  @Test
  public void testEmptyCol() {
    int[][] grid = {{}};
    LeetCode064 solution = new LeetCode064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }

  @Test
  public void testNull() {
    int[][] grid = null;
    LeetCode064 solution = new LeetCode064();
    Assert.assertEquals(0, solution.minPathSum(grid));
  }
}
