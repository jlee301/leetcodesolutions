package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode668;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode668 {
  @Test
  public void testProblemCase1() {
    // Input: m = 3, n = 3, k = 5
    // Output: 3
    int m = 3, n = 3, k = 5;
    LeetCode668 solution = new LeetCode668();
    Assert.assertEquals(3, solution.findKthNumber(m, n, k));
  }

  @Test
  public void testProblemCase2() {
    // Input: m = 2, n = 3, k = 6
    // Output: 6
    int m = 2, n = 3, k = 6;
    LeetCode668 solution = new LeetCode668();
    Assert.assertEquals(6, solution.findKthNumber(m, n, k));
  }
}
