package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode942;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode942 {
  @Test
  public void testProblemCase1() {
    String S = "IDID";
    LeetCode942 solution = new LeetCode942();
    Assert.assertArrayEquals(new int[] {0,4,1,3,2}, solution.diStringMatch(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "III";
    LeetCode942 solution = new LeetCode942();
    Assert.assertArrayEquals(new int[] {0,1,2,3}, solution.diStringMatch(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "DDI";
    LeetCode942 solution = new LeetCode942();
    Assert.assertArrayEquals(new int[] {3,2,0,1}, solution.diStringMatch(S));
  }
}
