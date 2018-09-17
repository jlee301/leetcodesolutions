package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode906;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode906 {
  @Test
  public void testProblemCase1() {
    String L = "4", R = "1000";
    LeetCode906 solution = new LeetCode906();
    Assert.assertEquals(4, solution.superpalindromesInRange(L, R));
  }
}
