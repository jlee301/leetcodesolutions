package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode209;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode209 {
  @Test
  public void testProblemCase() {
    int[] nums = {2,3,1,2,4,3};
    int s = 7;
    LeetCode209 solution = new LeetCode209();
    Assert.assertEquals(2, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testOneEntryBiggerThanS() {
    int[] nums = {2,3,1,2,4,3,8};
    int s = 7;
    LeetCode209 solution = new LeetCode209();
    Assert.assertEquals(1, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testNoAnswer() {
    int[] nums = {1};
    int s = 7;
    LeetCode209 solution = new LeetCode209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testEmpty() {
    int[] nums = {};
    int s = 7;
    LeetCode209 solution = new LeetCode209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }

  @Test
  public void testNull() {
    int[] nums = null;
    int s = 7;
    LeetCode209 solution = new LeetCode209();
    Assert.assertEquals(0, solution.minSubArrayLen(s, nums));
  }
}
