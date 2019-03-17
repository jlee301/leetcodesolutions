package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0743;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0743 {
  @Test
  public void testOneNode() {
    int[][] times = { {1, 1, 0} };
    int N = 1, K = 1;
    LeetCode0743 solution = new LeetCode0743();
    Assert.assertEquals(0, solution.networkDelayTime(times, N, K));
  }

  @Test
  public void testTwoNodes() {
    int[][] times = { {1, 2, 200}, {1, 1, 0} };
    int N = 2, K = 1;
    LeetCode0743 solution = new LeetCode0743();
    Assert.assertEquals(200, solution.networkDelayTime(times, N, K));
  }

  @Test
  public void testNeverReachesNode2() {
    int[][] times = { {1, 1, 0} };
    int N = 2, K = 1;
    LeetCode0743 solution = new LeetCode0743();
    Assert.assertEquals(-1, solution.networkDelayTime(times, N, K));
  }
}
