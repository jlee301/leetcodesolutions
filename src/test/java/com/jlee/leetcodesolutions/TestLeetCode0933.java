package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0933;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0933 {
  @Test
  public void testProblemCase1() {
    LeetCode0933 solution = new LeetCode0933();
    Assert.assertEquals(1, solution.ping(1));
    Assert.assertEquals(2, solution.ping(100));
    Assert.assertEquals(3, solution.ping(3001));
    Assert.assertEquals(3, solution.ping(3002));
  }
}
