package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0209;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0209 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,3,1,2,4,3};
    int s = 7;
    LeetCode0209 solution = new LeetCode0209();
    Assert.assertEquals(2, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testOneEntryBiggerThanS() {
    int[] nums = {2,3,1,2,4,3,8};
    int s = 7;
    LeetCode0209 solution = new LeetCode0209();
    Assert.assertEquals(1, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testNoAnswer() {
    int[] nums = {1};
    int s = 7;
    LeetCode0209 solution = new LeetCode0209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int s = 7;
    LeetCode0209 solution = new LeetCode0209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int s = 7;
    LeetCode0209 solution = new LeetCode0209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }
}
