package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode383;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode383 {
  @Test
  public void testProblemCase1() {
    String ransom = "a";
    String magazine = "b";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase2() {
    String ransom = "aa";
    String magazine = "ab";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase3() {
    String ransom = "aa";
    String magazine = "aab";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase4() {
    String ransom = "";
    String magazine = "aab";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase5() {
    String ransom = "aa";
    String magazine = "";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase6() {
    String ransom = "";
    String magazine = "";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }
}
