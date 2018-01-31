package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode043;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode043 {
  @Test
  public void testMultiply() {
    String num1 = "99";
    String num2 = "99";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("9801", solution.multiply(num1, num2));
  }

  @Test
  public void testOverMaxInt() {
    String num1 = "2147483648";
    String num2 = "1";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("2147483648", solution.multiply(num1, num2));
  }

  @Test
  public void testLeadingZeroAns() {
    String num1 = "2";
    String num2 = "3";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("6", solution.multiply(num1, num2));
  }

  @Test
  public void testNum1Empty() {
    String num1 = "";
    String num2 = "3";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }

  @Test
  public void testNum2Empty() {
    String num1 = "2";
    String num2 = "";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }

  @Test
  public void testEmpty() {
    String num1 = "";
    String num2 = "";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }

  @Test
  public void testNullNum1() {
    String num1 = null;
    String num2 = "99";
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }

  @Test
  public void testNullNum2() {
    String num1 = "99";
    String num2 = null;
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }

  @Test
  public void testNull() {
    String num1 = null;
    String num2 = null;
    LeetCode043 solution = new LeetCode043();
    Assert.assertEquals("0", solution.multiply(num1, num2));
  }
}
