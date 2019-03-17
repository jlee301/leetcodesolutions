package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0767;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0767 {
  @Test
  public void testProblemCase1() {
    String S = "aab";
    LeetCode0767 solution = new LeetCode0767();
    Assert.assertEquals("aba", solution.reorganizeString(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "aaab";
    LeetCode0767 solution = new LeetCode0767();
    Assert.assertEquals("", solution.reorganizeString(S));
  }

  @Test
  public void testHavingToPickSecondHighest() {
    String S = "aaaabb";
    LeetCode0767 solution = new LeetCode0767();
    Assert.assertEquals("", solution.reorganizeString(S));
  }
}
