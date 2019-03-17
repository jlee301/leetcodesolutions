package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0778;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0778 {
  @Test
  public void testProblemCase1() {
    // Input: [[0,2],[1,3]]
    // Output: 3
    int[][] grid = {{0,2},{1,3}};
    LeetCode0778 solution = new LeetCode0778();
    Assert.assertEquals(3, solution.swimInWater(grid));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
    // Output: 16
    int[][] grid = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
    LeetCode0778 solution = new LeetCode0778();
    Assert.assertEquals(16, solution.swimInWater(grid));
  }

  @Test
  public void testAllZeroes() {
    // Input: [[0,0],[0,0]]
    // Output: 1
    int[][] grid = {{0,0},{0,0}};
    LeetCode0778 solution = new LeetCode0778();
    Assert.assertEquals(0, solution.swimInWater(grid));
  }
}
