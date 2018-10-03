package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode233;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode233 {
  @Test
  public void testProblemCase1() {
    int n = 13;
    LeetCode233 solution = new LeetCode233();
    Assert.assertEquals(6, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase2() {
    int n = 0;
    LeetCode233 solution = new LeetCode233();
    Assert.assertEquals(0, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase3() {
    int n = -100;
    LeetCode233 solution = new LeetCode233();
    Assert.assertEquals(0, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase4() {
    int n = 13;
    LeetCode233 solution = new LeetCode233();
    Assert.assertEquals(6, solution.countDigitOne(n));
  }

  @Test
  public void testProblemCase5() {
    int n = 23;
    LeetCode233 solution = new LeetCode233();
    Assert.assertEquals(13, solution.countDigitOne(n));
  }
}
