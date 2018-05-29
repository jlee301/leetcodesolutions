package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode827;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode827 {
  @Test
  public void testProblemCase1() {
    // Input: [[1, 0], [0, 1]]
    // Output: 3
    int[][] grid = { {1,0}, {0,1} };
    LeetCode827 solution = new LeetCode827();
    Assert.assertEquals(3, solution.largestIsland(grid));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1, 1], [1, 0]]
    // Output: 4
    int[][] grid = { {1,1}, {1,0} };
    LeetCode827 solution = new LeetCode827();
    Assert.assertEquals(4, solution.largestIsland(grid));
  }

  @Test
  public void testProblemCase3() {
    // Input: [[1, 1], [1, 1]]
    // Output: 4
    int[][] grid = { {1,1}, {1,1} };
    LeetCode827 solution = new LeetCode827();
    Assert.assertEquals(4, solution.largestIsland(grid));
  }

  @Test
  public void testNoIslands() {
    // Input: [[0, 0], [0, 0]]
    // Output: 1
    int[][] grid = { {0,0}, {0,0} };
    LeetCode827 solution = new LeetCode827();
    Assert.assertEquals(1, solution.largestIsland(grid));
  }
}
