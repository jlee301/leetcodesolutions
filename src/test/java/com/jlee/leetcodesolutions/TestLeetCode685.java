package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode685;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode685 {
  @Test
  public void testProblemCase1() {
    // Input: [[1,2], [1,3], [2,3]]
    // Output: [2,3]
    int[][] edges = { {1,2}, {1,3}, {2,3} };
    LeetCode685 solution = new LeetCode685();
    Assert.assertArrayEquals(new int[] {2,3}, solution.findRedundantDirectedConnection(edges));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1,2], [2,3], [3,4], [4,1], [1,5]]
    // Output: [4,1]
    int[][] edges = { {1,2}, {2,3}, {3,4}, {4,1}, {1,5} };
    LeetCode685 solution = new LeetCode685();
    Assert.assertArrayEquals(new int[] {4,1}, solution.findRedundantDirectedConnection(edges));
  }

  @Test
  public void testProblemCase3() {
    // Input:  [[1,2], [2,3], [3,1], [4,3]]
    // Output: [2,3]
    int[][] edges = { {1,2}, {2,3}, {3,1}, {4,3} };
    LeetCode685 solution = new LeetCode685();
    Assert.assertArrayEquals(new int[] {2,3}, solution.findRedundantDirectedConnection(edges));
  }

  @Test
  public void testProblemCase4() {
    // Input:  [[1,2], [2,3], [3,1], [4,3]]
    // Output: [2,3]
    int[][] edges = { {2,1}, {1,3}, {3,2}, {4,3} };
    LeetCode685 solution = new LeetCode685();
    Assert.assertArrayEquals(new int[] {1,3}, solution.findRedundantDirectedConnection(edges));
  }
}
