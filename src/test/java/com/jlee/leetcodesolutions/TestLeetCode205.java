package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode205;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode205 {
  @Test
  public void testeggadd() {
    LeetCode205 solution = new LeetCode205();
    String s = "egg";
    String t = "add";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertTrue(result);
  }

  @Test
  public void testeGgadd() {
    LeetCode205 solution = new LeetCode205();
    String s = "eGg";
    String t = "add";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }

  @Test
  public void testfoobar() {
    LeetCode205 solution = new LeetCode205();
    String s = "foo";
    String t = "bar";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }

  @Test
  public void testDiffLength() {
    LeetCode205 solution = new LeetCode205();
    String s = "abc";
    String t = "abcd";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }

  @Test
  public void testEmpty() {
    LeetCode205 solution = new LeetCode205();
    String s = "";
    String t = "";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertTrue(result);
  }

  @Test
  public void testNull() {
    LeetCode205 solution = new LeetCode205();
    String s = null;
    String t = null;
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }
}
