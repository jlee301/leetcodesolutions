package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode153;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode153 {
  @Test
  public void testProblemCase() {
    int[] nums = {4,5,6,7,0,1,2};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testLowBeginning() {
    int[] nums = {0,1,2,4,5,6,7};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testLowMiddle() {
    int[] nums = {5,6,7,0,1,2,4};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testLowEnd() {
    int[] nums = {1,2,4,5,6,7,0};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testTwoElements() {
    int[] nums = {1,2};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(1, solution.findMin(nums));
  }

  @Test
  public void testTwoElementsRotated() {
    int[] nums = {2,1};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(1, solution.findMin(nums));
  }

  @Test
  public void testOneElement() {
    int[] nums = {1};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(1, solution.findMin(nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode153 solution = new LeetCode153();
    Assert.assertEquals(0, solution.findMin(nums));
  }
}
