package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0791;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0791 {
  @Test
  public void testProblemCase() {
    String S = "cba", T = "abcd";
    LeetCode0791 solution = new LeetCode0791();
    Assert.assertEquals("cbad", solution.customSortString(S, T));
  }
}
