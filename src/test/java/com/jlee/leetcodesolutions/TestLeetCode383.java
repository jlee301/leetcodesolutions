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
  public void testCaseSensitive() {
    String ransom = "aAbB";
    String magazine = "BbAa";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testCaseSensitiveFail() {
    String ransom = "aAbB";
    String magazine = "Bbaa";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testNumbers() {
    String ransom = "12345";
    String magazine = "012345";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testNumbersFail() {
    String ransom = "12345";
    String magazine = "1245";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testSymbols() {
    String ransom = "!@#$%";
    String magazine = "!@#$%^";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testSymbolsFail() {
    String ransom = "!@#$%";
    String magazine = "#$%^";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testSpacesRansom() {
    String ransom = " ";
    String magazine = "";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testSpacesMagazine() {
    String ransom = "";
    String magazine = " ";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testSpaces() {
    String ransom = " ";
    String magazine = " ";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testEmptyRansom() {
    String ransom = "";
    String magazine = "aab";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testEmptyMagazine() {
    String ransom = "aa";
    String magazine = "";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testEmpty() {
    String ransom = "";
    String magazine = "";
    LeetCode383 solution = new LeetCode383();
    Assert.assertTrue(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testNullRansom() {
    String ransom = null;
    String magazine = "aab";
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testNullMagazine() {
    String ransom = "aa";
    String magazine = null;
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }

  @Test
  public void testNull() {
    String ransom = null;
    String magazine = null;
    LeetCode383 solution = new LeetCode383();
    Assert.assertFalse(solution.canConstruct(ransom, magazine));
  }
}
