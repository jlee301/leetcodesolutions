package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0334;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0334 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 2, 3, 4, 5};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertTrue(solution.increasingTriplet(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {5, 4, 3, 2, 1};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTriplet(nums));
  }

  @Test
  public void testIncreasing() {
    int[] nums = {10, 1, 9, 2, 11, 3, 8, 7, 6};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertTrue(solution.increasingTriplet(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTriplet(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTriplet(nums));
  }
  
  @Test
  public void testProblemCase1OnePass() {
    int[] nums = {1, 2, 3, 4, 5};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertTrue(solution.increasingTripletOnePass(nums));
  }

  @Test
  public void testProblemCase2OnePass() {
    int[] nums = {5, 4, 3, 2, 1};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTripletOnePass(nums));
  }

  @Test
  public void testIncreasingOnePass() {
    int[] nums = {10, 1, 9, 2, 11, 3, 8, 7, 6};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertTrue(solution.increasingTripletOnePass(nums));
  }

  @Test
  public void testEmptyOnePass() {
    int[] nums = {};
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTripletOnePass(nums));
  }

  @Test
  public void testNullOnePass() {
    int[] nums = null;
    LeetCode0334 solution = new LeetCode0334();
    Assert.assertFalse(solution.increasingTripletOnePass(nums));
  }
}
