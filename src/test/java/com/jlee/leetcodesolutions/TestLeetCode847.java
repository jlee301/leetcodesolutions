package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode847;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode847 {
  @Test
  public void testProblemCase1() {
    // Input: [[1,2,3],[0],[0],[0]]
    // Output: 4
    int[][] graph = { {1,2,3},{0},{0},{0} };
    LeetCode847 solution = new LeetCode847();
    Assert.assertEquals(4, solution.shortestPathLength(graph));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1],[0,2,4],[1,3,4],[2],[1,2]]
    // Output: 4
    int[][] graph = { {1},{0,2,4},{1,3,4},{2},{1,2} };
    LeetCode847 solution = new LeetCode847();
    Assert.assertEquals(4, solution.shortestPathLength(graph));
  }

  @Test
  public void testCannotReachAllNodes() {
    int[][] graph = { {1},{0,2,4},{1,3,4},{2},{1,2},{6},{5} };
    LeetCode847 solution = new LeetCode847();
    Assert.assertEquals(-1, solution.shortestPathLength(graph));
  }
}
