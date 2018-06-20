package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode749;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode749 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0,1,0,0,0,0,0,1},
                    {0,1,0,0,0,0,0,1},
                    {0,0,0,0,0,0,0,1},
                    {0,0,0,0,0,0,0,0}};
    LeetCode749 solution = new LeetCode749();
    Assert.assertEquals(10, solution.containVirus(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,1,1},
                    {1,0,1},
                    {1,1,1}};
    LeetCode749 solution = new LeetCode749();
    Assert.assertEquals(4, solution.containVirus(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,1,1,0,0,0,0,0,0},
                    {1,0,1,0,1,1,1,1,1},
                    {1,1,1,0,0,0,0,0,0}};
    LeetCode749 solution = new LeetCode749();
    Assert.assertEquals(13, solution.containVirus(grid));
  }

  @Test
  public void testProblemCase4() {
    int[][] grid = { { 0, 1, 0, 1, 1, 1, 1, 1, 1, 0 }, 
                     { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                     { 0, 0, 1, 1, 1, 0, 0, 0, 1, 0 }, 
                     { 0, 0, 0, 1, 1, 0, 0, 1, 1, 0 }, 
                     { 0, 1, 0, 0, 1, 0, 1, 1, 0, 1 },
                     { 0, 0, 0, 1, 0, 1, 0, 1, 1, 1 }, 
                     { 0, 1, 0, 0, 1, 0, 0, 1, 1, 0 }, 
                     { 0, 1, 0, 1, 0, 0, 0, 1, 1, 0 },
                     { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1 }, 
                     { 1, 0, 1, 1, 0, 1, 0, 1, 0, 1 } };
    LeetCode749 solution = new LeetCode749();
    Assert.assertEquals(38, solution.containVirus(grid));
  }
}
