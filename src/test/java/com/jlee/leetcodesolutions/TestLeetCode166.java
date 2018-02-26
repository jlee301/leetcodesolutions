package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode166;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode166 {
  @Test
  public void testProblemCase1() {
    int numerator = 1, denominator = 2;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("0.5", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testProblemCase2() {
    int numerator = 2, denominator = 1;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("2", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testProblemCase3() {
    int numerator = 2, denominator = 3;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("0.(6)", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testLongerRepeat() {
    int numerator = 1, denominator = 99;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("0.(01)", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testMinIntNumerator() {
    int numerator = Integer.MIN_VALUE, denominator = 1;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("-2147483648", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testMinIntDenominator() {
    int numerator = 1, denominator = Integer.MIN_VALUE;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("-0.0000000004656612873077392578125", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testNeg1() {
    int numerator = -1, denominator = 2;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("-0.5", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testNeg2() {
    int numerator = 1, denominator = -2;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("-0.5", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testNeg3() {
    int numerator = -1, denominator = -2;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("0.5", solution.fractionToDecimal(numerator, denominator));
  }

  @Test
  public void testNumeratorZero() {
    int numerator = 0, denominator = 2;
    LeetCode166 solution = new LeetCode166();
    Assert.assertEquals("0", solution.fractionToDecimal(numerator, denominator));
  }
}
