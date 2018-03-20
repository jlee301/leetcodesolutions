package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode373;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode373 {
  @Test
  public void testProblemCase1() {
    int[] nums1 = {1,7,11};
    int[] nums2 = {2,4,6};
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(3, result.size());
    Assert.assertArrayEquals(new int[] {1,2}, result.get(0));
    Assert.assertArrayEquals(new int[] {1,4}, result.get(1));
    Assert.assertArrayEquals(new int[] {1,6}, result.get(2));
  }

  @Test
  public void testProblemCase2() {
    int[] nums1 = {1,1,2};
    int[] nums2 = {1,2,3};
    int k = 2;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(2, result.size());
    Assert.assertArrayEquals(new int[] {1,1}, result.get(0));
    Assert.assertArrayEquals(new int[] {1,1}, result.get(1));
  }

  @Test
  public void testProblemCase3() {
    int[] nums1 = {1,2};
    int[] nums2 = {3};
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(2, result.size());
    Assert.assertArrayEquals(new int[] {1,3}, result.get(0));
    Assert.assertArrayEquals(new int[] {2,3}, result.get(1));
  }

  @Test
  public void testKZero() {
    int[] nums1 = {1,2};
    int[] nums2 = {3};
    int k = 0;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNums1Empty() {
    int[] nums1 = {};
    int[] nums2 = {3};
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNums2Empty() {
    int[] nums1 = {1,2};
    int[] nums2 = {};
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNums1Null() {
    int[] nums1 = null;
    int[] nums2 = {3};
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNums2Null() {
    int[] nums1 = {1,2};
    int[] nums2 = null;
    int k = 3;
    LeetCode373 solution = new LeetCode373();
    List<int[]> result = solution.kSmallestPairs(nums1, nums2, k);
    Assert.assertEquals(0, result.size());
  }
}
