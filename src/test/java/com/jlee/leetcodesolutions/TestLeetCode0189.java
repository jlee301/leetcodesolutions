package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0189;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0189 {
  @Test
  public void testProblemCase1() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase2() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase3() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase4() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase5() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase6() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase7() {
    LeetCode0189 solution = new LeetCode0189();
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
  public void testProblemCase8() {
    LeetCode0189 solution = new LeetCode0189();
    int[] nums = { 1 };
    int k = 100;
    solution.rotate(nums, k);
    Assert.assertEquals(1, nums.length);
    Assert.assertEquals(1, nums[0]);
  }
}
