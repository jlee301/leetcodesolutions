package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode807;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode807 {
  @Test
  public void testProblemCase() {
    int[][] grid = { {3,0,8,4}, {2,4,5,7}, {9,2,6,3}, {0,3,1,0} };
    LeetCode807 solution = new LeetCode807();
    Assert.assertEquals(35, solution.maxIncreaseKeepingSkyline(grid));
  }
}
