package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0819;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0819 {
  @Test
  public void testProblemCase() {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = { "hit" };
    LeetCode0819 solution = new LeetCode0819();
    Assert.assertEquals("ball", solution.mostCommonWord(paragraph, banned));
  }

  @Test
  public void testNoBannedWords() {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {};
    LeetCode0819 solution = new LeetCode0819();
    Assert.assertEquals("hit", solution.mostCommonWord(paragraph, banned));
  }

  @Test
  public void testEmpty() {
    String paragraph = "";
    String[] banned = { "hit" };
    LeetCode0819 solution = new LeetCode0819();
    Assert.assertEquals("", solution.mostCommonWord(paragraph, banned));
  }
}
