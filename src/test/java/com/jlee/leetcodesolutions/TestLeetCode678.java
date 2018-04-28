package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode678;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode678 {
  @Test
  public void testProblemCase1() {
    String s = "()";
    LeetCode678 solution = new LeetCode678();
    Assert.assertTrue(solution.checkValidString(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "(*)";
    LeetCode678 solution = new LeetCode678();
    Assert.assertTrue(solution.checkValidString(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "(*))";
    LeetCode678 solution = new LeetCode678();
    Assert.assertTrue(solution.checkValidString(s));
  }

  @Test
  public void testStartsWithRight() {
    String s = ")";
    LeetCode678 solution = new LeetCode678();
    Assert.assertFalse(solution.checkValidString(s));
  }

  @Test
  public void testNotEnoughWildCards() {
    String s = "(()";
    LeetCode678 solution = new LeetCode678();
    Assert.assertFalse(solution.checkValidString(s));
  }

  @Test
  public void testWildCardBeforeLeft() {
    String s = "*(";
    LeetCode678 solution = new LeetCode678();
    Assert.assertFalse(solution.checkValidString(s));
  }

  @Test
  public void testWildCardAsRight() {
    String s = "(*";
    LeetCode678 solution = new LeetCode678();
    Assert.assertTrue(solution.checkValidString(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode678 solution = new LeetCode678();
    Assert.assertTrue(solution.checkValidString(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode678 solution = new LeetCode678();
    Assert.assertFalse(solution.checkValidString(s));
  }
}
