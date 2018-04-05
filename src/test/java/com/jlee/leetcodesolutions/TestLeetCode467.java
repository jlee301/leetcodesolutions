package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode467;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode467 {
  @Test
  public void testProblemCase1() {
    String p = "a";
    LeetCode467 solution = new LeetCode467();
    Assert.assertEquals(1, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testProblemCase2() {
    String p = "cac";
    LeetCode467 solution = new LeetCode467();
    Assert.assertEquals(2, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testProblemCase3() {
    String p = "zab";
    LeetCode467 solution = new LeetCode467();
    Assert.assertEquals(6, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testEmpty() {
    String p = "";
    LeetCode467 solution = new LeetCode467();
    Assert.assertEquals(0, solution.findSubstringInWraproundString(p));
  }

  @Test
  public void testNull() {
    String p = null;
    LeetCode467 solution = new LeetCode467();
    Assert.assertEquals(0, solution.findSubstringInWraproundString(p));
  }
}
