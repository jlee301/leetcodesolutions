package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0213;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0213 {
  @Test
  public void testProblemCase() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {5, 1, 2, 10, 15, 20};
    int result = solution.rob(nums);
    Assert.assertEquals(31,  result);
  }

  @Test
  public void testOneHouse() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testTwoHouse1() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {1,5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testTwoHouse2() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {5,1};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testThreeHouse1() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {1, 2, 5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testThreeHouse2() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {5, 2, 1};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }
  @Test
  public void testThreeHouse3() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {1, 5, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testThreeHouse4() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {5, 1, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }
  
  @Test
  public void testEmpty() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = {};
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
  
  @Test
  public void testNull() {
    LeetCode0213 solution = new LeetCode0213();
    int[] nums = null;
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
}
