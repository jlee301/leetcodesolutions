package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0233;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0233 {
  @Test
  public void testProblemCase1() {
    int n = 13;
    LeetCode0233 solution = new LeetCode0233();
    Assert.assertEquals(6, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase2() {
    int n = 0;
    LeetCode0233 solution = new LeetCode0233();
    Assert.assertEquals(0, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase3() {
    int n = -100;
    LeetCode0233 solution = new LeetCode0233();
    Assert.assertEquals(0, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase4() {
    int n = 13;
    LeetCode0233 solution = new LeetCode0233();
    Assert.assertEquals(6, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase5() {
    int n = 23;
    LeetCode0233 solution = new LeetCode0233();
    Assert.assertEquals(13, solution.countDigitOne(n));
  }
}
