package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode409;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode409 {
  @Test
  public void testProblemCase() {
    LeetCode409 solution = new LeetCode409();
    String s = "abccccdd";
    Assert.assertEquals(7, solution.longestPalindrome(s));
  }

  @Test
  public void testCharacterAppearsThreeTimes() {
    LeetCode409 solution = new LeetCode409();
    String s = "abccccddeee";
    Assert.assertEquals(9, solution.longestPalindrome(s));
  }

  @Test
  public void testCaseSensitive() {
    LeetCode409 solution = new LeetCode409();
    String s = "aAGbBGccGccdGdeGee";
    Assert.assertEquals(13, solution.longestPalindrome(s));
  }

  @Test
  public void testAllUnique() {
    LeetCode409 solution = new LeetCode409();
    String s = "abcdefg";
    Assert.assertEquals(1, solution.longestPalindrome(s));
  }

  @Test
  public void testEven() {
    LeetCode409 solution = new LeetCode409();
    String s = "aabbccddeeff";
    Assert.assertEquals(12, solution.longestPalindrome(s));
  }

  @Test
  public void testEmpty() {
    LeetCode409 solution = new LeetCode409();
    String s = "";
    Assert.assertEquals(0, solution.longestPalindrome(s));
  }

  @Test
  public void testNull() {
    LeetCode409 solution = new LeetCode409();
    String s = null;
    Assert.assertEquals(0, solution.longestPalindrome(s));
  }
}
