package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode344;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode344 {
  @Test
  public void testProblemCase1() {
    String s = "HeLLo";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("oLLeH", solution.reverseString(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "12345";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("54321", solution.reverseString(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "!@#$%^";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("^%$#@!", solution.reverseString(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "  ";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("  ", solution.reverseString(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "";
    LeetCode344 solution = new LeetCode344();
    Assert.assertEquals("", solution.reverseString(s));
  }
}
