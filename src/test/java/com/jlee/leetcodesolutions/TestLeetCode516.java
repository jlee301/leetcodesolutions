package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode516;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode516 {
  @Test
  public void testProblemCase1() {
    String s = "bbbab";
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(4, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "cbbd";
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(2, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testEndsOnSame() {
    String s = "bbbbab";
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(5, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testAllUnique() {
    String s = "abcde";
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(1, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(0, solution.longestPalindromeSubseq(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode516 solution = new LeetCode516();
    Assert.assertEquals(0, solution.longestPalindromeSubseq(s));
  }
}
