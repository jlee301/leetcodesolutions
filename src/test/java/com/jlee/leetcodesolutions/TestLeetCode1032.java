package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1032;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1032 {
  @Test
  public void testProblemCase1() {
    String[] words = {"cd","f","kl"};
    LeetCode1032 solution = new LeetCode1032(words);
    Assert.assertFalse(solution.query('a'));
    Assert.assertFalse(solution.query('b'));
    Assert.assertFalse(solution.query('c'));
    Assert.assertTrue(solution.query('d'));
    Assert.assertFalse(solution.query('e'));
    Assert.assertTrue(solution.query('f'));
    Assert.assertFalse(solution.query('g'));
    Assert.assertFalse(solution.query('h'));
    Assert.assertFalse(solution.query('i'));
    Assert.assertFalse(solution.query('j'));
    Assert.assertFalse(solution.query('k'));
    Assert.assertTrue(solution.query('l'));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"cd","cdef"};
    LeetCode1032 solution = new LeetCode1032(words);
    Assert.assertFalse(solution.query('a'));
    Assert.assertFalse(solution.query('b'));
    Assert.assertFalse(solution.query('c'));
    Assert.assertTrue(solution.query('d'));
    Assert.assertFalse(solution.query('e'));
    Assert.assertTrue(solution.query('f'));
  }
}
