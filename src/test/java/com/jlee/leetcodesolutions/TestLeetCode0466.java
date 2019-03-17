package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0466;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0466 {
  @Test
  public void testProblemCase1() {
    String s1 = "acb";
    int n1 = 4;
    String s2 = "ab";
    int n2 = 2;
    LeetCode0466 solution = new LeetCode0466();
    Assert.assertEquals(2, solution.getMaxRepetitions(s1, n1, s2, n2));
  }
}
