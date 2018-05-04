package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode743;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode743 {
  @Test
  public void testOneNode() {
    int[][] times = { {1, 1, 0} };
    int N = 1, K = 1;
    LeetCode743 solution = new LeetCode743();
    Assert.assertEquals(0, solution.networkDelayTime(times, N, K));
  }

  @Test
  public void testTwoNodes() {
    int[][] times = { {1, 2, 200}, {1, 1, 0} };
    int N = 2, K = 1;
    LeetCode743 solution = new LeetCode743();
    Assert.assertEquals(200, solution.networkDelayTime(times, N, K));
  }

  @Test
  public void testNeverReachesNode2() {
    int[][] times = { {1, 1, 0} };
    int N = 2, K = 1;
    LeetCode743 solution = new LeetCode743();
    Assert.assertEquals(-1, solution.networkDelayTime(times, N, K));
  }
}
