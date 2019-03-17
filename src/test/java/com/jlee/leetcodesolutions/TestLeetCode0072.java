package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0072;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0072 {
  @Test
  public void testProblemCase1() {
    String word1 = "horse", word2 = "ros";
    LeetCode0072 solution = new LeetCode0072();
    Assert.assertEquals(3, solution.minDistance(word1, word2));
  }

  @Test
  public void testProblemCase2() {
    String word1 = "intention", word2 = "execution";
    LeetCode0072 solution = new LeetCode0072();
    Assert.assertEquals(5, solution.minDistance(word1, word2));
  }

  @Test
  public void testProblemCase3() {
    String word1 = "dinitrophenylhydrazine", word2 = "acetylphenylhydrazine";
    LeetCode0072 solution = new LeetCode0072();
    Assert.assertEquals(6, solution.minDistance(word1, word2));
  }

  @Test
  public void testProblemCase4() {
    String word1 = "abc", word2 = "abc";
    LeetCode0072 solution = new LeetCode0072();
    Assert.assertEquals(0, solution.minDistance(word1, word2));
  }

  @Test
  public void testProblemCase5() {
    String word1 = "abc", word2 = "a";
    LeetCode0072 solution = new LeetCode0072();
    Assert.assertEquals(2, solution.minDistance(word1, word2));
  }
}
