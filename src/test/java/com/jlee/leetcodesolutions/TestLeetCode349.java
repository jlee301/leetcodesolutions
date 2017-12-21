package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode349;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode349 {
  @Test
  public void testProblemCase() {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testTwoIntersect() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {1, 3};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testAllIntersect() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {1, 2, 3, 4};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(4, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
    Assert.assertEquals(3, result[2]);
    Assert.assertEquals(4, result[3]);
  }

  @Test
  public void testMultipleDupes() {
    int[] nums1 = {1, 1, 2, 2};
    int[] nums2 = {1, 2, 1, 2};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testAllSameNumbers() {
    int[] nums1 = {1, 1, 1, 1};
    int[] nums2 = {1, 1};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(1, result[0]);
  }

  @Test
  public void testEverythingUnique() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {5, 6};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmptyNums1() {
    int[] nums1 = {};
    int[] nums2 = {5, 6};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmptyNums2() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testEmpty() {
    int[] nums1 = {};
    int[] nums2 = {};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNullNums1() {
    int[] nums1 = null;
    int[] nums2 = {5, 6};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNullNums2() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = null;
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNull() {
    int[] nums1 = null;
    int[] nums2 = null;
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }
}
