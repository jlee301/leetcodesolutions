package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0950;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0950 {
  @Test
  public void testProblemCase1() {
    int[] deck = {17,13,11,2,3,5,7};
    LeetCode0950 solution = new LeetCode0950();
    Assert.assertArrayEquals(new int[] {2,13,3,11,5,17,7}, solution.deckRevealedIncreasing(deck));
  }

  @Test
  public void testProblemCase2() {
    int[] deck = {1,2,3,4};
    LeetCode0950 solution = new LeetCode0950();
    Assert.assertArrayEquals(new int[] {1,3,2,4}, solution.deckRevealedIncreasing(deck));
  }

  @Test
  public void testProblemCase3() {
    int[] deck = {1,2,3,4,5};
    LeetCode0950 solution = new LeetCode0950();
    Assert.assertArrayEquals(new int[] {1,5,2,4,3}, solution.deckRevealedIncreasing(deck));
  }
}
