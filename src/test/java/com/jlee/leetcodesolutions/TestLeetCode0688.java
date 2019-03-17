package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0688;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0688 {
  @Test
  public void testProblemCase() {
    int N = 3, K = 2, r = 0, c = 0;
    LeetCode0688 solution = new LeetCode0688();
    Assert.assertEquals(0.0625, solution.knightProbability(N, K, r, c), 0.0);
  }

  @Test
  public void testTLE() {
    int N = 8, K = 30, r = 6, c = 4;
    LeetCode0688 solution = new LeetCode0688();
    Assert.assertEquals(1.9052566298333648E-4, solution.knightProbability(N, K, r, c), 0.0);
  }
}
