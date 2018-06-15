package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode761;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode761 {
  @Test
  public void testProblemCase() {
    // Input: S = "11011000"
    // Output: "11100100"
    String S = "11011000";
    LeetCode761 solution = new LeetCode761();
    Assert.assertEquals("11100100", solution.makeLargestSpecial(S));
  }
}
