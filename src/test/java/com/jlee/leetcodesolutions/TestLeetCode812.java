package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode812;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode812 {
  @Test
  public void testProblemCase() {
    int[][] points = { {0,0},{0,1},{1,0},{0,2},{2,0} };
    LeetCode812 solution = new LeetCode812();
    Assert.assertEquals(2.0, solution.largestTriangleArea(points), 0.0);
  }

  @Test
  public void testEmpty() {
    int[][] points = {};
    LeetCode812 solution = new LeetCode812();
    Assert.assertEquals(0.0, solution.largestTriangleArea(points), 0.0);
  }

  @Test
  public void testNull() {
    int[][] points = null;
    LeetCode812 solution = new LeetCode812();
    Assert.assertEquals(0.0, solution.largestTriangleArea(points), 0.0);
  }
}
