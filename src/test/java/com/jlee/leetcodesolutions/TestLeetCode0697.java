package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0697;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0697 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1, 2, 2, 3, 1};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(2, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,2,3,1,4,2};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(6, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5,6,7};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(1, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1,1,1,1,1,1,1,1};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(8, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,2,1,2,1,2,1,2};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(7, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1,1,1,1,2,2,2,2};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(4, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {1};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(1, solution.findShortestSubArray(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {};
    LeetCode0697 solution = new LeetCode0697();
    Assert.assertEquals(0, solution.findShortestSubArray(nums));
  }
}
