package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode953;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode953 {
  @Test
  public void testProblemCase1() {
    String[] words = {"hello","leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    LeetCode953 solution = new LeetCode953();
    Assert.assertTrue(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"word","world","row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    LeetCode953 solution = new LeetCode953();
    Assert.assertFalse(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase3() {
    String[] words = {"apple","app"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    LeetCode953 solution = new LeetCode953();
    Assert.assertFalse(solution.isAlienSorted(words, order));
  }

  @Test
  public void testProblemCase4() {
    String[] words = {"apple","apple"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    LeetCode953 solution = new LeetCode953();
    Assert.assertTrue(solution.isAlienSorted(words, order));
  }
}
