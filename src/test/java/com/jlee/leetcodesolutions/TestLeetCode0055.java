package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0055;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0055 {
  @Test
  public void testProblemCase1() {
    int[] nums = {2,3,1,1,4};
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertTrue(solution.canJump(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,2,1,0,4};
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertFalse(solution.canJump(nums));
  }

  @Test
  public void testTimeLimit() {
    int[] nums = {8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertTrue(solution.canJump(nums));
  }

  @Test
  public void testTimeLimit2() {
    int[] nums = {2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6};
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertFalse(solution.canJump(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertFalse(solution.canJump(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0055 solution = new LeetCode0055();
    Assert.assertFalse(solution.canJump(nums));
  }
}
