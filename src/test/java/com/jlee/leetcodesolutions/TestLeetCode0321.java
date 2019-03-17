package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0321;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0321 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {3, 4, 6, 5};
    int[] nums2 = {9, 1, 2, 5, 8, 3};
    int k = 5;
    LeetCode0321 solution = new LeetCode0321();
    Assert.assertArrayEquals(new int[] {9, 8, 6, 5, 3}, solution.maxNumber(nums1, nums2, k));
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {6, 7};
    int[] nums2 = {6, 0, 4};
    int k = 5;
    LeetCode0321 solution = new LeetCode0321();
    Assert.assertArrayEquals(new int[] {6, 7, 6, 0, 4}, solution.maxNumber(nums1, nums2, k));
  }

  @Test
  public void testProblemCase3() {
    int[] nums1 = {3, 9};
    int[] nums2 = {8, 9};
    int k = 3;
    LeetCode0321 solution = new LeetCode0321();
    Assert.assertArrayEquals(new int[] {9, 8, 9}, solution.maxNumber(nums1, nums2, k));

  }
  @Test
  public void testProblemCase4() {
    int[] nums1 = {9, 1, 2, 5, 8, 3};
    int[] nums2 = {3, 4, 6, 5};
    int k = 5;
    LeetCode0321 solution = new LeetCode0321();
    Assert.assertArrayEquals(new int[] {9, 8, 6, 5, 3}, solution.maxNumber(nums1, nums2, k));
  }
}
