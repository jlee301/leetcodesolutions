package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0415;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0415 {
  @Test
  public void testProblemCase1() {
    String num1 = "1";
    String num2 = "2";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("3", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase2() {
    String num1 = "1";
    String num2 = "9";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("10", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase3() {
    String num1 = "12";
    String num2 = "1";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("13", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase4() {
    String num1 = "1";
    String num2 = "12";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("13", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase5() {
    String num1 = "12";
    String num2 = "12";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("24", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase6() {
    String num1 = "97";
    String num2 = "25";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("122", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase7() {
    String num1 = "";
    String num2 = "25";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("25", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase8() {
    String num1 = "25";
    String num2 = "";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("25", solution.addStrings(num1, num2));
  }

  @Test
  public void testProblemCase9() {
    String num1 = "";
    String num2 = "";
    LeetCode0415 solution = new LeetCode0415();
    Assert.assertEquals("", solution.addStrings(num1, num2));
  }
}
