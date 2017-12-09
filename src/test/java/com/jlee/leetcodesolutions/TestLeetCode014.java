package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode014;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode014 {

  @Test
  public void testBasic() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "leets", "leetcode", "leet", "leeds" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("lee", result);
  }

  @Test
  public void testOneWord() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "leets" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("leets", result);
  }

  @Test
  public void testLastWordShorterThanCommonLength() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "leets", "leetcode", "leet", "l" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("l", result);
  }

  @Test
  public void testNoCommon() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "abc", "def", "ghi" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("", result);
  }

  @Test
  public void testLastWordEmpty() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "leets", "leetcode", "leet", "" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("", result);
  }

  @Test
  public void testSecondToLastWordEmpty() {
    LeetCode014 solution = new LeetCode014();
    String[] input = { "leets", "leetcode", "", "leeds" };
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("", result);
  }

  @Test
  public void testNoWords() {
    LeetCode014 solution = new LeetCode014();
    String[] input = {};
    String result = solution.longestCommonPrefix(input);
    Assert.assertEquals("", result);
  }
}