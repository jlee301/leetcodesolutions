package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0392;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0392 {
  @Test
  public void testProblemCase1() {
    String s = "abc", t = "ahbgdc";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertTrue(solution.isSubsequence(s, t));
  }

  @Test
  public void testProblemCase2() {
    String s = "axc", t = "ahbgdc";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertFalse(solution.isSubsequence(s, t));
  }

  @Test
  public void testSTSame() {
    String s = "axc", t = "axc";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertTrue(solution.isSubsequence(s, t));
  }

  @Test
  public void testReachedEndOfT() {
    String s = "atc", t = "aaaaaat";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertFalse(solution.isSubsequence(s, t));
  }

  @Test
  public void testEmpty() {
    String s = "", t = "";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertTrue(solution.isSubsequence(s, t));
  }

  @Test
  public void testEmptyS() {
    String s = "", t = "ahbgdc";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertTrue(solution.isSubsequence(s, t));
  }

  @Test
  public void testEmptyT() {
    String s = "axc", t = "";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertFalse(solution.isSubsequence(s, t));
  }

  @Test
  public void testNullS() {
    String s = null, t = "ahbgdc";
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertFalse(solution.isSubsequence(s, t));
  }

  @Test
  public void testNullT() {
    String s = "axc", t = null;
    LeetCode0392 solution = new LeetCode0392();
    Assert.assertFalse(solution.isSubsequence(s, t));
  }
}
