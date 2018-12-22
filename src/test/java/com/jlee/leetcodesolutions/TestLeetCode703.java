package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode703;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode703 {
  @Test
  public void testProblemCase1() {
    int[] nums = {4,5,8,2};
    int k = 3;
    LeetCode703 solution = new LeetCode703(k, nums);
    Assert.assertEquals(4, solution.add(3));
    Assert.assertEquals(5, solution.add(5));
    Assert.assertEquals(5, solution.add(10));
    Assert.assertEquals(8, solution.add(9));
    Assert.assertEquals(8, solution.add(4));
  }
}
