package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode344;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode344 {
  @Test
  public void testAlpha() {
    String s = "HeLLo";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("oLLeH", solution.reverseString(s));
  }

  @Test
  public void testNumeric() {
    String s = "12345";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("54321", solution.reverseString(s));
  }

  @Test
  public void testSymbols() {
    String s = "!@#$%^";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("^%$#@!", solution.reverseString(s));
  }

  @Test
  public void testSpaces() {
    String s = "  ";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("  ", solution.reverseString(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("", solution.reverseString(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode344 solution = new LeetCode344();
    Assert.assertNull(solution.reverseString(s));
  }
}
