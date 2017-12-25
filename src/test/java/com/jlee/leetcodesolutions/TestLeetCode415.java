package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode415;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode415 {
  @Test
  public void testSimpleAdd() {
    String num1 = "1";
    String num2 = "2";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("3", solution.addStrings(num1, num2));
  }

  @Test
  public void testSimpleCarry() {
    String num1 = "1";
    String num2 = "9";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("10", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum1Bigger() {
    String num1 = "12";
    String num2 = "1";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("13", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum2Bigger() {
    String num1 = "1";
    String num2 = "12";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("13", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum1Num2Big() {
    String num1 = "12";
    String num2 = "12";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("24", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum1Num2BigCarry() {
    String num1 = "97";
    String num2 = "25";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("122", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum1Empty() {
    String num1 = "";
    String num2 = "25";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum2Empty() {
    String num1 = "25";
    String num2 = "";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }

  @Test
  public void testEmpty() {
    String num1 = "";
    String num2 = "";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum1Null() {
    String num1 = null;
    String num2 = "25";
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }

  @Test
  public void testNum2Null() {
    String num1 = "25";
    String num2 = null;
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }

  @Test
  public void testNull() {
    String num1 = null;
    String num2 = null;
    LeetCode415 solution = new LeetCode415();
    Assert.assertEquals("0", solution.addStrings(num1, num2));
  }
}
