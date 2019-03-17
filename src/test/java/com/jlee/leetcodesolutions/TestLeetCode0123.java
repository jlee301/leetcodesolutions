package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0123;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0123 {
  @Test
  public void testProblemCase1() {
    int[] prices = {3,3,5,0,0,3,1,4};
    LeetCode0123 solution = new LeetCode0123();
    Assert.assertEquals(6, solution.maxProfit(prices));
  }

  @Test
  public void testProblemCase2() {
    int[] prices = {1,2,3,4,5};
    LeetCode0123 solution = new LeetCode0123();
    Assert.assertEquals(4, solution.maxProfit(prices));
  }

  @Test
  public void testProblemCase3() {
    int[] prices = {7,6,4,3,1};
    LeetCode0123 solution = new LeetCode0123();
    Assert.assertEquals(0, solution.maxProfit(prices));
  }
  
  @Test
  public void testProblemCase9() {
    int[] prices = {1,5,2,4};
    LeetCode0123 solution = new LeetCode0123();
    Assert.assertEquals(6, solution.maxProfit(prices));    
  }
}
