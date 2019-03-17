package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0473;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0473 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,1,2,2,2};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertTrue(solution.makesquare(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,3,3,3,4};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));
  }

  @Test
  public void testSumNotDivisibleEquallyBy4() {
    int[] nums = {1,2,3,4};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));
  }

  @Test
  public void testSumDivisibleByFourButCannotSquare() {
    int[] nums = {0,0,0,0,8};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));
  }
  
  @Test
  public void testTLE() {
    int[] nums = {8,16,24,32,40,48,56,64,72,80,88,96,104,112,60};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));    
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0473 solution = new LeetCode0473();
    Assert.assertFalse(solution.makesquare(nums));
  }
}
