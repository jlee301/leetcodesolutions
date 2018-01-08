package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode561;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode561 {
  @Test
  public void testN1() {
    int[] nums = {4,5};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(4, solution.arrayPairSum(nums));
  }

  @Test
  public void testN2() {
    int[] nums = {4,5,7,8};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(11, solution.arrayPairSum(nums));
  }

  @Test
  public void testN3() {
    int[] nums = {4,5,7,8,20,25};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(31, solution.arrayPairSum(nums));
  }

  @Test
  public void testN3NotSorted() {
    int[] nums = {5,20,4,25,7,8};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(31, solution.arrayPairSum(nums));
  }

  @Test
  public void testN2Neg() {
    int[] nums = {-4,-3,-2,-1};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(-6, solution.arrayPairSum(nums));
  }

  @Test
  public void testNot2NArray() {
    int[] nums = {-4,-3,2};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(0, solution.arrayPairSum(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(0, solution.arrayPairSum(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode561 solution = new LeetCode561();
    Assert.assertEquals(0, solution.arrayPairSum(nums));
  }
}
