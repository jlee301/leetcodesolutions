package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1001;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1001 {
  @Test
  public void testProblemCase1() {
    int N = 5;
    int[][] lamps = {{0,0},{4,4}};
    int[][] queries = {{1,1},{1,0}};
    LeetCode1001 solution = new LeetCode1001();
    Assert.assertArrayEquals(new int[] {1,0}, solution.gridIllumination(N, lamps, queries));
  }

  @Test
  public void testProblemCase2() {
    int N = 5;
    int[][] lamps = {{2,2}};
    int[][] queries = {{0,0},{0,1},{0,2},{0,3},{0,4},{1,0},{1,4},{2,0},{2,4},{3,0},{3,4},{4,0},{4,1},{4,2},{4,3},{4,4}};
    // 1 0 1 0 1
    // 0 1 1 1 0
    // 1 1 L 1 1
    // 0 1 1 1 0
    // 1 0 1 0 1
    LeetCode1001 solution = new LeetCode1001();
    Assert.assertArrayEquals(new int[] {1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1}, solution.gridIllumination(N, lamps, queries));
  }
}
