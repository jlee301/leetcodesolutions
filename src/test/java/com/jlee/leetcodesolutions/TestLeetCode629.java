package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode629;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode629 {
  @Test
  public void testProblemCase1() {
    // Input: n = 3, k = 0
    // Output: 1
    int n = 3, k = 0;
    LeetCode629 solution = new LeetCode629();
    Assert.assertEquals(1, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase2() {
    // Input: n = 3, k = 1
    // Output: 2
    int n = 3, k = 1;
    LeetCode629 solution = new LeetCode629();
    Assert.assertEquals(2, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase3() {
    // Input: n = 5, k = 4
    // Output: 20
    int n = 5, k = 4;
    LeetCode629 solution = new LeetCode629();
    Assert.assertEquals(20, solution.kInversePairs(n, k));
  }

  @Test
  public void testProblemCase4() {
    // Input: n = 2, k = 0
    // Output: 1
    int n = 2, k = 0;
    LeetCode629 solution = new LeetCode629();
    Assert.assertEquals(1, solution.kInversePairs(n, k));
  }
}
