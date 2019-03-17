package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0041;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0041 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,0};
    LeetCode0041 solution = new LeetCode0041();
    Assert.assertEquals(3, solution.firstMissingPositive(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,4,-1,1};
    LeetCode0041 solution = new LeetCode0041();
    Assert.assertEquals(2, solution.firstMissingPositive(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {7,8,9,11,12};
    LeetCode0041 solution = new LeetCode0041();
    Assert.assertEquals(1, solution.firstMissingPositive(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {5,4,3,2,1,0,-1,-2};
    LeetCode0041 solution = new LeetCode0041();
    Assert.assertEquals(6, solution.firstMissingPositive(nums));
  }

}
