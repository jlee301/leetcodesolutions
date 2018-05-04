package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode740;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode740 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3, 4, 2};
    LeetCode740 solution = new LeetCode740();
    Assert.assertEquals(6, solution.deleteAndEarn(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {2, 2, 3, 3, 3, 4};
    LeetCode740 solution = new LeetCode740();
    Assert.assertEquals(9, solution.deleteAndEarn(nums));
  }

  @Test
  public void testTLE() {
    int[] nums = {8,3,4,7,6,6,9,2,5,8,2,4,9,5,9,1,5,7,1,4};
    LeetCode740 solution = new LeetCode740();
    Assert.assertEquals(61, solution.deleteAndEarn(nums));
  }
}
