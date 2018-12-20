package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode665;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode665 {
  @Test
  public void testProblemCase1() {
    int[] nums = {4,2,3};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,3,2};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {4,3,2};
    LeetCode665 solution = new LeetCode665();
    Assert.assertFalse(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,1,1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {-3,-2,-1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {-3,-5,-1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }

  @Test
  public void testProblemCase8() {
    int[] nums = {-3,-5,-6};
    LeetCode665 solution = new LeetCode665();
    Assert.assertFalse(solution.checkPossibility(nums));
  }
  
  @Test
  public void testProblemCase9() {
    int[] nums = {1};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }
  
  @Test
  public void testProblemCase10() {
    int[] nums = {};
    LeetCode665 solution = new LeetCode665();
    Assert.assertTrue(solution.checkPossibility(nums));
  }
}
