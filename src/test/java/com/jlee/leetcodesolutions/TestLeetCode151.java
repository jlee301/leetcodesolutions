package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode151;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode151 {
  @Test
  public void testNormal() {
    String s = "the sky is blue";
    LeetCode151 solution = new LeetCode151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testLeadingTailingSpace() {
    String s = " the sky is blue ";
    LeetCode151 solution = new LeetCode151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testDoubleSpaces() {
    String s = "  the  sky  is  blue  ";
    LeetCode151 solution = new LeetCode151();
    Assert.assertEquals("blue is sky the", solution.reverseWords(s));
  }

  @Test
  public void testEmptySpace() {
    String s = " ";
    LeetCode151 solution = new LeetCode151();
    Assert.assertEquals("", solution.reverseWords(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode151 solution = new LeetCode151();
    Assert.assertEquals("", solution.reverseWords(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode151 solution = new LeetCode151();
    Assert.assertNull(solution.reverseWords(s));
  }
}
