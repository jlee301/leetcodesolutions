package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0151;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0151 {
  @Test
  public void testNormal() {
    String s = "the sky is blue";
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testLeadingTailingSpace() {
    String s = " the sky is blue ";
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testDoubleSpaces() {
    String s = "  the  sky  is  blue  ";
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testEmptySpace() {
    String s = " ";
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertEquals("", solution.reverseWords(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertEquals("", solution.reverseWords(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0151 solution = new LeetCode0151();
    Assert.assertNull(solution.reverseWords(s));
  }
}
