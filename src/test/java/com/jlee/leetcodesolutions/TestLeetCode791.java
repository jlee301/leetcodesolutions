package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode791;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode791 {
  @Test
  public void testProblemCase() {
    String S = "cba", T = "abcd";
    LeetCode791 solution = new LeetCode791();
    Assert.assertEquals("cbad", solution.customSortString(S, T));
  }
}
