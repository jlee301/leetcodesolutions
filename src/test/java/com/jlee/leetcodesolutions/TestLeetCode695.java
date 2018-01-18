package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode695;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode695 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0}, 
                    {0,0,0,0,0,0,0,1,1,1,0,0,0},
                    {0,1,1,0,1,0,0,0,0,0,0,0,0}, 
                    {0,1,0,0,1,1,0,0,1,0,1,0,0},
                    {0,1,0,0,1,1,0,0,1,1,1,0,0}, 
                    {0,0,0,0,0,0,0,0,0,0,1,0,0},
                    {0,0,0,0,0,0,0,1,1,1,0,0,0}, 
                    {0,0,0,0,0,0,0,1,1,0,0,0,0}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(6, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testProblemCase1Connected() {
    int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0}, 
                    {0,0,0,0,0,0,0,1,1,1,0,0,0},
                    {0,1,1,0,1,0,0,0,0,0,0,0,0}, 
                    {0,1,0,0,1,1,0,0,1,0,1,0,0},
                    {0,1,0,0,1,1,0,0,1,1,1,0,0}, 
                    {0,0,0,0,0,0,0,0,0,0,1,0,0},
                    {0,0,0,0,0,0,0,1,1,1,1,0,0}, 
                    {0,0,0,0,0,0,0,1,1,0,0,0,0}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(12, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testNoIslandHorizontal() {
    int[][] grid = {{0,0,0,0,0,0,0,0}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testIslandHorizontal() {
    int[][] grid = {{1,1,1,1,1,1,1,1}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(8, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testNoIslandVertical() {
    int[][] grid = {{0},
                    {0},
                    {0},
                    {0},
                    {0},
                    {0},
                    {0},
                    {0}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testIslandVertical() {
    int[][] grid = {{1},
                    {1},
                    {1},
                    {1},
                    {1},
                    {1},
                    {1},
                    {1}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(8, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testJustOneWater() {
    int[][] grid = {{0}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testJustOneIsland() {
    int[][] grid = {{1}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(1, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testEmptyVertical() {
    int[][] grid = {};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testEmptyHorizontal() {
    int[][] grid = {{}};
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }

  @Test
  public void testNull() {
    int[][] grid = null;
    LeetCode695 solution = new LeetCode695();
    Assert.assertEquals(0, solution.maxAreaOfIsland(grid));
  }
}
