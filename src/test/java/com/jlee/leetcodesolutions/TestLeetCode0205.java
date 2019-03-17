package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0205;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0205 {
  @Test
  public void testProblemCase1() {
    LeetCode0205 solution = new LeetCode0205();
    String s = "egg";
    String t = "add";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0205 solution = new LeetCode0205();
    String s = "eGg";
    String t = "add";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0205 solution = new LeetCode0205();
    String s = "foo";
    String t = "bar";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0205 solution = new LeetCode0205();
    String s = "";
    String t = "";
    boolean result = solution.isIsomorphic(s, t);
    Assert.assertTrue(result);
  }
}
