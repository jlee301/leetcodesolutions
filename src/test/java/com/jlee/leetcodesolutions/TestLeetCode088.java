package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode088;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode088 {
  @Test
  public void theProblemCase1() {
    LeetCode088 solution = new LeetCode088();
    int[] nums1 = { 3, 0, 0 };
    int m = 1;
    int[] nums2 = { 1, 2 };
    int n = 2;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(2, nums1[1]);
    Assert.assertEquals(3, nums1[2]);
    Assert.assertEquals(3, nums1.length);
  }

  @Test
  public void theProblemCase2() {
    LeetCode088 solution = new LeetCode088();
    int[] nums1 = { 1, 2, 0 };
    int m = 2;
    int[] nums2 = { 3 };
    int n = 1;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(2, nums1[1]);
    Assert.assertEquals(3, nums1[2]);
    Assert.assertEquals(3, nums1.length);
  }

  @Test
  public void theProblemCase3() {
    LeetCode088 solution = new LeetCode088();
    int[] nums1 = { 3, 0, 0, 0 };
    int m = 1;
    int[] nums2 = { 1, 2 };
    int n = 2;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(2, nums1[1]);
    Assert.assertEquals(3, nums1[2]);
    Assert.assertEquals(0, nums1[3]);
    Assert.assertEquals(4, nums1.length);
  }
  
  @Test
  public void theProblemCase4() {
    LeetCode088 solution = new LeetCode088();
    int[] nums1 = { 1 };
    int m = 1;
    int[] nums2 = {};
    int n = 0;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(1, nums1.length);
  }

  @Test
  public void theProblemCase5() {
    LeetCode088 solution = new LeetCode088();
    // N1 is technically not empty, it has to be initialized at least m+n (1), where
    // m=0 to indicate there's no values.
    int[] nums1 = { 0 };
    int m = 0;
    int[] nums2 = { 1 };
    int n = 1;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(1, nums1.length);
  }

  @Test
  public void theProblemCase6() {
    LeetCode088 solution = new LeetCode088();
    // N1 is technically not empty, it has to be initialized at least m+n (1), where
    // m=0 to indicate there's no values.
    int[] nums1 = { 0, 0 };
    int m = 0;
    int[] nums2 = { 1 };
    int n = 1;
    solution.merge(nums1, m, nums2, n);
    Assert.assertEquals(1, nums1[0]);
    Assert.assertEquals(0, nums1[1]);
    Assert.assertEquals(2, nums1.length);
  }
}
