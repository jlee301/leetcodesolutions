package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0400;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0400 {
  @Test
  public void testProblemCase1() {
    LeetCode0400 solution = new LeetCode0400();
    Assert.assertEquals(1, solution.findNthDigit(1));
    Assert.assertEquals(2, solution.findNthDigit(2));
    Assert.assertEquals(3, solution.findNthDigit(3));
    Assert.assertEquals(4, solution.findNthDigit(4));
    Assert.assertEquals(5, solution.findNthDigit(5));
    Assert.assertEquals(6, solution.findNthDigit(6));
    Assert.assertEquals(7, solution.findNthDigit(7));
    Assert.assertEquals(8, solution.findNthDigit(8));
    Assert.assertEquals(9, solution.findNthDigit(9));
    Assert.assertEquals(1, solution.findNthDigit(10));
    Assert.assertEquals(0, solution.findNthDigit(11));
    Assert.assertEquals(1, solution.findNthDigit(12));
    Assert.assertEquals(1, solution.findNthDigit(13));
    Assert.assertEquals(1, solution.findNthDigit(14));
    Assert.assertEquals(2, solution.findNthDigit(15));
    Assert.assertEquals(1, solution.findNthDigit(16));
    Assert.assertEquals(3, solution.findNthDigit(17));
    Assert.assertEquals(1, solution.findNthDigit(18));
    Assert.assertEquals(4, solution.findNthDigit(19));
    Assert.assertEquals(1, solution.findNthDigit(20));
    Assert.assertEquals(4, solution.findNthDigit(1234));
    Assert.assertEquals(2, solution.findNthDigit(Integer.MAX_VALUE-1));
  }
}
