package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0496;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0496 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {4,1,2};
    int[] nums2 = {1,3,4,2};
    LeetCode0496 solution = new LeetCode0496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(3, result[1]);
    Assert.assertEquals(-1, result[2]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {2,4};
    int[] nums2 = {1,2,3,4};
    LeetCode0496 solution = new LeetCode0496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testProblemCase3() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = {4,3,2,1};
    LeetCode0496 solution = new LeetCode0496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
    Assert.assertEquals(-1, result[2]);
    Assert.assertEquals(-1, result[3]);
  }

  @Test
  public void testProblemCase4() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = {1,2,3,4};
    LeetCode0496 solution = new LeetCode0496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(4, result[1]);
    Assert.assertEquals(3, result[2]);
    Assert.assertEquals(2, result[3]);
  }
}
