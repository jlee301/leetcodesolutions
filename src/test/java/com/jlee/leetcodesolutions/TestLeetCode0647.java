package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0647;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0647 {
  @Test
  public void testProblemCase1() {
    String s = "abc";
    LeetCode0647 solution = new LeetCode0647();
    Assert.assertEquals(3, solution.countSubstrings(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aaa";
    LeetCode0647 solution = new LeetCode0647();
    Assert.assertEquals(6, solution.countSubstrings(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0647 solution = new LeetCode0647();
    Assert.assertEquals(0, solution.countSubstrings(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0647 solution = new LeetCode0647();
    Assert.assertEquals(0, solution.countSubstrings(s));
  }
}
