package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode452;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode452 {
  @Test
  public void testProblemCase() {
    int[][] points = { {10,16}, {2,8}, {1,6}, {7,12} };
    LeetCode452 solution = new LeetCode452();
    Assert.assertEquals(2, solution.findMinArrowShots(points));
  }

  @Test
  public void testOneBalloon() {
    int[][] points = { {10,16} };
    LeetCode452 solution = new LeetCode452();
    Assert.assertEquals(1, solution.findMinArrowShots(points));
  }
  
  @Test
  public void testMultipleIntersections() {
    int[][] points = { {1,2},{2,3},{3,4},{4,5} };
    LeetCode452 solution = new LeetCode452();
    Assert.assertEquals(2, solution.findMinArrowShots(points));
  }

  @Test
  public void testEmpty() {
    int[][] points = {};
    LeetCode452 solution = new LeetCode452();
    Assert.assertEquals(0, solution.findMinArrowShots(points));
  }

  @Test
  public void testNull() {
    int[][] points = null;
    LeetCode452 solution = new LeetCode452();
    Assert.assertEquals(0, solution.findMinArrowShots(points));
  }
}
