package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0942;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0942 {
  @Test
  public void testProblemCase1() {
    String S = "IDID";
    LeetCode0942 solution = new LeetCode0942();
    Assert.assertArrayEquals(new int[] {0,4,1,3,2}, solution.diStringMatch(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "III";
    LeetCode0942 solution = new LeetCode0942();
    Assert.assertArrayEquals(new int[] {0,1,2,3}, solution.diStringMatch(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "DDI";
    LeetCode0942 solution = new LeetCode0942();
    Assert.assertArrayEquals(new int[] {3,2,0,1}, solution.diStringMatch(S));
  }
}
