package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0485;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0485 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,1,0,1,1,1};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,1,1,0,1,1};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(3, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testProblemCase3() {
    int[] nums = {1,0,1,1,0,1};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(2, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testProblemCase4() {
    int[] nums = {1,0,1,0,1,0};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(1, solution.findMaxConsecutiveOnes(nums));
  }
  
  @Test
  public void testProblemCase5() {
    int[] nums = {1,1,1,1,1,1};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(6, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {0,0,0,0,0,0};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {};
    LeetCode0485 solution = new LeetCode0485();
    Assert.assertEquals(0, solution.findMaxConsecutiveOnes(nums));
  }
}
