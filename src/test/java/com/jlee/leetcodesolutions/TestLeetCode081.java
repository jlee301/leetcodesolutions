package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode081;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode081 {
  @Test
  public void testProblemCaseTarget4() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 4;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget5() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 5;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget6() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 6;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget7() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 7;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget0() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget1() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 1;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testProblemCaseTarget2() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 2;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testFullScanWithPivot() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = 10;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testFullBackwardScanWithPivot() {
    int[] nums = {4,5,6,7,0,1,2};
    int target = -1;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testFullScanNoPivot() {
    int[] nums = {0,1,2,4,5,6,7};
    int target = 10;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testFullBackwardScanNoPivot() {
    int[] nums = {0,1,2,4,5,6,7};
    int target = -1;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testOneValueOnTarget() {
    int[] nums = {1};
    int target = 1;
    LeetCode081 solution = new LeetCode081();
    Assert.assertTrue(solution.search(nums, target));
  }

  @Test
  public void testOneValueGreater() {
    int[] nums = {1};
    int target = 2;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testOneValueLesser() {
    int[] nums = {1};
    int target = 0;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 2;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 2;
    LeetCode081 solution = new LeetCode081();
    Assert.assertFalse(solution.search(nums, target));
  }
}
