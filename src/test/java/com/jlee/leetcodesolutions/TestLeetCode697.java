package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode697;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode697 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 2, 2, 3, 1};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(2, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,2,3,1,4,2};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(6, solution.findShortestSubArray(nums));
  }

  @Test
  public void testAllUnique() {
    int[] nums = {1,2,3,4,5,6,7};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(1, solution.findShortestSubArray(nums));
  }

  @Test
  public void testAllSame() {
    int[] nums = {1,1,1,1,1,1,1,1};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(8, solution.findShortestSubArray(nums));
  }

  @Test
  public void testTwoUniqueSameDegreeAlternating() {
    int[] nums = {1,2,1,2,1,2,1,2};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(7, solution.findShortestSubArray(nums));
  }

  @Test
  public void testTwoUniqueSameDegreeHalf() {
    int[] nums = {1,1,1,1,2,2,2,2};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(4, solution.findShortestSubArray(nums));
  }

  @Test
  public void testSingleNumber() {
    int[] nums = {1};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(1, solution.findShortestSubArray(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(0, solution.findShortestSubArray(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode697 solution = new LeetCode697();
    Assert.assertEquals(0, solution.findShortestSubArray(nums));
  }
}
