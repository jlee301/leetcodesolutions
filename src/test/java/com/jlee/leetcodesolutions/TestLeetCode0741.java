package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0741;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0741 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0, 1, -1},
                    {1, 0, -1},
                    {1, 1,  1}};
    LeetCode0741 solution = new LeetCode0741();
    Assert.assertEquals(5, solution.cherryPickup(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,1,1,1,0,0,0},
                    {0,0,0,1,0,0,0},
                    {0,0,0,1,0,0,1},
                    {1,0,0,1,0,0,0},
                    {0,0,0,1,0,0,0},
                    {0,0,0,1,0,0,0},
                    {0,0,0,1,1,1,1}};
    LeetCode0741 solution = new LeetCode0741();
    Assert.assertEquals(15, solution.cherryPickup(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,1,1,1,-1,-1,-1,1,0,0},
                    {1,0,0,0,1,0,0,0,1,0},
                    {0,0,1,1,1,1,0,1,1,1},
                    {1,1,0,1,1,1,0,-1,1,1},
                    {0,0,0,0,1,-1,0,0,1,-1},
                    {1,0,1,1,1,0,0,-1,1,0},
                    {1,1,0,1,0,0,1,0,1,-1},
                    {1,-1,0,1,0,0,0,1,-1,1},
                    {1,0,-1,0,-1,0,0,1,0,0},
                    {0,0,-1,0,1,0,1,0,0,1}};
    LeetCode0741 solution = new LeetCode0741();
    Assert.assertEquals(22, solution.cherryPickup(grid));
  }
}
