package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0461;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0461 {
  @Test
  public void testProblemCase1() {
    int x = 1; // 0001
    int y = 4; // 0100
    LeetCode0461 solution = new LeetCode0461();
    Assert.assertEquals(2, solution.hammingDistance(x, y));
  }

  @Test
  public void testProblemCase2() {
    int x = 20; // 0001 0100
    int y = 4;  // 0000 0100
    LeetCode0461 solution = new LeetCode0461();
    Assert.assertEquals(1, solution.hammingDistance(x, y));
  }

  @Test
  public void testProblemCase3() {
    int x = 263; // 0001 0000 0111
    int y = 4;   // 0000 0000 0100
    LeetCode0461 solution = new LeetCode0461();
    Assert.assertEquals(3, solution.hammingDistance(x, y));
  }

  @Test
  public void testProblemCase4() {
    int x = 4095; // 1111 1111 1111
    int y = 0;    // 0000 0000 0000
    LeetCode0461 solution = new LeetCode0461();
    Assert.assertEquals(12, solution.hammingDistance(x, y));
  }
}
