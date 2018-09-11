package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode903;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode903 {
  @Test
  public void testProblemCase1() {
    String S = "DID";
    LeetCode903 solution = new LeetCode903();
    Assert.assertEquals(5, solution.numPermsDISequence(S));
  }
}
