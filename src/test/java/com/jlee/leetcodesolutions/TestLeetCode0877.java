package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0877;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0877 {
  @Test
  public void testProblemCase1() {
    // Input: [5,3,4,5]
    // Output: true
   int[] piles = {5,3,4,5};
   LeetCode0877 solution = new LeetCode0877();
   Assert.assertTrue(solution.stoneGame(piles));
  }

  @Test
  public void testProblemCase2() {
   int[] piles = {3,7,2,3};
   LeetCode0877 solution = new LeetCode0877();
   Assert.assertTrue(solution.stoneGame(piles));
  }
}
