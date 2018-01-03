package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode500;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode500 {
  @Test
  public void testProblemCase() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    LeetCode500 solution = new LeetCode500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(2,  result.length);
    Assert.assertEquals("Alaska", result[0]);
    Assert.assertEquals("Dad", result[1]);
  }

  @Test
  public void testEmptySpacesWord() {
    String[] words = {"", " "};
    LeetCode500 solution = new LeetCode500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(2,  result.length);
    Assert.assertEquals("", result[0]);
    Assert.assertEquals("", result[1]);
  }

  @Test
  public void testEmpty() {
    String[] words = {};
    LeetCode500 solution = new LeetCode500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(0,  result.length);
  }

  @Test
  public void testNullWords() {
    String[] words = null;
    LeetCode500 solution = new LeetCode500();
    String[] result = solution.findWords(words);
    Assert.assertEquals(0,  result.length);
  }
}
