package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode132;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode132 {
  @Test
  public void testProblemCase1() {
    String s = "aab";
    LeetCode132 solution = new LeetCode132();
    Assert.assertEquals(1, solution.minCut(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aba";
    LeetCode132 solution = new LeetCode132();
    Assert.assertEquals(0, solution.minCut(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "aaabaa";
    LeetCode132 solution = new LeetCode132();
    Assert.assertEquals(1, solution.minCut(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "abcdefg";
    LeetCode132 solution = new LeetCode132();
    Assert.assertEquals(6, solution.minCut(s));
  }
}
