package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0136;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0136 {
  @Test
  public void testProblemCase1() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 1, 2, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 1, 1, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 2, 2, 3, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 2, 2, 1, 3, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 2, 2, 1, 1, 3 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 3, 2, 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 2, 3, 2, 1, 1 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 1, 2, 3, 1, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase11() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 1, 1, -5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(-5, result);
  }

  @Test
  public void testProblemCase12() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { -5, 1, -5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase13() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { -5, 1, -5, 1, 2, 2 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(Integer.MIN_VALUE, result);
  }

  @Test
  public void testProblemCase14() {
    LeetCode0136 solution = new LeetCode0136();
    int[] nums = { 5, 0, 5 };
    int result = solution.singleNumber(nums);
    Assert.assertEquals(0, result);
  }
}
