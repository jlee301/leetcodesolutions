package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0344;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0344 {
  @Test
  public void testProblemCase1() {
    String s = "HeLLo";
    LeetCode0344 solution = new LeetCode0344();
    Assert.assertEquals("oLLeH", solution.reverseString(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "12345";
    LeetCode0344 solution = new LeetCode0344();
    Assert.assertEquals("54321", solution.reverseString(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "!@#$%^";
    LeetCode0344 solution = new LeetCode0344();
    Assert.assertEquals("^%$#@!", solution.reverseString(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "  ";
    LeetCode0344 solution = new LeetCode0344();
    Assert.assertEquals("  ", solution.reverseString(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "";
    LeetCode0344 solution = new LeetCode0344();
    Assert.assertEquals("", solution.reverseString(s));
  }
}
