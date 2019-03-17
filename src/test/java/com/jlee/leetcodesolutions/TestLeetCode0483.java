package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0483;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0483 {
  @Test
  public void testProblemCase1() {
    // Input: "13"
    // Output: "3"
    String n = "13";
    LeetCode0483 solution = new LeetCode0483();
    Assert.assertEquals("3", solution.smallestGoodBase(n));
  }

  @Test
  public void testProblemCase2() {
    // Input: "4681"
    // Output: "8"
    String n = "4681";
    LeetCode0483 solution = new LeetCode0483();
    Assert.assertEquals("8", solution.smallestGoodBase(n));
  }

  @Test
  public void testProblemCase3() {
    // Input: "1000000000000000000"
    // Output: "999999999999999999"
    String n = "1000000000000000000";
    LeetCode0483 solution = new LeetCode0483();
    Assert.assertEquals("999999999999999999", solution.smallestGoodBase(n));
  }
}
