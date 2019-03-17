package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0753;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0753 {
  @Test
  public void testProblemCase1() {
    // Input: n = 1, k = 2
    // Output: "01"
    int n = 1, k = 2;
    LeetCode0753 solution = new LeetCode0753();
    Assert.assertEquals("01", solution.crackSafe(n, k));
  }

  @Test
  public void testProblemCase2() {
    // Input: n = 2, k = 2
    // Output: "00110"
    int n = 2, k = 2;
    LeetCode0753 solution = new LeetCode0753();
    Assert.assertEquals("00110", solution.crackSafe(n, k));
  }

  @Test
  public void testProblemCase3() {
    // Input: n = 1, k = 10
    // Output: "0123456789"
    int n = 1, k = 10;
    LeetCode0753 solution = new LeetCode0753();
    Assert.assertEquals("0123456789", solution.crackSafe(n, k));
  }
}
