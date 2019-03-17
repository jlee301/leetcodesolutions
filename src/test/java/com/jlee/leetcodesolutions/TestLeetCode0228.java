package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0228;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0228 {
  @Test
  public void testProblemCase1() {
    int[] nums = {0,1,2,4,5,7};
    LeetCode0228 solution = new LeetCode0228();
    List<String> result = solution.summaryRanges(nums);
    Assert.assertEquals(3, result.size());
    Assert.assertEquals("0->2", result.get(0));
    Assert.assertEquals("4->5", result.get(1));
    Assert.assertEquals("7", result.get(2));
  }
  
  @Test
  public void testProblemCase2() {
    int[] nums = {0,2,3,4,6,8,9};
    LeetCode0228 solution = new LeetCode0228();
    List<String> result = solution.summaryRanges(nums);
    Assert.assertEquals(4, result.size());
    Assert.assertEquals("0", result.get(0));
    Assert.assertEquals("2->4", result.get(1));
    Assert.assertEquals("6", result.get(2));
    Assert.assertEquals("8->9", result.get(3));
  }

  @Test
  public void testEntireArrayContinuous() {
    int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
    LeetCode0228 solution = new LeetCode0228();
    List<String> result = solution.summaryRanges(nums);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals("0->10", result.get(0));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0228 solution = new LeetCode0228();
    List<String> result = solution.summaryRanges(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0228 solution = new LeetCode0228();
    List<String> result = solution.summaryRanges(nums);
    Assert.assertEquals(0, result.size());
  }
}
