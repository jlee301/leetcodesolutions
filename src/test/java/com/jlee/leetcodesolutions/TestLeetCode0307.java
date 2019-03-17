package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0307;
import com.jlee.leetcodesolutions.LeetCode0307.NumArray;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0307 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,3,5};
    LeetCode0307 container = new LeetCode0307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(9, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(8, solution.sumRange(0, 2));    
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0307 container = new LeetCode0307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(0, solution.sumRange(0, 2));    
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0307 container = new LeetCode0307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(0, solution.sumRange(0, 2));    
  }
}
