package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode215;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode215 {
  @Test
  public void testK1() {
    int[] nums = {3,2,1,5,6,4};
    int k = 1;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(6, solution.findKthLargest(nums, k));
  }

  @Test
  public void testK2() {
    int[] nums = {3,2,1,5,6,4};
    int k = 2;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(5, solution.findKthLargest(nums, k));
  }

  @Test
  public void testK3() {
    int[] nums = {3,2,1,5,6,4};
    int k = 3;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(4, solution.findKthLargest(nums, k));
  }

  @Test
  public void testK4() {
    int[] nums = {3,2,1,5,6,4};
    int k = 4;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(3, solution.findKthLargest(nums, k));
  }

  @Test
  public void testK5() {
    int[] nums = {3,2,1,5,6,4};
    int k = 5;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(2, solution.findKthLargest(nums, k));
  }

  @Test
  public void testK6() {
    int[] nums = {3,2,1,5,6,4};
    int k = 6;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(1, solution.findKthLargest(nums, k));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int k = 6;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(Integer.MIN_VALUE, solution.findKthLargest(nums, k));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int k = 6;
    LeetCode215 solution = new LeetCode215();
    Assert.assertEquals(Integer.MIN_VALUE, solution.findKthLargest(nums, k));
  }
}
