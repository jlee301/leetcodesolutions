package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0973;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0973 {
  @Test
  public void testProblemCase1() {
    int[][] points = {{1,3},{-2,2}};
    int K = 1;
    LeetCode0973 solution = new LeetCode0973();
    Assert.assertArrayEquals(new int[][] {{-2,2}}, solution.kClosest(points, K));
  }

  @Test
  public void testProblemCase2() {
    int[][] points = {{3,3},{5,-1},{-2,4}};
    int K = 2;
    LeetCode0973 solution = new LeetCode0973();
    Assert.assertArrayEquals(new int[][] {{3,3},{-2,4}}, solution.kClosest(points, K));
  }
}
