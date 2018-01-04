package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode520;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode520 {
  @Test
  public void testAllCaps() {
    String word = "USA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testAllLower() {
    String word = "usa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testCapBeg() {
    String word = "Usa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testCapMid() {
    String word = "uSa";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testCapEnd() {
    String word = "usA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testMultiCap() {
    String word = "UsA";
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }

  @Test
  public void testOneLetterCap() {
    String word = "U";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testOneLetterLow() {
    String word = "u";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testEmpty() {
    String word = "";
    LeetCode520 solution = new LeetCode520();
    Assert.assertTrue(solution.detectCapitalUse(word));
  }

  @Test
  public void testNull() {
    String word = null;
    LeetCode520 solution = new LeetCode520();
    Assert.assertFalse(solution.detectCapitalUse(word));
  }
}
