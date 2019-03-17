package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0009;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0009 {

  @Test
  public void testProblemCase1() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(1221);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(1234);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(-1);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(0);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(1);
    Assert.assertTrue(result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(12210);
    // The reverse is 1221
    // 12210 != 1221
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(2147483647);
    Assert.assertFalse(result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0009 solution = new LeetCode0009();
    boolean result = solution.isPalindrome(-2147483648);
    Assert.assertFalse(result);
  }
}
