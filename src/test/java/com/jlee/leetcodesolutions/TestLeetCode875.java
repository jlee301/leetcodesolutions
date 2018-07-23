package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode875;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode875 {
  @Test
  public void testProblemCase1() {
    // Input: piles = [3,6,7,11], H = 8
    // Output: 4
    int[] piles = {3,6,7,11};
    int H = 8;
    LeetCode875 solution = new LeetCode875();
    Assert.assertEquals(4, solution.minEatingSpeed(piles, H));
  }

  @Test
  public void testProblemCase2() {
    // Input: piles = [30,11,23,4,20], H = 5
    // Output: 30
    int[] piles = {30,11,23,4,20};
    int H = 5;
    LeetCode875 solution = new LeetCode875();
    Assert.assertEquals(30, solution.minEatingSpeed(piles, H));
  }

  @Test
  public void testProblemCase3() {
    // Input: piles = [30,11,23,4,20], H = 6
    // Output: 23
    int[] piles = {30,11,23,4,20};
    int H = 6;
    LeetCode875 solution = new LeetCode875();
    Assert.assertEquals(23, solution.minEatingSpeed(piles, H));
  }
}
