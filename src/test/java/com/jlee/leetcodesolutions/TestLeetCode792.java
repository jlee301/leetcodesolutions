package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode792;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode792 {
  @Test
  public void testProblemCase() {
    String S = "abcde";
    String[] words = {"a", "bb", "acd", "ace"};
    LeetCode792 solution = new LeetCode792();
    Assert.assertEquals(3, solution.numMatchingSubseq(S, words));
  }
}
