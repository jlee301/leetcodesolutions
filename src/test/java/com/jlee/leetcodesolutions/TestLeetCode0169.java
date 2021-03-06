package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0169;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0169 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(1, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,1,2};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(1, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(Integer.MAX_VALUE, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {1,2,3,4};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(Integer.MAX_VALUE, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,2,2,2,4};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(2, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {4,4,2,2};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(Integer.MAX_VALUE, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {-4,-4,1,2};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(Integer.MAX_VALUE, solution.majorityElement(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {};
    LeetCode0169 solution = new LeetCode0169();
    Assert.assertEquals(Integer.MAX_VALUE, solution.majorityElement(nums));
  }
}
