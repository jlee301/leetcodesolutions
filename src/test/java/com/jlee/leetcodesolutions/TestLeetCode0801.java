package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0801;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0801 {
  @Test
  public void testProblemCase() {
    int[] A = {1,3,5,4}, B = {1,2,3,7};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(1, solution.minSwap(A, B));
  }

  @Test
  public void testSwapLead() {
    int[] A = {4,2}, B = {1,5};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(1, solution.minSwap(A, B));
  }

  @Test
  public void testSwapLead2() {
    int[] A = {1,5}, B = {4,2};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(1, solution.minSwap(A, B));
  }

  @Test
  public void testLeftAlone() {
    int[] A = {1,2}, B = {1,3};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(0, solution.minSwap(A, B));
  }
  
  @Test
  public void testLeftAlone2() {
    int[] A = {2,4}, B = {3,5};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(0, solution.minSwap(A, B));
  }

  @Test
  public void testLeftAlone3() {
    int[] A = {2,3}, B = {5,6};
    LeetCode0801 solution = new LeetCode0801();
    Assert.assertEquals(0, solution.minSwap(A, B));
  }
}
