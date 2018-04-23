package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode647;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode647 {
  @Test
  public void testProblemCase1() {
    String s = "abc";
    LeetCode647 solution = new LeetCode647();
    Assert.assertEquals(3, solution.countSubstrings(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aaa";
    LeetCode647 solution = new LeetCode647();
    Assert.assertEquals(6, solution.countSubstrings(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode647 solution = new LeetCode647();
    Assert.assertEquals(0, solution.countSubstrings(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode647 solution = new LeetCode647();
    Assert.assertEquals(0, solution.countSubstrings(s));
  }
}
