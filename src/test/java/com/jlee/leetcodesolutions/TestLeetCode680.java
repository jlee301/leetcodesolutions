package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode680;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode680 {
  @Test
  public void testOne() {
    String s = "a";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testTwoValid() {
    String s = "aa";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testTwoRemoval() {
    String s = "ab";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testThreeValid() {
    String s = "aba";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testThreeRemoval() {
    String s = "aab";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testThreeRemovalInvalid() {
    String s = "abc";
    LeetCode680 solution = new LeetCode680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testEndRemovalInvalid() {
    String s = "abaac";
    LeetCode680 solution = new LeetCode680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testFrontRemovalInvalid() {
    String s = "acbadc";
    LeetCode680 solution = new LeetCode680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testFrontRemovalValid() {
    String s = "acdc";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testSpace() {
    String s = " ";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testSpaces() {
    String s = "  ";
    LeetCode680 solution = new LeetCode680();
    Assert.assertTrue(solution.validPalindrome(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode680 solution = new LeetCode680();
    Assert.assertFalse(solution.validPalindrome(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode680 solution = new LeetCode680();
    Assert.assertFalse(solution.validPalindrome(s));
  }
}
