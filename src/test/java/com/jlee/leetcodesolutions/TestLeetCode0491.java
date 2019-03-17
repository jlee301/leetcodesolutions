package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0491;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0491 {
  @Test
  public void testProblemCase() {
    int[] nums = {4, 6, 7, 7};
    LeetCode0491 solution = new LeetCode0491();
    List<List<Integer>> result = solution.findSubsequences(nums);
    Assert.assertEquals(8, result.size());
    Assert.assertTrue(result.contains(Arrays.asList(7,7)));
    Assert.assertTrue(result.contains(Arrays.asList(6,7)));
    Assert.assertTrue(result.contains(Arrays.asList(4,6)));
    Assert.assertTrue(result.contains(Arrays.asList(4,6,7,7)));
    Assert.assertTrue(result.contains(Arrays.asList(4,7,7)));
    Assert.assertTrue(result.contains(Arrays.asList(4,6,7)));
    Assert.assertTrue(result.contains(Arrays.asList(4,7)));
    Assert.assertTrue(result.contains(Arrays.asList(6,7,7)));
  }

  @Test
  public void testAllDecreasing() {
    int[] nums = {5, 4, 3, 2, 1};
    LeetCode0491 solution = new LeetCode0491();
    List<List<Integer>> result = solution.findSubsequences(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode0491 solution = new LeetCode0491();
    List<List<Integer>> result = solution.findSubsequences(nums);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode0491 solution = new LeetCode0491();
    List<List<Integer>> result = solution.findSubsequences(nums);
    Assert.assertEquals(0, result.size());
  }
}
