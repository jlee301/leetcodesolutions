package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode496;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode496 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {4,1,2};
    int[] nums2 = {1,3,4,2};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(3, result[1]);
    Assert.assertEquals(-1, result[2]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {2,4};
    int[] nums2 = {1,2,3,4};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testDescNum2() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = {4,3,2,1};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
    Assert.assertEquals(-1, result[2]);
    Assert.assertEquals(-1, result[3]);
  }

  @Test
  public void testAscNum2() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = {1,2,3,4};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(4, result[1]);
    Assert.assertEquals(3, result[2]);
    Assert.assertEquals(2, result[3]);
  }

  @Test
  public void testEmptyNum1() {
    int[] nums1 = {};
    int[] nums2 = {1,2,3,4};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }

  @Test
  public void testEmptyNum2() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = {};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }
  
  @Test
  public void testEmpty() {
    int[] nums1 = {};
    int[] nums2 = {};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }

  @Test
  public void testNullNum1() {
    int[] nums1 = null;
    int[] nums2 = {1,2,3,4};
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }

  @Test
  public void testNullNum2() {
    int[] nums1 = {4,3,2,1};
    int[] nums2 = null;
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }
  
  @Test
  public void testNull() {
    int[] nums1 = null;
    int[] nums2 = null;
    LeetCode496 solution = new LeetCode496();
    int[] result = solution.nextGreaterElement(nums1, nums2);
    Assert.assertEquals(-1, result[0]);
  }
}
