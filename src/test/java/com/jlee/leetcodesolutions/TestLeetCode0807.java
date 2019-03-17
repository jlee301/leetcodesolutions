package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0807;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0807 {
  @Test
  public void testProblemCase() {
    int[][] grid = { {3,0,8,4}, {2,4,5,7}, {9,2,6,3}, {0,3,1,0} };
    LeetCode0807 solution = new LeetCode0807();
    Assert.assertEquals(35, solution.maxIncreaseKeepingSkyline(grid));
  }
}
