package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode809;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode809 {
  @Test
  public void testProblemCase() {
    String S = "heeellooo";
    String[] words = {"hello", "hi", "helo"};
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(1, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasHigherCountGroup() {
    String S = "heeellooo";
    String[] words = {"helllo"};
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }
  
  @Test
  public void testStringHasMoreChar() {
    String S = "abcd";
    String[] words = { "abc" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasMoreChar() {
    String S = "abc";
    String[] words = { "abcd" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testCharMismatch() {
    String S = "ab";
    String[] words = { "bc" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasMore() {
    String S = "aaa";
    String[] words = { "aaaa" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordCannotExtend() {
    String S = "ll";
    String[] words = { "l" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }
}
