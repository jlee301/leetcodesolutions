package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0031;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0031 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,3};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(3, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(3, nums[1]);
    Assert.assertEquals(2, nums[2]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {3,2,1};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(3, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,1,5};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(3, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(5, nums[1]);
    Assert.assertEquals(1, nums[2]);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1,5,8,4,7,6,5,3,1};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(9, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(5, nums[1]);
    Assert.assertEquals(8, nums[2]);
    Assert.assertEquals(5, nums[3]);
    Assert.assertEquals(1, nums[4]);
    Assert.assertEquals(3, nums[5]);
    Assert.assertEquals(4, nums[6]);
    Assert.assertEquals(6, nums[7]);
    Assert.assertEquals(7, nums[8]);
  }

  @Test
  public void testOneNumber() {
    int[] nums = {1};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(1, nums.length);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0031 solution = new LeetCode0031();
    solution.nextPermutation(nums);
    Assert.assertNull(nums);
  }
}
