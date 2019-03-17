package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0004;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0004 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {1,3}, nums2 = {2};
    LeetCode0004 solution = new LeetCode0004();
    Assert.assertEquals(2.0, solution.findMedianSortedArrays(nums1, nums2), 0.0);
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {1,2}, nums2 = {3,4};
    LeetCode0004 solution = new LeetCode0004();
    Assert.assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0);
  }

  @Test
  public void testProblemCase3() {
    int[] nums1 = {3,4}, nums2 = {1,2};
    LeetCode0004 solution = new LeetCode0004();
    Assert.assertEquals(2.5, solution.findMedianSortedArrays(nums1, nums2), 0.0);
  }
  
  @Test
  public void testProblemCase4() {
    int[] nums1 = {3}, nums2 = {Integer.MAX_VALUE,4};
    LeetCode0004 solution = new LeetCode0004();
    Assert.assertEquals(Double.MIN_VALUE, solution.findMedianSortedArrays(nums1, nums2), 0.0);
  }
}
