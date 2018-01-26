package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode479;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode479 {
  @Test
  public void testN1() {
    int n = 1;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(9, solution.largestPalindrome(n));
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(987, solution.largestPalindrome(n));
  }

  @Test
  public void testN3() {
    int n = 3;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(123, solution.largestPalindrome(n));
  }

  @Test
  public void testN4() {
    int n = 4;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(597, solution.largestPalindrome(n));
  }

  @Test
  public void testN5() {
    int n = 5;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(677, solution.largestPalindrome(n));
  }

  @Test
  public void testN6() {
    int n = 6;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(1218, solution.largestPalindrome(n));
  }

  /*@Test
  public void testN7() {
    int n = 7;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(877, solution.largestPalindrome(n));
  }

  @Test
  public void testN8() {
    int n = 8;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(475, solution.largestPalindrome(n));
  }*/
  
  @Test
  public void testN0() {
    int n = 0;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(0, solution.largestPalindrome(n));
  }

  @Test
  public void testNeg() {
    int n = -1;
    LeetCode479 solution = new LeetCode479();
    Assert.assertEquals(0, solution.largestPalindrome(n));
  }
}
