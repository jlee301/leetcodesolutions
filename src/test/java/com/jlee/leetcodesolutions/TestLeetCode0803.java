package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0803;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0803 {
  @Test
  public void testProblemCase1() {
    // Input: 
    //   grid = [[1,0,0,0],[1,1,1,0]]
    //   hits = [[1,0]]
    // Output: [2]
    int[][] grid = {{1,0,0,0},{1,1,1,0}};
    int[][] hits = {{1,0}};
    LeetCode0803 solution = new LeetCode0803();
    Assert.assertArrayEquals(new int[] {2}, solution.hitBricks(grid, hits));
  }

  @Test
  public void testProblemCase2() {
    // Input: 
    //   grid = [[1,0,0,0],[1,1,0,0]]
    //   hits = [[1,1],[1,0]]
    // Output: [0,0]
    int[][] grid = {{1,0,0,0},{1,1,0,0}};
    int[][] hits = {{1,1},{1,0}};
    LeetCode0803 solution = new LeetCode0803();
    Assert.assertArrayEquals(new int[] {0,0}, solution.hitBricks(grid, hits));
  }

  @Test
  public void testNoBricks() {
    int[][] grid = {{0,0,0,0},{0,0,0,0}};
    int[][] hits = {{0,0},{0,1},{0,2},{0,3},{1,0},{1,1},{1,2},{1,3}};
    LeetCode0803 solution = new LeetCode0803();
    Assert.assertArrayEquals(new int[] {0,0,0,0,0,0,0,0}, solution.hitBricks(grid, hits));
  }

  @Test
  public void testAllBricks() {
    int[][] grid = {{1,1,1,1},{1,1,1,1}};
    int[][] hits = {{0,0},{0,1},{0,2},{0,3},{1,0},{1,1},{1,2},{1,3}};
    LeetCode0803 solution = new LeetCode0803();
    Assert.assertArrayEquals(new int[] {0,0,0,4,0,0,0,0}, solution.hitBricks(grid, hits));
  }
}
