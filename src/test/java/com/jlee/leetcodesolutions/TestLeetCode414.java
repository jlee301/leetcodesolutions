package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode414;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode414 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 2, 1};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(1, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1, 2};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {2, 2, 3, 1};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(1, solution.thirdMax(nums));
  }

  @Test
  public void testDistinct2Outside() {
    int[] nums = {2, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testDistinct3Inside() {
    int[] nums = {1, 2, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(2, solution.thirdMax(nums));
  }

  @Test
  public void testDistinct1Outside() {
    int[] nums = {3, 3, 4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testAllTheSame() {
    int[] nums = {4, 4, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testNeg() {
    int[] nums = {-1, -2, -2, -3, -4, -4, -4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(-3, solution.thirdMax(nums));
  }

  @Test
  public void testTwoInt() {
    int[] nums = {3, 4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testOneInt() {
    int[] nums = {4};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(4, solution.thirdMax(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(0, solution.thirdMax(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode414 solution = new LeetCode414();
    Assert.assertEquals(0, solution.thirdMax(nums));
  }
}
