package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode007;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode007 {

  @Test
  public void testThreeDigits() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(123);
    Assert.assertEquals(321, result);
  }

  @Test
  public void testNegThreeDigits() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(-321);
    Assert.assertEquals(-123, result);
  }

  @Test
  public void testThreeDigitsEndingInZero() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(120);
    Assert.assertEquals(21, result);
  }

  @Test
  public void testSingleDigit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testNegSingleDigit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(-1);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void testZeroDigit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testMultipleZerosDigit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(1000);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testAlternatingZerosDigit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(1020);
    Assert.assertEquals(201, result);
  }

  @Test
  public void testOverPosLimit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(2147483647);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testOverNegLimit() {
    LeetCode007 solution = new LeetCode007();
    int result = solution.reverse(-2147483648);
    Assert.assertEquals(0, result);
  }

}