package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode016;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode016 {
  @Test
  public void testProblemCase() {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(2, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testExactMatchToTarget() {
    int[] nums = {-1, 2, 1, -4};
    int target = 2;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(2, solution.threeSumClosest(nums, target));
  }
  
  @Test
  public void testExactMatchAgain() {
    int[] nums = {0, -1, 1, 1};
    int target = 1;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(1, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testNeg() {
    int[] nums = {0, 0, 0, -4};
    int target = -3;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(-4, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testZeroes() {
    int[] nums = {0, 0, 0, 0, 0, 0, 0, 0};
    int target = 1;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(0, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testWrongAnswer() {
    int[] nums = {0, 1, 2};
    int target = 0;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(3, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int target = 1;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(Integer.MAX_VALUE, solution.threeSumClosest(nums, target));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int target = 1;
    LeetCode016 solution = new LeetCode016();
    Assert.assertEquals(Integer.MAX_VALUE, solution.threeSumClosest(nums, target));
  }
}
