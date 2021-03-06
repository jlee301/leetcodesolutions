package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0852;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0852 {
  @Test
  public void testProblemCase1() {
    // Input: [0,1,0]
    // Output: 1
    int[] A = {0,1,0};
    LeetCode0852 solution = new LeetCode0852();
    Assert.assertEquals(1, solution.peakIndexInMountainArray(A));
  }

  @Test
  public void testProblemCase2() {
    // Input: [0,2,1,0]
    // Output: 1
    int[] A = {0,2,1,0};
    LeetCode0852 solution = new LeetCode0852();
    Assert.assertEquals(1, solution.peakIndexInMountainArray(A));
  }

  @Test
  public void testAllFlat() {
    int[] A = {0,0,0,0};
    LeetCode0852 solution = new LeetCode0852();
    Assert.assertEquals(-1, solution.peakIndexInMountainArray(A));
  }

  @Test
  public void testOnlyDescends() {
    int[] A = {3,2,1,0};
    LeetCode0852 solution = new LeetCode0852();
    Assert.assertEquals(-1, solution.peakIndexInMountainArray(A));
  }

  @Test
  public void testOnlyAscends() {
    int[] A = {0,1,2,3};
    LeetCode0852 solution = new LeetCode0852();
    Assert.assertEquals(-1, solution.peakIndexInMountainArray(A));
  }
}
