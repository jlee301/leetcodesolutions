package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0792;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0792 {
  @Test
  public void testProblemCase() {
    String S = "abcde";
    String[] words = {"a", "bb", "acd", "ace"};
    LeetCode0792 solution = new LeetCode0792();
    Assert.assertEquals(3, solution.numMatchingSubseq(S, words));
  }
}
