package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0034;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0034 {
  @Test
  public void testProblemCaseTarget8() {
    int[] nums = {5,7,7,8,8,10};
    int target = 8;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(4, result[1]);
  }

  @Test
  public void testProblemCaseTarget7() {
    int[] nums = {5,7,7,8,8,10};
    int target = 7;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCaseTarget5() {
    int[] nums = {5,7,7,8,8,10};
    int target = 5;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(0, result[1]);
  }

  @Test
  public void testProblemCaseTarget10() {
    int[] nums = {5,7,7,8,8,10};
    int target = 10;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(5, result[0]);
    Assert.assertEquals(5, result[1]);
  }

  @Test
  public void testTargetLessThanFirstElement() {
    int[] nums = {1,2,3,4};
    int target = 0;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testTargetGreaterThanLastElement() {
    int[] nums = {1,2,3,4};
    int target = 10;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testLeftSideWhenElementIsLargerThanTarget() {
    int[] nums = {1,3,4};
    int target = 2;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testRightSideWhenElementIsLessThanTarget() {
    int[] nums = {1,2,4};
    int target = 3;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testLeftSideTargetSameTillEnd() {
    int[] nums = {2,2,2,2};
    int target = 2;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(0, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 10;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 10;
    LeetCode0034 solution = new LeetCode0034();
    int[] result = solution.searchRange(nums, target);
    Assert.assertEquals(-1, result[0]);
    Assert.assertEquals(-1, result[1]);
  }
}
