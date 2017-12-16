package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode189;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode189 {
  @Test
  public void test1Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 1;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(4, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(3, nums[3]);
  }

  @Test
  public void test2Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 2;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(3, nums[0]);
    Assert.assertEquals(4, nums[1]);
    Assert.assertEquals(1, nums[2]);
    Assert.assertEquals(2, nums[3]);
  }

  @Test
  public void test3Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 3;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(2, nums[0]);
    Assert.assertEquals(3, nums[1]);
    Assert.assertEquals(4, nums[2]);
    Assert.assertEquals(1, nums[3]);
  }

  @Test
  public void test4Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 4;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
  }

  @Test
  public void test5Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 5;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(4, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(3, nums[3]);
  }

  @Test
  public void test8Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 8;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
  }

  @Test
  public void test0Rotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = 0;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
  }

  @Test
  public void testOneEntry() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1 };
    int k = 100;
    solution.rotate(nums, k);
    Assert.assertEquals(1, nums.length);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testNegRotate() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = { 1, 2, 3, 4 };
    int k = -1;
    solution.rotate(nums, k);
    Assert.assertEquals(4, nums.length);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(3, nums[2]);
    Assert.assertEquals(4, nums[3]);
  }

  @Test
  public void testEmpty() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = {};
    int k = 100;
    solution.rotate(nums, k);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNull() {
    LeetCode189 solution = new LeetCode189();
    int[] nums = null;
    int k = 100;
    solution.rotate(nums, k);
    Assert.assertNull(nums);
  }
}
