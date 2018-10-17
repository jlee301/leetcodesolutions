package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode188;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode188 {
  @Test
  public void testProblemCase1() {
    int[] prices = {2,4,1};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(2, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase2() {
    int[] prices = {3,2,6,5,0,3};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(7, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase3() {
    int[] prices = {5,5,5,5,5,5};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(0, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase4() {
    int[] prices = {6,5,4,3,2,1};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(0, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase5() {
    int[] prices = {1,2,3,4,5,6};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(5, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase6() {
    int[] prices = {2,1,2,0,1};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(2, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase7() {
    int[] prices = {1,2,4,2,5,7,2,4,9,0};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(13, solution.maxProfit(k, prices));
  }

  @Test
  public void testProblemCase8() {
    int[] prices = {1,2,20,17,18,19};
    int k = 2;
    LeetCode188 solution = new LeetCode188();
    Assert.assertEquals(21, solution.maxProfit(k, prices));
  }
}
