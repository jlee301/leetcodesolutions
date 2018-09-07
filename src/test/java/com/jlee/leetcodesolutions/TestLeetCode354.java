package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode354;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode354 {
  @Test
  public void testProblemCase1() {
    int[][] envelopes = {{5,4},{6,7},{6,4},{2,3}};
    LeetCode354 solution = new LeetCode354();
    Assert.assertEquals(3, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase2() {
    int[][] envelopes = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};
    LeetCode354 solution = new LeetCode354();
    Assert.assertEquals(5, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase3() {
    int[][] envelopes = {};
    LeetCode354 solution = new LeetCode354();
    Assert.assertEquals(0, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase4() {
    int[][] envelopes = null;
    LeetCode354 solution = new LeetCode354();
    Assert.assertEquals(0, solution.maxEnvelopes(envelopes));
  }
}
