package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode665;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode665 {
  @Test
  public void testToChangeBeg() {
    int[] nums = {4,2,3};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testToChangeMid() {
    int[] nums = {1,3,2};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testToChangeEnd() {
    int[] nums = {1,2,1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testNeedToChangeMoreThanOne() {
    int[] nums = {4,3,2};
    LeetCode665 solution = new LeetCode665();
    Assert.assertFalse(solution.checkPossibility(nums));
  }

  @Test
  public void testAllSame() {
    int[] nums = {1,1,1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testNegAscending() {
    int[] nums = {-3,-2,-1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testNeg() {
    int[] nums = {-3,-5,-1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testNegMoreThanOne() {
    int[] nums = {-3,-5,-6};
    LeetCode665 solution = new LeetCode665();
    Assert.assertFalse(solution.checkPossibility(nums));
  }
  
  @Test
  public void testOne() {
    int[] nums = {1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }
  
  @Test
  public void testEmpty() {
    int[] nums = {};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }
  
  @Test
  public void testNull() {
    int[] nums = null;
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }
}
