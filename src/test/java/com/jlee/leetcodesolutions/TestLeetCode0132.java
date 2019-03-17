package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0132;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0132 {
  @Test
  public void testProblemCase1() {
    String s = "aab";
    LeetCode0132 solution = new LeetCode0132();
    Assert.assertEquals(1, solution.minCut(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aba";
    LeetCode0132 solution = new LeetCode0132();
    Assert.assertEquals(0, solution.minCut(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "aaabaa";
    LeetCode0132 solution = new LeetCode0132();
    Assert.assertEquals(1, solution.minCut(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "abcdefg";
    LeetCode0132 solution = new LeetCode0132();
    Assert.assertEquals(6, solution.minCut(s));
  }
}
