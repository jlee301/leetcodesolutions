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
  public void testCannotAddNewChar() {
    String S = "abcd";
    String[] words = { "abc" };
    LeetCode809 solution = new LeetCode809();
    Assert.assertEquals(0, solution.expressiveWords(S, words));
  }
}
