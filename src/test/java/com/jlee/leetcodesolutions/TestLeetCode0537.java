package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0537;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0537 {
  @Test
  public void testProblemCase1() {
    String a = "1+1i", b = "1+1i";
    LeetCode0537 solution = new LeetCode0537();
    Assert.assertEquals("0+2i", solution.complexNumberMultiply(a, b));
  }

  @Test
  public void testProblemCase2() {
    String a = "1+-1i", b = "1+-1i";
    LeetCode0537 solution = new LeetCode0537();
    Assert.assertEquals("0+-2i", solution.complexNumberMultiply(a, b));
  }
}
