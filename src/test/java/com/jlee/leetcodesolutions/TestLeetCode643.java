package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode643;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode643 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,12,-5,-6,50,3};
    int k = 4;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 12.75, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testExactlyFour() {
    int[] nums = {1,2,3,4};
    int k = 4;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 2.5, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testFive() {
    int[] nums = {1,2,3,4,5};
    int k = 4;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 3.5, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testEdgeCases() {
    int[] nums = {-10000,-10000,10000,10000,10000};
    int k = 4;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 5000, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testK1() {
    int[] nums = {-10000,-5000,10000,1,9999};
    int k = 1;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 10000, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testKMoreThanNums() {
    int[] nums = {1,2,3,4};
    int k = 5;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 0, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testKLessThan1() {
    int[] nums = {1,2,3,4};
    int k = 0;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 0, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 1;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 0, solution.findMaxAverage(nums, k), 0);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 1;
    LeetCode643 solution = new LeetCode643();
    Assert.assertEquals((double) 0, solution.findMaxAverage(nums, k), 0);
  }
}
