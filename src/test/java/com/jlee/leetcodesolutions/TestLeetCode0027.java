package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0027;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0027 {
  @Test
  public void theProblemCase1() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = { 3, 2, 2, 3 };
    int val = 3;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(2, result);
    Assert.assertEquals(2, nums[0]);
    Assert.assertEquals(2, nums[1]);
  }

  @Test
  public void theProblemCase2() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = { 3, 2, 2, 3 };
    int val = 4;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(4, result);
    Assert.assertEquals(3, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(3, nums[3]);
  }

  @Test
  public void theProblemCase3() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = { 3, 3, 3, 2 };
    int val = 3;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(1, result);
    Assert.assertEquals(2, nums[0]);
  }

  @Test
  public void theProblemCase4() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = { 3, 3, 3, 3 };
    int val = 3;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(0, result);
  }

  @Test
  public void theProblemCase5() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = {};
    int val = 3;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(0, result);
  }

  @Test
  public void theProblemCase6() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = null;
    int val = 3;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(0, result);
  }

  @Test
  public void theProblemCase7() {
    LeetCode0027 solution = new LeetCode0027();
    int[] nums = {1};
    int val = 1;
    int result = solution.removeElement(nums, val);
    Assert.assertEquals(0, result);
  }
}
