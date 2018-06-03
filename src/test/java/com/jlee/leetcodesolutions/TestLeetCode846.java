package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode846;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode846 {
  @Test
  public void testProblemCase1() {
    // Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
    // Output: true
    int[] hand = {1,2,3,6,2,3,4,7,8};
    int W = 3;
    LeetCode846 solution = new LeetCode846();
    Assert.assertTrue(solution.isNStraightHand(hand, W));
  }

  @Test
  public void testProblemCase2() {
    // Input: hand = [1,2,3,4,5], W = 4
    // Output: false
    int[] hand = {1,2,3,4,5};
    int W = 4;
    LeetCode846 solution = new LeetCode846();
    Assert.assertFalse(solution.isNStraightHand(hand, W));
  }

  @Test
  public void testSplitsOfThree() {
    int[] hand = {1,1,1,2,2,2,3,3,3};
    int W = 3;
    LeetCode846 solution = new LeetCode846();
    Assert.assertTrue(solution.isNStraightHand(hand, W));
  }
  
  @Test
  public void testSplitsOfThreeMissingElements() {
    int[] hand = {1,1,1,2,2,2,4,4,4};
    int W = 3;
    LeetCode846 solution = new LeetCode846();
    Assert.assertFalse(solution.isNStraightHand(hand, W));
  }
  
  @Test
  public void testNotEnoughElements() {
    int[] hand = {1,1,2,2,3,3};
    int W = 3;
    LeetCode846 solution = new LeetCode846();
    Assert.assertFalse(solution.isNStraightHand(hand, W));
  }

  @Test
  public void testDivisibleButNotEnoughCards() {
    // Input: hand = [1,2,3,4], W = 4
    // Output: false
    int[] hand = {1,2,3,4};
    int W = 4;
    LeetCode846 solution = new LeetCode846();
    Assert.assertFalse(solution.isNStraightHand(hand, W));
  }
}
