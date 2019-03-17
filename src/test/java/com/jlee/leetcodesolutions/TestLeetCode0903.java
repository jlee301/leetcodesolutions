package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0903;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0903 {
  @Test
  public void testProblemCase1() {
    String S = "DID";
    LeetCode0903 solution = new LeetCode0903();
    Assert.assertEquals(5, solution.numPermsDISequence(S));
  }
}
