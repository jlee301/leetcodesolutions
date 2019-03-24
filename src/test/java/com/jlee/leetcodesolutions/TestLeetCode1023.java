package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1023;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1023 {
  @Test
  public void testProblemCase1() {
    String S = "0110";
    int N = 3;
    LeetCode1023 solution = new LeetCode1023();
    Assert.assertTrue(solution.queryString(S, N));
  }

  @Test
  public void testProblemCase2() {
    String S = "0110";
    int N = 4;
    LeetCode1023 solution = new LeetCode1023();
    Assert.assertFalse(solution.queryString(S, N));
  }

  @Test
  public void testProblemCase3() {
    String S = "110101011011000011011111000000";
    int N = 15;
    LeetCode1023 solution = new LeetCode1023();
    Assert.assertFalse(solution.queryString(S, N));
  }
}
