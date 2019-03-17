package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0643;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0643 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) 12.75, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,3,4};
    int k = 4;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) 2.5, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5};
    int k = 4;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) 3.5, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {-10000,-10000,10000,10000,10000};
    int k = 4;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) 5000, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {-10000,-5000,10000,1,9999};
    int k = 1;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) 10000, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1,2,3,4};
    int k = 5;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals((double) -300_000_000, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {-1};
    int k = 1;
    LeetCode0643 solution = new LeetCode0643();
    Assert.assertEquals(-1.0, solution.findMaxAverage(nums, k), 0);
  }
}
