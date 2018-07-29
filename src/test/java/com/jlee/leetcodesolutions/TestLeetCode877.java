package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode877;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode877 {
  @Test
  public void testProblemCase1() {
    // Input: [5,3,4,5]
    // Output: true
   int[] piles = {5,3,4,5};
   LeetCode877 solution = new LeetCode877();
   Assert.assertTrue(solution.stoneGame(piles));
  }

  @Test
  public void testProblemCase2() {
   int[] piles = {3,7,2,3};
   LeetCode877 solution = new LeetCode877();
   Assert.assertTrue(solution.stoneGame(piles));
  }
}
