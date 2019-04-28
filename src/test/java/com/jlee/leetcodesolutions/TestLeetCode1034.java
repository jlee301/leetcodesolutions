package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1034;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1034 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{1,1},{1,2}};
    int r0 = 0, c0 = 0, color = 3;
    LeetCode1034 solution = new LeetCode1034();
    Assert.assertArrayEquals(new int[][] {{3,3}, {3,2}}, solution.colorBorder(grid, r0, c0, color));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,2,2},{2,3,2}};
    int r0 = 0, c0 = 1, color = 3;
    LeetCode1034 solution = new LeetCode1034();
    Assert.assertArrayEquals(new int[][] {{1,3,3}, {2,3,3}}, solution.colorBorder(grid, r0, c0, color));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,1,1},{1,1,1},{1,1,1}};
    int r0 = 1, c0 = 1, color = 2;
    LeetCode1034 solution = new LeetCode1034();
    Assert.assertArrayEquals(new int[][] {{2,2,2}, {2,1,2}, {2,2,2}}, solution.colorBorder(grid, r0, c0, color));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = {{2,2,2},{2,1,2},{2,2,2}};
    int r0 = 1, c0 = 1, color = 2;
    LeetCode1034 solution = new LeetCode1034();
    Assert.assertArrayEquals(new int[][] {{2,2,2}, {2,2,2}, {2,2,2}}, solution.colorBorder(grid, r0, c0, color));
  }
}
