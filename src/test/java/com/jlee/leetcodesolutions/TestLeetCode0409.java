package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0409;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0409 {
  @Test
  public void testProblemCase1() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "abccccdd";
    Assert.assertEquals(7, solution.longestPalindrome(s));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "abccccddeee";
    Assert.assertEquals(9, solution.longestPalindrome(s));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "aAGbBGccGccdGdeGee";
    Assert.assertEquals(13, solution.longestPalindrome(s));
  }

  @Test
  public void testProblemCase4() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "abcdefg";
    Assert.assertEquals(1, solution.longestPalindrome(s));
  }

  @Test
  public void testProblemCase5() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "aabbccddeeff";
    Assert.assertEquals(12, solution.longestPalindrome(s));
  }

  @Test
  public void testProblemCase6() {
    LeetCode0409 solution = new LeetCode0409();
    String s = "";
    Assert.assertEquals(0, solution.longestPalindrome(s));
  }
}
