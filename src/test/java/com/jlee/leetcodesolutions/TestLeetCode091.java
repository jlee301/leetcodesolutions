package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode091;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode091 {
  @Test
  public void test1() {
    String s = "1";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(1, solution.numDecodings(s));
  }

  @Test
  public void test12() {
    String s = "12";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(2, solution.numDecodings(s));
  }

  @Test
  public void test123() {
    String s = "123";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(3, solution.numDecodings(s));
  }

  @Test
  public void test1224() {
    String s = "1224";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(5, solution.numDecodings(s));
  }

  @Test
  public void test1234() {
    String s = "1234";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(3, solution.numDecodings(s));
  }

  @Test
  public void test1230() {
    String s = "1230";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(0, solution.numDecodings(s));
  }

  @Test
  public void test1000() {
    String s = "1000";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(0, solution.numDecodings(s));
  }

  @Test
  public void test20() {
    String s = "20";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(1, solution.numDecodings(s));
  }

  @Test
  public void test220() {
    String s = "220";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(1, solution.numDecodings(s));
  }

  @Test
  public void test2220() {
    String s = "2220";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(2, solution.numDecodings(s));
  }

  @Test
  public void test30() {
    String s = "30";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(0, solution.numDecodings(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(0, solution.numDecodings(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode091 solution = new LeetCode091();
    Assert.assertEquals(0, solution.numDecodings(s));
  }
}
