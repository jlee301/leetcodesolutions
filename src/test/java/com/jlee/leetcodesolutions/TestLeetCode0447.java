package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0447;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0447 {
  @Test
  public void testProblemCase1() {
    int[][] points = {{0,0},{1,0},{2,0}};
    LeetCode0447 solution = new LeetCode0447();
    Assert.assertEquals(2, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase2() {
    int[][] points = {{0,0},{25,25},{50,50},{-25,-25}};
    // {25,25}, {0,0}, {50,50}
    // {25,25}, {50,50}, {0,0}
    // {0,0}, {25,25}, {-25,-25}
    // {0,0}, {-25,-25}, {25,25}
    LeetCode0447 solution = new LeetCode0447();
    Assert.assertEquals(4, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase3() {
    int[][] points = {{1,0},{1,0},{1,0},{1,0}};
    LeetCode0447 solution = new LeetCode0447();
    Assert.assertEquals(24, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase4() {
    int[][] points = {{0,0},{1,0}};
    LeetCode0447 solution = new LeetCode0447();
    Assert.assertEquals(0, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase5() {
    int[][] points = {};
    LeetCode0447 solution = new LeetCode0447();
    Assert.assertEquals(0, solution.numberOfBoomerangs(points));
  }
}
