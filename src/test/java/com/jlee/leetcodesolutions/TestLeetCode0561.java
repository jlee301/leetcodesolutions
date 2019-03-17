package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0561;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0561 {
  @Test
  public void testProblemCase1() {
    int[] nums = {4,5};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(4, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {4,5,7,8};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(11, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {4,5,7,8,20,25};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(31, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {5,20,4,25,7,8};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(31, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {-4,-3,-2,-1};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(-6, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {-4,-3,2};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(-2, solution.arrayPairSum(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {};
    LeetCode0561 solution = new LeetCode0561();
    Assert.assertEquals(0, solution.arrayPairSum(nums));
  }
}
