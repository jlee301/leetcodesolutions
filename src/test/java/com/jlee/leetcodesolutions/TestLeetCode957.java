package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode957;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode957 {
  @Test
  public void testProblemCase1() {
    int[] cells = {0,1,0,1,1,0,0,1};
    int N = 7;
    LeetCode957 solution = new LeetCode957();
    Assert.assertArrayEquals(new int[] {0,0,1,1,0,0,0,0}, solution.prisonAfterNDays(cells, N));
  }

  @Test
  public void testProblemCase2() {
    int[] cells = {1,0,0,1,0,0,1,0};
    int N = 1000000000;
    LeetCode957 solution = new LeetCode957();
    Assert.assertArrayEquals(new int[] {0,0,1,1,1,1,1,0}, solution.prisonAfterNDays(cells, N));
  }

  @Test
  public void testProblemCase3() {
    int[] cells = {1,0,0,1,0,0,0,1};
    int N = 826;
    LeetCode957 solution = new LeetCode957();
    Assert.assertArrayEquals(new int[] {0,1,1,0,1,1,1,0}, solution.prisonAfterNDays(cells, N));
  }
}
