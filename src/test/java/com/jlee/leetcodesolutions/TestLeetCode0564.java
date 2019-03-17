package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0564;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0564 {
  @Test
  public void testProblemCase1() {
    String n = "123";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("121", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase2() {
    String n = "1000";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("999", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase3() {
    String n = "999";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("1001", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase4() {
    String n = "2";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("1", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase5() {
    String n = "10";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("9", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase6() {
    String n = "1";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("0", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase7() {
    String n = "11";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("9", solution.nearestPalindromic(n));
  }

  @Test
  public void testProblemCase8() {
    String n = "298";
    LeetCode0564 solution = new LeetCode0564();
    Assert.assertEquals("303", solution.nearestPalindromic(n));
  }
}
