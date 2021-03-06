package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0834;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0834 {
  @Test
  public void testProblemCase() {
    int N = 6; 
    int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};
    LeetCode0834 solution = new LeetCode0834();
    Assert.assertArrayEquals(new int[] {8,12,6,10,10,10}, solution.sumOfDistancesInTree(N, edges));
  }
}
