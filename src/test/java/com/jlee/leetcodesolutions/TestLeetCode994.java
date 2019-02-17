package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode994;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode994 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
    LeetCode994 solution = new LeetCode994();
    Assert.assertEquals(4, solution.orangesRotting(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
    LeetCode994 solution = new LeetCode994();
    Assert.assertEquals(-1, solution.orangesRotting(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = { {0,2} };
    LeetCode994 solution = new LeetCode994();
    Assert.assertEquals(0, solution.orangesRotting(grid));
  }
}
