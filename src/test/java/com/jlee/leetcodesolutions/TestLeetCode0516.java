package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0516;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0516 {
  @Test
  public void testProblemCase1() {
    String s = "bbbab";
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(4, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cbbd";
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(2, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testEndsOnSame() {
    String s = "bbbbab";
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(5, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testAllUnique() {
    String s = "abcde";
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(1, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(0, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0516 solution = new LeetCode0516();
    Assert.assertEquals(0, solution.longestPalindromeSubseq(s));
  }
}
