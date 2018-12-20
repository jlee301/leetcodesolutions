package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode645;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode645 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,2,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,1,3,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,4,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(4, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {4,2,2,1};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,1};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(2, result[1]);
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1,2,2,3,4};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(5, result[1]);
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {1,2,2,3,5};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(2, result[0]);
    Assert.assertEquals(4, result[1]);
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {3,2,3,4,6,5};
    LeetCode645 solution = new LeetCode645();
    int[] result = solution.findErrorNums(nums);
    Assert.assertEquals(3, result[0]);
    Assert.assertEquals(1, result[1]);
  }
}
