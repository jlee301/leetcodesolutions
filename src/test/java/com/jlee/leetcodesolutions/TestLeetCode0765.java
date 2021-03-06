package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0765;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0765 {
  @Test
  public void testProblemCase1() {
    // Input: row = [0, 2, 1, 3]
    // Output: 1
    int[] row = {0,2,1,3};
    LeetCode0765 solution = new LeetCode0765();
    Assert.assertEquals(1, solution.minSwapsCouples(row));
  }

  @Test
  public void testProblemCase2() {
    // Input: row = [3, 2, 0, 1]
    // Output: 0
    int[] row = {3,2,0,1};
    LeetCode0765 solution = new LeetCode0765();
    Assert.assertEquals(0, solution.minSwapsCouples(row));
  }
}
