package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0633;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0633 {
  @Test
  public void testProblemCase1() {
    LeetCode0633 solution = new LeetCode0633();
    Assert.assertTrue(solution.judgeSquareSum(0));
    Assert.assertTrue(solution.judgeSquareSum(1));
    Assert.assertTrue(solution.judgeSquareSum(2));
    Assert.assertTrue(solution.judgeSquareSum(4));
    Assert.assertTrue(solution.judgeSquareSum(5));
    Assert.assertTrue(solution.judgeSquareSum(8));
    Assert.assertTrue(solution.judgeSquareSum(9));
    Assert.assertTrue(solution.judgeSquareSum(10));
    Assert.assertTrue(solution.judgeSquareSum(13));
    Assert.assertTrue(solution.judgeSquareSum(16));
    Assert.assertTrue(solution.judgeSquareSum(17));
    Assert.assertTrue(solution.judgeSquareSum(18));
    Assert.assertTrue(solution.judgeSquareSum(20));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode0633 solution = new LeetCode0633();
    Assert.assertFalse(solution.judgeSquareSum(3));
    Assert.assertFalse(solution.judgeSquareSum(6));
    Assert.assertFalse(solution.judgeSquareSum(7));
    Assert.assertFalse(solution.judgeSquareSum(11));
    Assert.assertFalse(solution.judgeSquareSum(12));
    Assert.assertFalse(solution.judgeSquareSum(14));
    Assert.assertFalse(solution.judgeSquareSum(15));
    Assert.assertFalse(solution.judgeSquareSum(19));
  }
}
