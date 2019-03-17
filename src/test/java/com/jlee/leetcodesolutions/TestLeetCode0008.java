package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0008;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0008 {
  @Test
  public void testNegative() {
    String str = "-123";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(-123, solution.myAtoi(str));
  }

  @Test
  public void testPositive() {
    String str = "+123";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(123, solution.myAtoi(str));
  }
  
  @Test
  public void testJustPlusSign() {
    String str = "+";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }
  
  @Test
  public void testJustMinusSign() {
    String str = "-";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }
  
  @Test
  public void testJunkInFront() {
    String str = "abc123";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }

  @Test
  public void testJunkInBack() {
    String str = "123abc";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(123, solution.myAtoi(str));
  }

  @Test
  public void testJunkInMid() {
    String str = "123abc:321";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(123, solution.myAtoi(str));
  }

  @Test
  public void testJunkInMidAgain() {
    String str = "1abc:321";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(1, solution.myAtoi(str));
  }

  @Test
  public void testAllZeroes() {
    String str = "0000";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }

  @Test
  public void testLeadingZeroes() {
    String str = "000100";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(100, solution.myAtoi(str));
  }

  @Test
  public void testMaxInteger() {
    String str = "2147483648";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(Integer.MAX_VALUE, solution.myAtoi(str));
  }

  @Test
  public void testMinInteger() {
    String str = "-2147483649";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(Integer.MIN_VALUE, solution.myAtoi(str));
  }

  @Test
  public void testSymbolsFront() {
    String str = "!1";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }

  @Test
  public void testSymbolsBack() {
    String str = "1!";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(1, solution.myAtoi(str));
  }

  @Test
  public void testEmpty() {
    String str = "";
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }

  @Test
  public void testNull() {
    String str = null;
    LeetCode0008 solution = new LeetCode0008();
    Assert.assertEquals(0, solution.myAtoi(str));
  }
}
