package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0840;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0840 {
  @Test
  public void testProblemCase() {
    int[][] grid = {{4,3,8,4},
                    {9,5,1,9},
                    {2,7,6,2}};
    LeetCode0840 solution = new LeetCode0840();
    Assert.assertEquals(1, solution.numMagicSquaresInside(grid));
  }

  @Test
  public void testWrongAns() {
    int[][] grid = {{10,  3,  5},
                    { 1,  6, 11},
                    { 7,  9,  2}};
    LeetCode0840 solution = new LeetCode0840();
    Assert.assertEquals(0, solution.numMagicSquaresInside(grid));
  }

  @Test
  public void testZeros() {
    int[][] grid = {{0,0,0},
                    {0,0,0},
                    {0,0,0}};
    LeetCode0840 solution = new LeetCode0840();
    Assert.assertEquals(0, solution.numMagicSquaresInside(grid));
  }
}
