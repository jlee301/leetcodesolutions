package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode463;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode463 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0,1,0,0}, 
                    {1,1,1,0}, 
                    {0,1,0,0}, 
                    {1,1,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(16, solution.islandPerimeter(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(0, solution.islandPerimeter(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(4, solution.islandPerimeter(grid));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = {{0,1,1,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(6, solution.islandPerimeter(grid));
  }

  @Test
  public void testProblemCase5() {
    int[][] grid = {{0,1,0,0}, 
                    {0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(6, solution.islandPerimeter(grid));
  }

  @Test
  public void testProblemCase6() {
    int[][] grid = {{0,1,1,0}, 
                    {0,1,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(8, solution.islandPerimeter(grid));
  }
  
  @Test
  public void testProblemCase7() {
    int[][] grid = {{1,1,1,1}, 
                    {1,0,0,1}, 
                    {1,0,0,1}, 
                    {1,1,1,1}};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(24, solution.islandPerimeter(grid));
  }
  
  @Test
  public void testProblemCase8() {
    int[][] grid = {};
    LeetCode463 solution = new LeetCode463();
    Assert.assertEquals(0, solution.islandPerimeter(grid));
  }
}
