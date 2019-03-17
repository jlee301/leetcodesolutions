package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0500;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0500 {
  @Test
  public void testProblemCase1() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    LeetCode0500 solution = new LeetCode0500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(2,  result.length);
    Assert.assertEquals("Alaska", result[0]);
    Assert.assertEquals("Dad", result[1]);
  }

  @Test
  public void testProblemCase2() {
    String[] words = {};
    LeetCode0500 solution = new LeetCode0500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(0,  result.length);
  }
}
