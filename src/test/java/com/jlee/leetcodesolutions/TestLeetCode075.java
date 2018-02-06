package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode075;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode075 {
  @Test
  public void testColorSort() {
    int[] nums = {1,0,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
  }

  @Test
  public void testColorSortDouble() {
    int[] nums = {0,1,2,1,0,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(1, nums[2]);
    Assert.assertEquals(1, nums[3]);
    Assert.assertEquals(2, nums[4]);
    Assert.assertEquals(2, nums[5]);
  }

  @Test
  public void testJustRed() {
    int[] nums = {0,0,0,0,0,0};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(0, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
    Assert.assertEquals(0, nums[5]);
  }

  @Test
  public void testJustWhite() {
    int[] nums = {1,1,1,1,1,1};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(1, nums[2]);
    Assert.assertEquals(1, nums[3]);
    Assert.assertEquals(1, nums[4]);
    Assert.assertEquals(1, nums[5]);
  }

  @Test
  public void testJustBlue() {
    int[] nums = {2,2,2,2,2,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(2, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(2, nums[3]);
    Assert.assertEquals(2, nums[4]);
    Assert.assertEquals(2, nums[5]);
  }

  @Test
  public void testJustOneEntry() {
    int[] nums = {1};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode075 solution = new LeetCode075();
    solution.sortColors(nums);
    Assert.assertNull(nums);
  }

  @Test
  public void testColorSortOnePass() {
    int[] nums = {1,0,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(2, nums[2]);
  }

  @Test
  public void testColorSortDoubleOnePass() {
    int[] nums = {0,1,2,1,0,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(1, nums[2]);
    Assert.assertEquals(1, nums[3]);
    Assert.assertEquals(2, nums[4]);
    Assert.assertEquals(2, nums[5]);
  }

  @Test
  public void testJustRedOnePass() {
    int[] nums = {0,0,0,0,0,0};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(0, nums[0]);
    Assert.assertEquals(0, nums[1]);
    Assert.assertEquals(0, nums[2]);
    Assert.assertEquals(0, nums[3]);
    Assert.assertEquals(0, nums[4]);
    Assert.assertEquals(0, nums[5]);
  }

  @Test
  public void testJustWhiteOnePass() {
    int[] nums = {1,1,1,1,1,1};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(1, nums[0]);
    Assert.assertEquals(1, nums[1]);
    Assert.assertEquals(1, nums[2]);
    Assert.assertEquals(1, nums[3]);
    Assert.assertEquals(1, nums[4]);
    Assert.assertEquals(1, nums[5]);
  }

  @Test
  public void testJustBlueOnePass() {
    int[] nums = {2,2,2,2,2,2};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(2, nums[0]);
    Assert.assertEquals(2, nums[1]);
    Assert.assertEquals(2, nums[2]);
    Assert.assertEquals(2, nums[3]);
    Assert.assertEquals(2, nums[4]);
    Assert.assertEquals(2, nums[5]);
  }

  @Test
  public void testJustOneEntryOnePass() {
    int[] nums = {1};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(1, nums[0]);
  }

  @Test
  public void testEmptyOnePass() {
    int[] nums = {};
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertEquals(0, nums.length);
  }

  @Test
  public void testNullOnePass() {
    int[] nums = null;
    LeetCode075 solution = new LeetCode075();
    solution.sortColorsOnePass(nums);
    Assert.assertNull(nums);
  }
}
