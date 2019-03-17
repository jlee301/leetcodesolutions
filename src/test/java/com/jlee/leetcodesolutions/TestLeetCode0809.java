package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0809;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0809 {
  @Test
  public void testProblemCase() {
    String S = "heeellooo";
    String[] words = {"hello", "hi", "helo"};
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(1, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasHigherCountGroup() {
    String S = "heeellooo";
    String[] words = {"helllo"};
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }
  
  @Test
  public void testStringHasMoreChar() {
    String S = "abcd";
    String[] words = { "abc" };
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasMoreChar() {
    String S = "abc";
    String[] words = { "abcd" };
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testCharMismatch() {
    String S = "ab";
    String[] words = { "bc" };
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordHasMore() {
    String S = "aaa";
    String[] words = { "aaaa" };
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }

  @Test
  public void testWordCannotExtend() {
    String S = "ll";
    String[] words = { "l" };
    LeetCode0809 solution = new LeetCode0809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }
}
