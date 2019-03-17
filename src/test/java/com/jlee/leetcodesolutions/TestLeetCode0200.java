package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0200;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0200 {
  @Test
  public void testProblemCase1() {
    char[][] grid = {{'1','1','1','1','0'},
                     {'1','1','0','1','0'},
                     {'1','1','0','0','0'},
                     {'0','0','0','0','0'}};
    LeetCode0200 solution = new LeetCode0200();
    Assert.assertEquals(1, solution.numIslands(grid));
  }

  @Test
  public void testProblemCase2() {
    char[][] grid = {{'1','1','0','0','0'},
                     {'1','1','0','0','0'},
                     {'0','0','1','0','0'},
                     {'0','0','0','1','1'}};
    LeetCode0200 solution = new LeetCode0200();
    Assert.assertEquals(3, solution.numIslands(grid));
  }

  @Test
  public void testRowEmpty() {
    char[][] grid = {};
    LeetCode0200 solution = new LeetCode0200();
    Assert.assertEquals(0, solution.numIslands(grid));
  }

  @Test
  public void testColEmpty() {
    char[][] grid = {{}};
    LeetCode0200 solution = new LeetCode0200();
    Assert.assertEquals(0, solution.numIslands(grid));
  }

  @Test
  public void testNull() {
    char[][] grid = null;
    LeetCode0200 solution = new LeetCode0200();
    Assert.assertEquals(0, solution.numIslands(grid));
  }
}
