package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode453;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode453 {
  @Test
  public void testProblemCase1() {
    int[] nums = {1,2,3};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(3, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,7,10};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(15, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {10,7,1};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(15, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {-3,-5,-6};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(4, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,5};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(4, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {1};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(0, solution.minMoves(nums));
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {};
    LeetCode453 solution = new LeetCode453();
    Assert.assertEquals(0, solution.minMoves(nums));
  }
}
