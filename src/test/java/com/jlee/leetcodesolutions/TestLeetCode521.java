package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode521;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode521 {
  @Test
  public void testEqualStrings() {
    String a = "abc";
    String b = "abc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringALonger() {
    String a = "abcd";
    String b = "abc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(4, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringBLonger() {
    String a = "abc";
    String b = "abcd";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(4, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringARepeat() {
    String a = "abcabc";
    String b = "abc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(6, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringBRepeat() {
    String a = "abc";
    String b = "abcabc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(6, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringsDiffButSameSize() {
    String a = "abc";
    String b = "def";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringAEmpty() {
    String a = "";
    String b = "abc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringBEmpty() {
    String a = "abc";
    String b = "";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(3, solution.findLUSlength(a, b));
  }

  @Test
  public void testEmpty() {
    String a = "";
    String b = "";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringANull() {
    String a = null;
    String b = "abc";
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }

  @Test
  public void testStringBNull() {
    String a = "abc";
    String b = null;
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }

  @Test
  public void testNull() {
    String a = null;
    String b = null;
    LeetCode521 solution = new LeetCode521();
    Assert.assertEquals(-1, solution.findLUSlength(a, b));
  }
}
