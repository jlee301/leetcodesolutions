package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0459;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0459 {
  @Test
  public void testProblemCase1() {
    String s = "abab";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aba";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "abcabcabcabc";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "aaaaaaaaaaaa";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertTrue(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "abcabcddd";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "dddabcabc";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "abcdddabc";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "";
    LeetCode0459 solution = new LeetCode0459();
    Assert.assertFalse(solution.repeatedSubstringPattern(s));
  }
}
