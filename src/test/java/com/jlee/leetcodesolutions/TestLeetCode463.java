package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode463;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode463 {
  @Test
  public void testProblemCase() {
    int[][] grid = {{0,1,0,0}, 
                    {1,1,1,0}, 
                    {0,1,0,0}, 
                    {1,1,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(16, solution.islandPerimeter(grid));
  }

  @Test
  public void testNoIslands() {
    int[][] grid = {{0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(0, solution.islandPerimeter(grid));
  }

  @Test
  public void testSoloIsland() {
    int[][] grid = {{0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(4, solution.islandPerimeter(grid));
  }

  @Test
  public void testIslandWithRightNeighbor() {
    int[][] grid = {{0,1,1,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(6, solution.islandPerimeter(grid));
  }

  @Test
  public void testIslandWithDownNeighbor() {
    int[][] grid = {{0,1,0,0}, 
                    {0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(6, solution.islandPerimeter(grid));
  }

  @Test
  public void testIslandWithRightDownNeighbor() {
    int[][] grid = {{0,1,1,0}, 
                    {0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(8, solution.islandPerimeter(grid));
  }
  
  @Test
  public void testEmpty() {
    int[][] grid = {};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(0, solution.islandPerimeter(grid));
  }

  @Test
  public void testNull() {
    int[][] grid = null;
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(0, solution.islandPerimeter(grid));
  }
}
