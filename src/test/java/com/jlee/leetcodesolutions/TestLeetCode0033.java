package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0033;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0033 {
  @Test
  public void testProblemCaseTarget4() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 4;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(0, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget5() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 5;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(1, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget6() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 6;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(2, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget7() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 7;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(3, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget0() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(4, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget1() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 1;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(5, solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget2() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 2;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(6, solution.search(nums, target));
  }

  @Test
  public void testFullScanWithPivot() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 10;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testFullBackwardScanWithPivot() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = -1;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testFullScanNoPivot() {
    int[] nums = {0,1,2,4,5,6,7};
    int target = 10;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testFullBackwardScanNoPivot() {
    int[] nums = {0,1,2,4,5,6,7};
    int target = -1;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testOneValueOnTarget() {
    int[] nums = {1};
    int target = 1;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(0, solution.search(nums, target));
  }

  @Test
  public void testOneValueGreater() {
    int[] nums = {1};
    int target = 2;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testOneValueLesser() {
    int[] nums = {1};
    int target = 0;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 2;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 2;
    LeetCode0033 solution = new LeetCode0033();
    Assert.assertEquals(-1, solution.search(nums, target));
  }
}
