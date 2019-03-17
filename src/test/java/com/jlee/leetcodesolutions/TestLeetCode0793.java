package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0793;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0793 {
  @Test
  public void testProblemCase1() {
    // Input: K = 0
    // Output: 5
    int K = 0;
    LeetCode0793 solution = new LeetCode0793();
    Assert.assertEquals(5, solution.preimageSizeFZF(K));
  }

  @Test
  public void testProblemCase2() {
    // Input: K = 5
    // Output: 0
    int K = 5;
    LeetCode0793 solution = new LeetCode0793();
    Assert.assertEquals(0, solution.preimageSizeFZF(K));
  }
}
