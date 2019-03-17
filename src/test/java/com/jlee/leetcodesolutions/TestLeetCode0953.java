package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0953;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0953 {
  @Test
  public void testProblemCase1() {
    String[] words = {"hello","leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    LeetCode0953 solution = new LeetCode0953();
    Assert.assertTrue(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"word","world","row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    LeetCode0953 solution = new LeetCode0953();
    Assert.assertFalse(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"apple","app"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    LeetCode0953 solution = new LeetCode0953();
    Assert.assertFalse(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase4() {
    String[] words = {"apple","apple"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    LeetCode0953 solution = new LeetCode0953();
    Assert.assertTrue(solution.isAlienSorted(words, order));
  }
}
