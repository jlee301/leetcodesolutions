package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode198;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode198 {
  @Test
  public void testProblemCase() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 2, 10, 15, 20};
    int result = solution.rob(nums);
    Assert.assertEquals(35,  result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 10, 2, 15, 20};
    int result = solution.rob(nums);
    Assert.assertEquals(35,  result);
  }
  
  @Test
  public void testOneHouse() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testTwoHouse1() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1,5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testTwoHouse2() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5,1};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testTwoHouse3() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5,5};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }
  
  @Test
  public void testThreeHouse1() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1, 2, 5};
    int result = solution.rob(nums);
    Assert.assertEquals(6,  result);
  }

  @Test
  public void testThreeHouse2() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 2, 1};
    int result = solution.rob(nums);
    Assert.assertEquals(6,  result);
  }
  @Test
  public void testThreeHouse3() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {1, 5, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(5,  result);
  }

  @Test
  public void testThreeHouse4() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 1, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(7,  result);
  }

  @Test
  public void testThreeHouse5() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 5, 2};
    int result = solution.rob(nums);
    Assert.assertEquals(7,  result);
  }

  @Test
  public void testThreeHouse6() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {5, 7, 5};
    int result = solution.rob(nums);
    Assert.assertEquals(10,  result);
  }

  @Test
  public void testBadEconomy() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {0, 0, 0, 0, 0, 0};
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }

  @Test
  public void testEmpty() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = {};
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
  
  @Test
  public void testNull() {
    LeetCode198 solution = new LeetCode198();
    int[] nums = null;
    int result = solution.rob(nums);
    Assert.assertEquals(0,  result);
  }
}
