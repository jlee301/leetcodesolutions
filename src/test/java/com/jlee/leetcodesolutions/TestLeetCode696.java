package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode696;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode696 {
  @Test
  public void testProblemCase1() {
    String s = "00110011";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(6, solution.countBinarySubstrings(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "10101";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(4, solution.countBinarySubstrings(s));
  }

  @Test
  public void testMore1InPattern() {
    String s = "001110011";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(6, solution.countBinarySubstrings(s));
  }

  @Test
  public void testLargeGroups10Zeros9Ones() {
    String s = "0000000000111111111";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(9, solution.countBinarySubstrings(s));
  }

  @Test
  public void testAllSame() {
    String s = "11111";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }

  @Test
  public void testOneBit() {
    String s = "1";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode696 solution = new LeetCode696();
    Assert.assertEquals(0, solution.countBinarySubstrings(s));
  }
}
