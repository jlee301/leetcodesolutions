package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1049;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1049 {
  @Test
  public void testProblemCase1() {
    int[] stones = {2,7,4,1,8,1};
    LeetCode1049 solution = new LeetCode1049();
    Assert.assertEquals(1, solution.lastStoneWeightII(stones));
  }

  @Test
  public void testProblemCase2() {
    int[] stones = {10};
    LeetCode1049 solution = new LeetCode1049();
    Assert.assertEquals(10, solution.lastStoneWeightII(stones));
  }
}
