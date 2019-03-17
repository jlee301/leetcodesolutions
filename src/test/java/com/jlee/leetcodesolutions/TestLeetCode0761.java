package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0761;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0761 {
  @Test
  public void testProblemCase() {
    // Input: S = "11011000"
    // Output: "11100100"
    String S = "11011000";
    LeetCode0761 solution = new LeetCode0761();
    Assert.assertEquals("11100100", solution.makeLargestSpecial(S));
  }
}
