package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode125;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode125 {
  @Test
  public void testProblemCase1() {
    LeetCode125 solution = new LeetCode125();
    String test = "A man, a plan, a canal: Panama";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode125 solution = new LeetCode125();
    String test = "race a car";
    boolean result = solution.isPalindrome(test);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode125 solution = new LeetCode125();
    String test = "r";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase4() {
    LeetCode125 solution = new LeetCode125();
    String test = "1";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode125 solution = new LeetCode125();
    String test = "~!@#rr*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase6() {
    LeetCode125 solution = new LeetCode125();
    String test = "~!@#*&";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }
  
  @Test
  public void testProblemCase7() {
    LeetCode125 solution = new LeetCode125();
    String test = "";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode125 solution = new LeetCode125();
    String test = " ";
    boolean result = solution.isPalindrome(test);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode125 solution = new LeetCode125();
    String test = null;
    boolean result = solution.isPalindrome(test);
    Assert.assertFalse(result);
  }
}
