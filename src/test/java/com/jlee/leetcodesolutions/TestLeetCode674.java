package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode674;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode674 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,3,4};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(4, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {4,3,2,1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {3,4,5,1,2};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(3, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {4,5,1,2,3};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(3, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {4,5,1,2};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(2, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {8,9,10,3,4,2,1,2,3,4};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(4, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {8,9,10,3,4,2,11,12,13,14};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(5, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase9() {
    int[] nums = {1,1,1,1};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(1, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase10() {
    int[] nums = {};
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(0, solution.findLengthOfLCIS(nums));
  }

  @Test
  public void testProblemCase11() {
    int[] nums = null;
    LeetCode674 solution = new LeetCode674();
    Assert.assertEquals(0, solution.findLengthOfLCIS(nums));
  }
}
