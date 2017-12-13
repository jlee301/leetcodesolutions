package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode125;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode125 {
  @Test
  public void testProblemPalindrome() {
    LeetCode125 solution = new LeetCode125();
    String test = "A man, a plan, a canal: Panama";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemNotPalindrome() {
    LeetCode125 solution = new LeetCode125();
    String test = "race a car";
    boolean result = solution.isPalindrome(test);
    Assert.assertFalse(result);
  }

  @Test
  public void testSingleAlpha() {
    LeetCode125 solution = new LeetCode125();
    String test = "r";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testSingleNum() {
    LeetCode125 solution = new LeetCode125();
    String test = "1";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testAlphaSurroundedByJunk() {
    LeetCode125 solution = new LeetCode125();
    String test = "~!@#rr*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testAllJunk() {
    LeetCode125 solution = new LeetCode125();
    String test = "~!@#*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testEmpty() {
    LeetCode125 solution = new LeetCode125();
    String test = "";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testEmptySpace() {
    LeetCode125 solution = new LeetCode125();
    String test = " ";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testNull() {
    LeetCode125 solution = new LeetCode125();
    String test = " ";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
}