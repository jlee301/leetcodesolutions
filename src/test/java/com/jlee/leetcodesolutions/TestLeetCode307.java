package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode307;
import com.jlee.leetcodesolutions.LeetCode307.NumArray;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode307 {
  @Test
  public void testProblemCase() {
    int[] nums = {1,3,5};
    LeetCode307 container = new LeetCode307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(9, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(8, solution.sumRange(0, 2));    
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode307 container = new LeetCode307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(0, solution.sumRange(0, 2));    
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode307 container = new LeetCode307();
    NumArray solution = container.new NumArray(nums);
    Assert.assertEquals(0, solution.sumRange(0, 2));
    solution.update(1, 2);
    Assert.assertEquals(0, solution.sumRange(0, 2));    
  }
}
