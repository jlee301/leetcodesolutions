package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode389;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode389 {
  @Test
  public void testNewCharLocation0() {
    String s = "abcd";
    String t = "eabcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testNewCharLocation1() {
    String s = "abcd";
    String t = "aebcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testNewCharLocation2() {
    String s = "abcd";
    String t = "abecd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testNewCharLocation3() {
    String s = "abcd";
    String t = "abced";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testNewCharLocation4() {
    String s = "abcd";
    String t = "abcde";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testNoNewChar() {
    String s = "abcd";
    String t = "abcd";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }

  @Test
  public void testEmptyInput() {
    String s = "";
    String t = "e";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('e', solution.findTheDifference(s, t));
  }

  @Test
  public void testEmptyOutput() {
    String s = "abcd";
    String t = "";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }

  @Test
  public void testEmpty() {
    String s = "";
    String t = "";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }

  @Test
  public void testNullInput() {
    String s = null;
    String t = "abcde";
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }

  @Test
  public void testNullOutput() {
    String s = "abcd";
    String t = null;
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }

  @Test
  public void testNull() {
    String s = null;
    String t = null;
    LeetCode389 solution = new LeetCode389();
    Assert.assertEquals('0', solution.findTheDifference(s, t));
  }
}
