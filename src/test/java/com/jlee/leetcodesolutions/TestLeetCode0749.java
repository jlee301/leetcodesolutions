package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0749;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0749 {
  @Test
  public void testProblemCase1() {
    int[][] grid = {{0,1,0,0,0,0,0,1},
                    {0,1,0,0,0,0,0,1},
                    {0,0,0,0,0,0,0,1},
                    {0,0,0,0,0,0,0,0}};
    LeetCode0749 solution = new LeetCode0749();
    Assert.assertEquals(10, solution.containVirus(grid));
  }

  @Test
  public void testProblemCase2() {
    int[][] grid = {{1,1,1},
                    {1,0,1},
                    {1,1,1}};
    LeetCode0749 solution = new LeetCode0749();
    Assert.assertEquals(4, solution.containVirus(grid));
  }

  @Test
  public void testProblemCase3() {
    int[][] grid = {{1,1,1,0,0,0,0,0,0},
                    {1,0,1,0,1,1,1,1,1},
                    {1,1,1,0,0,0,0,0,0}};
    LeetCode0749 solution = new LeetCode0749();
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
    LeetCode0749 solution = new LeetCode0749();
    Assert.assertEquals(38, solution.containVirus(grid));
  }
}
