package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0680;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0680 {
  @Test
  public void testProblemCase1() {
    String s = "a";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "aa";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "ab";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "aba";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "aab";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "abc";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "abaac";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "acbadc";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase9() {
    String s = "acdc";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase10() {
    String s = " ";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase11() {
    String s = "  ";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testProblemCase12() {
    String s = "";
    LeetCode0680 solution = new LeetCode0680();
    Assert.assertTrue(solution.validPalindrome(s));
  }
}
