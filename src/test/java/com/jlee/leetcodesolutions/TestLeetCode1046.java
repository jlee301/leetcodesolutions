package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1046;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1046 {
  @Test
  public void testProblemCase1() {
    int[] stones = {2,7,4,1,8,1};
    LeetCode1046 solution = new LeetCode1046();
    Assert.assertEquals(1, solution.lastStoneWeight(stones));
  }

  @Test
  public void testProblemCase2() {
    int[] stones = {10};
    LeetCode1046 solution = new LeetCode1046();
    Assert.assertEquals(10, solution.lastStoneWeight(stones));
  }

  @Test
  public void testProblemCase3() {
    int[] stones = {10,10};
    LeetCode1046 solution = new LeetCode1046();
    Assert.assertEquals(0, solution.lastStoneWeight(stones));
  }
}
