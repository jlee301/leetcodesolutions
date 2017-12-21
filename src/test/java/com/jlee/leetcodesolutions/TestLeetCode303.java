package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode303;
import com.jlee.leetcodesolutions.NumArray;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode303 {
  @Test
  public void testProblemCase1() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(1, solution.sumRange(0, 2));
    Assert.assertEquals(-1, solution.sumRange(2, 5));
    Assert.assertEquals(-3, solution.sumRange(0, 5));
  }

  @Test
  public void testIJSame() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(-2, solution.sumRange(0, 0));
    Assert.assertEquals(0, solution.sumRange(1, 1));
    Assert.assertEquals(3, solution.sumRange(2, 2));
    Assert.assertEquals(-5, solution.sumRange(3, 3));
    Assert.assertEquals(2, solution.sumRange(4, 4));
    Assert.assertEquals(-1, solution.sumRange(5, 5));
  }

  @Test
  public void testIGreaterThanJ() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(5, 0));
  }

  @Test
  public void testOutOfRange() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(-1, 5));
    Assert.assertEquals(0, solution.sumRange(0, 6));
    Assert.assertEquals(0, solution.sumRange(5, 0));
  }

  @Test
  public void testNumsEmpty() {
    int[] nums = {};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 5));
  }

  @Test
  public void testNumsNull() {
    int[] nums = null;
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 5));
  }
  
  @Test
  public void testProblemCase1Cached() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(1, solution.sumRangeCached(0, 2));
    Assert.assertEquals(-1, solution.sumRangeCached(2, 5));
    Assert.assertEquals(-3, solution.sumRangeCached(0, 5));
  }

  @Test
  public void testIJSameCached() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(-2, solution.sumRangeCached(0, 0));
    Assert.assertEquals(0, solution.sumRangeCached(1, 1));
    Assert.assertEquals(3, solution.sumRangeCached(2, 2));
    Assert.assertEquals(-5, solution.sumRangeCached(3, 3));
    Assert.assertEquals(2, solution.sumRangeCached(4, 4));
    Assert.assertEquals(-1, solution.sumRangeCached(5, 5));
  }

  @Test
  public void testIGreaterThanJCached() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRangeCached(5, 0));
  }

  @Test
  public void testOutOfRangeCached() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRangeCached(-1, 5));
    Assert.assertEquals(0, solution.sumRangeCached(0, 6));
    Assert.assertEquals(0, solution.sumRangeCached(5, 0));
  }

  @Test
  public void testNumsEmptyCached() {
    int[] nums = {};
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRangeCached(0, 5));
  }

  @Test
  public void testNumsNullCached() {
    int[] nums = null;
    NumArray solution = new NumArray(nums);
    Assert.assertEquals(0, solution.sumRangeCached(0, 5));
  }
}
