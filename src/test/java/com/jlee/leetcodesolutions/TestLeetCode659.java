package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode659;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode659 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,3,3,4,5};
    LeetCode659 solution = new LeetCode659();
    Assert.assertTrue(solution.isPossible(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,3,3,4,4,5,5};
    LeetCode659 solution = new LeetCode659();
    Assert.assertTrue(solution.isPossible(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,4,5};
    LeetCode659 solution = new LeetCode659();
    Assert.assertFalse(solution.isPossible(nums));
  }

  @Test
  public void testNotEnoughToCreate() {
    int[] nums = {1,2};
    LeetCode659 solution = new LeetCode659();
    Assert.assertFalse(solution.isPossible(nums));
  }

  @Test
  public void testNotEnoughToCreateToo() {
    int[] nums = {1,3};
    LeetCode659 solution = new LeetCode659();
    Assert.assertFalse(solution.isPossible(nums));
  }
}
