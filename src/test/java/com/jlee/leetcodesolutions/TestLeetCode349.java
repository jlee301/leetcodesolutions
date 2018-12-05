package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode349;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode349 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {1, 3};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase3() {
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
  public void testProblemCase4() {
    int[] nums1 = {1, 1, 2, 2};
    int[] nums2 = {1, 2, 1, 2};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(2, result.length);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase5() {
    int[] nums1 = {1, 1, 1, 1};
    int[] nums2 = {1, 1};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(1, result.length);
    Assert.assertEquals(1, result[0]);
  }

  @Test
  public void testProblemCase6() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {5, 6};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase7() {
    int[] nums1 = {};
    int[] nums2 = {5, 6};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase8() {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testProblemCase9() {
    int[] nums1 = {};
    int[] nums2 = {};
    LeetCode349 solution = new LeetCode349();
    int[] result = solution.intersection(nums1, nums2);
    Assert.assertEquals(0, result.length);
  }
}
