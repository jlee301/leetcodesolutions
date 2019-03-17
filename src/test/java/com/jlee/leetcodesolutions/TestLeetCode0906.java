package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0906;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0906 {
  @Test
  public void testProblemCase1() {
    String L = "4", R = "1000";
    LeetCode0906 solution = new LeetCode0906();
    Assert.assertEquals(4, solution.superpalindromesInRange(L, R));
  }
}
