package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode537;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode537 {
  @Test
  public void testProblemCase1() {
    String a = "1+1i", b = "1+1i";
    LeetCode537 solution = new LeetCode537();
    Assert.assertEquals("0+2i", solution.complexNumberMultiply(a, b));
  }

  @Test
  public void testProblemCase2() {
    String a = "1+-1i", b = "1+-1i";
    LeetCode537 solution = new LeetCode537();
    Assert.assertEquals("0+-2i", solution.complexNumberMultiply(a, b));
  }
}
