package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0812;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0812 {
  @Test
  public void testProblemCase() {
    int[][] points = { {0,0},{0,1},{1,0},{0,2},{2,0} };
    LeetCode0812 solution = new LeetCode0812();
    Assert.assertEquals(2.0, solution.largestTriangleArea(points), 0.0);
  }

  @Test
  public void testEmpty() {
    int[][] points = {};
    LeetCode0812 solution = new LeetCode0812();
    Assert.assertEquals(0.0, solution.largestTriangleArea(points), 0.0);
  }

  @Test
  public void testNull() {
    int[][] points = null;
    LeetCode0812 solution = new LeetCode0812();
    Assert.assertEquals(0.0, solution.largestTriangleArea(points), 0.0);
  }
}
