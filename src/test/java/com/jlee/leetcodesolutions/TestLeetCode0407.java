package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0407;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0407 {
  @Test
  public void testProblemCase1() {
    int[][] heightMap = {{1,4,3,1,3,2},{3,2,1,3,2,4},{2,3,3,2,3,1}};
    LeetCode0407 solution = new LeetCode0407();
    Assert.assertEquals(4, solution.trapRainWater(heightMap));
  }

  @Test
  public void testProblemCase2() {
    int[][] heightMap = null;
    LeetCode0407 solution = new LeetCode0407();
    Assert.assertEquals(0, solution.trapRainWater(heightMap));
  }

  @Test
  public void testProblemCase3() {
    int[][] heightMap = {};
    LeetCode0407 solution = new LeetCode0407();
    Assert.assertEquals(0, solution.trapRainWater(heightMap));
  }

  @Test
  public void testProblemCase4() {
    int[][] heightMap = {{}, {}, {}};
    LeetCode0407 solution = new LeetCode0407();
    Assert.assertEquals(0, solution.trapRainWater(heightMap));
  }
}
