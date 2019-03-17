package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0128;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0128 {
  @Test
  public void testProblemCase1() {
    int[] nums = {100, 4, 200, 1, 3, 2};
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(4, solution.longestConsecutive(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {100, 4, 200, 1, 3, 2, 3};
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(4, solution.longestConsecutive(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {};
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(0, solution.longestConsecutive(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = null;
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(0, solution.longestConsecutive(nums));
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {0};
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(1, solution.longestConsecutive(nums));
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {0,0};
    LeetCode0128 solution = new LeetCode0128();
    Assert.assertEquals(1, solution.longestConsecutive(nums));
  }
}
