package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0402;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0402 {
  @Test
  public void testProblemCase1() {
    String num = "1432219";
    int k = 3;
    LeetCode0402 solution = new LeetCode0402();
    Assert.assertEquals("1219", solution.removeKdigits(num, k));
  }

  @Test
  public void testProblemCase2() {
    String num = "10200";
    int k = 1;
    LeetCode0402 solution = new LeetCode0402();
    Assert.assertEquals("200", solution.removeKdigits(num, k));
  }

  @Test
  public void testProblemCase3() {
    String num = "10";
    int k = 2;
    LeetCode0402 solution = new LeetCode0402();
    Assert.assertEquals("0", solution.removeKdigits(num, k));
  }
}
