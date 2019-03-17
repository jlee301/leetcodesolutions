package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0730;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0730 {
  @Test
  public void testProblemCase1() {
    String S = "bccb";
    LeetCode0730 solution = new LeetCode0730();
    Assert.assertEquals(6, solution.countPalindromicSubsequences(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
    LeetCode0730 solution = new LeetCode0730();
    Assert.assertEquals(104860361, solution.countPalindromicSubsequences(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "bcb";
    LeetCode0730 solution = new LeetCode0730();
    Assert.assertEquals(4, solution.countPalindromicSubsequences(S));
  }
}
