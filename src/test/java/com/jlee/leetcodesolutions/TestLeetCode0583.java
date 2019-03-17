package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0583;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0583 {
  @Test
  public void testProblemCase() {
    String word1 = "sea", word2 = "eat";
    LeetCode0583 solution = new LeetCode0583();
    Assert.assertEquals(2, solution.minDistance(word1, word2));
  }

  @Test
  public void testNoCommon() {
    String word1 = "abc", word2 = "def";
    LeetCode0583 solution = new LeetCode0583();
    Assert.assertEquals(6, solution.minDistance(word1, word2));
  }

  @Test
  public void testTLE() {
    String word1 = "dinitrophenylhydrazine", word2 = "benzalphenylhydrazone";
    LeetCode0583 solution = new LeetCode0583();
    Assert.assertEquals(13, solution.minDistance(word1, word2));
  }

  @Test
  public void testWord1Null() {
    String word1 = null, word2 = "def";
    LeetCode0583 solution = new LeetCode0583();
    Assert.assertEquals(0, solution.minDistance(word1, word2));
  }

  @Test
  public void testWord2Null() {
    String word1 = "abc", word2 = null;
    LeetCode0583 solution = new LeetCode0583();
    Assert.assertEquals(0, solution.minDistance(word1, word2));
  }
}
