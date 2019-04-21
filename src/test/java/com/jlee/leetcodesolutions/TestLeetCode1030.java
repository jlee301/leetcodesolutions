package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1030;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1030 {
  @Test
  public void testProblemCase1() {
    int R = 1, C = 2, r0 = 0, c0 = 0;
    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[][] {{0,0},{0,1}}, solution.allCellsDistOrder(R, C, r0, c0));
  }

  @Test
  public void testProblemCase2() {
    int R = 2, C = 2, r0 = 0, c0 = 1;
    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[][] {{0,1},{0,0},{1,1},{1,0}}, solution.allCellsDistOrder(R, C, r0, c0));
  }

  @Test
  public void testProblemCase3() {
    int R = 2, C = 3, r0 = 1, c0 = 2;
    LeetCode1030 solution = new LeetCode1030();
    Assert.assertArrayEquals(new int[][] {{1,2},{0,2},{1,1},{0,1},{1,0},{0,0}}, solution.allCellsDistOrder(R, C, r0, c0));
  }
}
