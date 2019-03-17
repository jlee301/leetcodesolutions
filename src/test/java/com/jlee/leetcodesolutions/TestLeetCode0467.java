package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0467;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0467 {
  @Test
  public void testProblemCase1() {
    String p = "a";
    LeetCode0467 solution = new LeetCode0467();
    Assert.assertEquals(1, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testProblemCase2() {
    String p = "cac";
    LeetCode0467 solution = new LeetCode0467();
    Assert.assertEquals(2, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testProblemCase3() {
    String p = "zab";
    LeetCode0467 solution = new LeetCode0467();
    Assert.assertEquals(6, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testEmpty() {
    String p = "";
    LeetCode0467 solution = new LeetCode0467();
    Assert.assertEquals(0, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testNull() {
    String p = null;
    LeetCode0467 solution = new LeetCode0467();
    Assert.assertEquals(0, solution.findSubstringInWraproundString(p));
  }
}
