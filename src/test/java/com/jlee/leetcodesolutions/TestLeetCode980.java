package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode980;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode980 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
    LeetCode980 solution = new LeetCode980();
    Assert.assertEquals(2, solution.uniquePathsIII(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
    LeetCode980 solution = new LeetCode980();
    Assert.assertEquals(4, solution.uniquePathsIII(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{0,1},{2,0}};
    LeetCode980 solution = new LeetCode980();
    Assert.assertEquals(0, solution.uniquePathsIII(grid));
  }
}
