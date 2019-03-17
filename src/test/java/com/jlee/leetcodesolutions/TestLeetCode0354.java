package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0354;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0354 {
  @Test
  public void testProblemCase1() {
    int[][] envelopes = {{5,4},{6,7},{6,4},{2,3}};
    LeetCode0354 solution = new LeetCode0354();
    Assert.assertEquals(3, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase2() {
    int[][] envelopes = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};
    LeetCode0354 solution = new LeetCode0354();
    Assert.assertEquals(5, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase3() {
    int[][] envelopes = {};
    LeetCode0354 solution = new LeetCode0354();
    Assert.assertEquals(0, solution.maxEnvelopes(envelopes));
  }

  @Test
  public void testProblemCase4() {
    int[][] envelopes = null;
    LeetCode0354 solution = new LeetCode0354();
    Assert.assertEquals(0, solution.maxEnvelopes(envelopes));
  }
}
