package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0629;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0629 {
  @Test
  public void testProblemCase1() {
    // Input: n = 3, k = 0
    // Output: 1
    int n = 3, k = 0;
    LeetCode0629 solution = new LeetCode0629();
    Assert.assertEquals(1, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase2() {
    // Input: n = 3, k = 1
    // Output: 2
    int n = 3, k = 1;
    LeetCode0629 solution = new LeetCode0629();
    Assert.assertEquals(2, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase3() {
    // Input: n = 5, k = 4
    // Output: 20
    int n = 5, k = 4;
    LeetCode0629 solution = new LeetCode0629();
    Assert.assertEquals(20, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase4() {
    // Input: n = 2, k = 0
    // Output: 1
    int n = 2, k = 0;
    LeetCode0629 solution = new LeetCode0629();
    Assert.assertEquals(1, solution.kInversePairs(n, k));
  }
}
