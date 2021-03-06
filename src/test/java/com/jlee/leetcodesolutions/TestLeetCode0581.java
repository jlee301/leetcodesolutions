package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0581;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0581 {
  @Test
  public void testProblemCase1() {
    int[] nums = {2, 6, 4, 8, 10, 9, 15};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(5, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {2, 3, 4, 5, 6, 7, 1, 8};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(7, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(8, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1, 1, 3, 2, 3, 2, 4, 4};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(4, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {-8, -7, -4, -5, -6, -3, -2, -1};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(3, solution.findUnsortedSubarray(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {};
    LeetCode0581 solution = new LeetCode0581();
    Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
  }
}
