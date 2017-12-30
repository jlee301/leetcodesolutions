package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode459;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode459 {
  @Test
  public void testProblemCase1() {
    String s = "abab";
    LeetCode459 solution = new LeetCode459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aba";
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "abcabcabcabc";
    LeetCode459 solution = new LeetCode459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testAllSameCharacter() {
    String s = "aaaaaaaaaaaa";
    LeetCode459 solution = new LeetCode459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testDifferentPatternAtEnd() {
    String s = "abcabcddd";
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testDifferentPatternAtBeg() {
    String s = "dddabcabc";
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testDifferentPatternAtMid() {
    String s = "abcdddabc";
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode459 solution = new LeetCode459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }
}
