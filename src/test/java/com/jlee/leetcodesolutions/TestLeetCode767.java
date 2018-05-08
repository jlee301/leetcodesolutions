package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode767;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode767 {
  @Test
  public void testProblemCase1() {
    String S = "aab";
    LeetCode767 solution = new LeetCode767();
    Assert.assertEquals("aba", solution.reorganizeString(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "aaab";
    LeetCode767 solution = new LeetCode767();
    Assert.assertEquals("", solution.reorganizeString(S));
  }

  @Test
  public void testHavingToPickSecondHighest() {
    String S = "aaaabb";
    LeetCode767 solution = new LeetCode767();
    Assert.assertEquals("", solution.reorganizeString(S));
  }
}
