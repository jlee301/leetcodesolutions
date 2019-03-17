package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0125;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0125 {
  @Test
  public void testProblemCase1() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "A man, a plan, a canal: Panama";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "race a car";
    boolean result = solution.isPalindrome(test);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "r";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase4() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "1";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "~!@#rr*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase6() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "~!@#*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase7() {
    LeetCode0125 solution = new LeetCode0125();
    String test = "";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0125 solution = new LeetCode0125();
    String test = " ";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0125 solution = new LeetCode0125();
    String test = null;
    boolean result = solution.isPalindrome(test);
    Assert.assertFalse(result);
  }
}
