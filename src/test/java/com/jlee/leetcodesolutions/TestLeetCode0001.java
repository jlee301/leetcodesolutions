package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0001;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0001 {

  @Test
  public void theProblemCase1() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 2, 7, 11, 15 };
    int target = 9;
    Assert.assertArrayEquals(new int[] {0,1}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase2() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 11, 2, 7, 15 };
    int target = 9;
    Assert.assertArrayEquals(new int[] {1,2}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase3() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 11, 15, 2, 7 };
    int target = 9;
    Assert.assertArrayEquals(new int[] {2,3}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase4() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 11, 15, 16, 17 };
    int target = 9;
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase5() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 11 };
    int target = 9;
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase6() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 5, 5 };
    int target = 10;
    Assert.assertArrayEquals(new int[] {0,1}, solution.twoSum(nums, target));
  }

  @Test
  public void theProblemCase7() {
    LeetCode0001 solution = new LeetCode0001();
    int[] nums = new int[] { 5 };
    int target = 10;
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.twoSum(nums, target));
  }
}
