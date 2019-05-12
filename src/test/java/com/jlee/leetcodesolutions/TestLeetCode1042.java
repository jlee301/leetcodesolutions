package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1042;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1042 {
  @Test
  public void testProblemCase1() {
    int N = 3;
    int[][] paths = {{1,2},{2,3},{3,1}};
    LeetCode1042 solution = new LeetCode1042();
    Assert.assertArrayEquals(new int[] {1,2,3}, solution.gardenNoAdj(N, paths));
  }

  @Test
  public void testProblemCase2() {
    int N = 4;
    int[][] paths = {{1,2},{3,4}};
    LeetCode1042 solution = new LeetCode1042();
    Assert.assertArrayEquals(new int[] {1,2,1,2}, solution.gardenNoAdj(N, paths));
  }

  @Test
  public void testProblemCase3() {
    int N = 4;
    int[][] paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
    LeetCode1042 solution = new LeetCode1042();
    Assert.assertArrayEquals(new int[] {1,2,3,4}, solution.gardenNoAdj(N, paths));
  }

  @Test
  public void testProblemCase4() {
    int N = 5;
    int[][] paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4},{5,1},{5,2},{5,3},{5,4}};
    LeetCode1042 solution = new LeetCode1042();
    Assert.assertArrayEquals(new int[] {1,2,3,4,0}, solution.gardenNoAdj(N, paths));
  }
}
