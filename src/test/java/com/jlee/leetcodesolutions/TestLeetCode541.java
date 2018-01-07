package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode541;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode541 {
  @Test
  public void testProblemCase() {
    String s = "abcdefg";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfeg", solution.reverseStr(s, k));
  }

  @Test
  public void testExactly2k() {
    String s = "abcdefgh";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfegh", solution.reverseStr(s, k));
  }

  @Test
  public void testLessThan2KButKLeft() {
    String s = "abcdef";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacdfe", solution.reverseStr(s, k));
  }

  @Test
  public void testLessThan2KButLessThanKLeft() {
    String s = "abcde";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bacde", solution.reverseStr(s, k));
  }

  @Test
  public void testKLeft() {
    String s = "abc";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("bac", solution.reverseStr(s, k));
  }

  @Test
  public void testKLessLeft() {
    String s = "ab";
    int k = 4;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("ba", solution.reverseStr(s, k));
  }

  @Test
  public void testK1() {
    String s = "abcdefg";
    int k = 1;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("abcdefg", solution.reverseStr(s, k));
  }

  @Test
  public void testK0() {
    String s = "abcdefg";
    int k = 0;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("", solution.reverseStr(s, k));
  }

  @Test
  public void testKNeg() {
    String s = "abcdefg";
    int k = -1;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("", solution.reverseStr(s, k));
  }

  @Test
  public void testEmpty() {
    String s = "";
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("", solution.reverseStr(s, k));
  }

  @Test
  public void testNull() {
    String s = null;
    int k = 2;
    LeetCode541 solution = new LeetCode541();
    Assert.assertEquals("", solution.reverseStr(s, k));
  }
}
