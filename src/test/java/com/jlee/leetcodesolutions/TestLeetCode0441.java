package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0441;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0441 {
  @Test
  public void testProblemCase1() {
    LeetCode0441 solution = new LeetCode0441();
    Assert.assertEquals(0, solution.arrangeCoins(0));
    Assert.assertEquals(1, solution.arrangeCoins(1));
    Assert.assertEquals(1, solution.arrangeCoins(2));
    Assert.assertEquals(2, solution.arrangeCoins(3));
    Assert.assertEquals(2, solution.arrangeCoins(4));
    Assert.assertEquals(2, solution.arrangeCoins(5));
    Assert.assertEquals(3, solution.arrangeCoins(6));
    Assert.assertEquals(3, solution.arrangeCoins(7));
    Assert.assertEquals(3, solution.arrangeCoins(8));
    Assert.assertEquals(3, solution.arrangeCoins(9));
    Assert.assertEquals(4, solution.arrangeCoins(10));
    Assert.assertEquals(4, solution.arrangeCoins(11));
    Assert.assertEquals(4, solution.arrangeCoins(12));
    Assert.assertEquals(4, solution.arrangeCoins(13));
    Assert.assertEquals(4, solution.arrangeCoins(14));
    Assert.assertEquals(5, solution.arrangeCoins(15));
    Assert.assertEquals(5, solution.arrangeCoins(16));
    Assert.assertEquals(5, solution.arrangeCoins(17));
    Assert.assertEquals(5, solution.arrangeCoins(18));
    Assert.assertEquals(5, solution.arrangeCoins(19));
    Assert.assertEquals(5, solution.arrangeCoins(20));
    Assert.assertEquals(6, solution.arrangeCoins(21));
  }
}
