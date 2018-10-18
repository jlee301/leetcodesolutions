package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode164;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode164 {
  @Test
  public void testProblemCase1() {
    int[] nums = {3,6,9,1};
    LeetCode164 solution = new LeetCode164();
    Assert.assertEquals(3, solution.maximumGap(nums));
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {10};
    LeetCode164 solution = new LeetCode164();
    Assert.assertEquals(0, solution.maximumGap(nums));
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {};
    LeetCode164 solution = new LeetCode164();
    Assert.assertEquals(0, solution.maximumGap(nums));
  }

  @Test
  public void testProblemCase4() {
    int[] nums = null;
    LeetCode164 solution = new LeetCode164();
    Assert.assertEquals(0, solution.maximumGap(nums));
  }
}
