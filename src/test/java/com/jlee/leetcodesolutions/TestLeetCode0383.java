package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0383;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0383 {
  @Test
  public void testProblemCase1() {
    String ransom = "a";
    String magazine = "b";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase2() {
    String ransom = "aa";
    String magazine = "ab";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase3() {
    String ransom = "aa";
    String magazine = "aab";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase4() {
    String ransom = "";
    String magazine = "aab";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase5() {
    String ransom = "aa";
    String magazine = "";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testProblemCase6() {
    String ransom = "";
    String magazine = "";
    LeetCode0383 solution = new LeetCode0383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }
}
