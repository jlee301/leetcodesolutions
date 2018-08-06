package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode886;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode886 {
  @Test
  public void testProblemCase1() {
    // Input: edges = [[0,1,10],[0,2,1],[1,2,2]], M = 6, N = 3
    // Output: 13
    int[][] edges = { {0,1,10}, {0,2,1}, {1,2,2} };
    int M = 6, N = 3;
    LeetCode886 solution = new LeetCode886();
    Assert.assertEquals(13, solution.reachableNodes(edges, M, N));
  }

  @Test
  public void testProblemCase2() {
    // Input: edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], M = 10, N = 4
    // Output: 23
    int[][] edges = { {0,1,4}, {1,2,6}, {0,2,8}, {1,3,1} };
    int M = 10, N = 4;
    LeetCode886 solution = new LeetCode886();
    Assert.assertEquals(23, solution.reachableNodes(edges, M, N));
  }

  @Test
  public void testProblemCase3() {
    int[][] edges = { {0,3,8},{0,1,4},{2,4,3},{1,2,0},{1,3,9},{0,4,7},{3,4,9},{1,4,4},{0,2,7},{2,3,1} };
    int M = 8, N = 5;
    LeetCode886 solution = new LeetCode886();
    Assert.assertEquals(40, solution.reachableNodes(edges, M, N));
  }
}
