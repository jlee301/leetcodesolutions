package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode018;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode018 {
  @Test
  public void testProblemCase() {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    //[[-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2]]
    Assert.assertEquals(3, result.size());
    Assert.assertEquals(-2, (int) result.get(0).get(0));
    Assert.assertEquals(-1, (int) result.get(0).get(1));
    Assert.assertEquals(1, (int) result.get(0).get(2));
    Assert.assertEquals(2, (int) result.get(0).get(3));
    Assert.assertEquals(-2, (int) result.get(1).get(0));
    Assert.assertEquals(0, (int) result.get(1).get(1));
    Assert.assertEquals(0, (int) result.get(1).get(2));
    Assert.assertEquals(2, (int) result.get(1).get(3));
    Assert.assertEquals(-1, (int) result.get(2).get(0));
    Assert.assertEquals(0, (int) result.get(2).get(1));
    Assert.assertEquals(0, (int) result.get(2).get(2));
    Assert.assertEquals(1, (int) result.get(2).get(3));
  }

  @Test
  public void testNumsGreaterThanTarget() {
    int[] nums = {1,2,3,4};
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testAllZeroesTargetZero() {
    int[] nums = {0,0,0,0};
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0).get(0));
    Assert.assertEquals(0, (int) result.get(0).get(1));
    Assert.assertEquals(0, (int) result.get(0).get(2));
    Assert.assertEquals(0, (int) result.get(0).get(3));
  }

  @Test
  public void testPrimaryBypass() {
    int[] nums = {0,0,0,0};
    int target = 1;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testAllZeroesOnesTargetZero() {
    int[] nums = {0,0,0,0,0,0,0,0};
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0).get(0));
    Assert.assertEquals(0, (int) result.get(0).get(1));
    Assert.assertEquals(0, (int) result.get(0).get(2));
    Assert.assertEquals(0, (int) result.get(0).get(3));
  }

  @Test
  public void testAllZeroesOnesTargetOne() {
    int[] nums = {0,0,0,0,1,1,1,1};
    int target = 1;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0).get(0));
    Assert.assertEquals(0, (int) result.get(0).get(1));
    Assert.assertEquals(0, (int) result.get(0).get(2));
    Assert.assertEquals(1, (int) result.get(0).get(3));
  }

  @Test
  public void testSecondaryBypass() {
    int[] nums = {1,1,1,2,3,4};
    int target = 10;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0).get(0));
    Assert.assertEquals(2, (int) result.get(0).get(1));
    Assert.assertEquals(3, (int) result.get(0).get(2));
    Assert.assertEquals(4, (int) result.get(0).get(3));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 0;
    LeetCode018 solution = new LeetCode018();
    List<List<Integer>> result = solution.fourSum(nums, target);
    Assert.assertEquals(0, result.size());
  }
}
