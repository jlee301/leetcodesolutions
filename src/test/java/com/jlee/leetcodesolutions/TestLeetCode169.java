package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode169;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode169 {
  @Test
  public void test1N() {
    int[] nums = {1};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(1, solution.majorityElement(nums));
  }

  @Test
  public void test2N() {
    int[] nums = {1,2};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(1, solution.majorityElement(nums));
  }

  @Test
  public void test3N() {
    int[] nums = {1,2,3};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(1, solution.majorityElement(nums));
  }

  @Test
  public void test4NAllUnique() {
    int[] nums = {1,2,3,4};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(0, solution.majorityElement(nums));
  }

  @Test
  public void test4NOneMulti() {
    int[] nums = {1,2,2,4};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(2, solution.majorityElement(nums));
  }

  @Test
  public void test4NTwoMulti() {
    int[] nums = {4,4,2,2};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(2, solution.majorityElement(nums));
  }

  @Test
  public void test4NNegOneMulti() {
    int[] nums = {-4,-4,1,2};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(-4, solution.majorityElement(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(0, solution.majorityElement(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode169 solution = new LeetCode169();
    Assert.assertEquals(0, solution.majorityElement(nums));
  }
}
