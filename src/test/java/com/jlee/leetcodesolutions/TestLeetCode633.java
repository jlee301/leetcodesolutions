package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode633;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode633 {
  @Test
  public void testSquareSums() {
    LeetCode633 solution = new LeetCode633();
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
  public void testNotSquareSums() {
    LeetCode633 solution = new LeetCode633();
    Assert.assertFalse(solution.judgeSquareSum(3));
    Assert.assertFalse(solution.judgeSquareSum(6));
    Assert.assertFalse(solution.judgeSquareSum(7));
    Assert.assertFalse(solution.judgeSquareSum(11));
    Assert.assertFalse(solution.judgeSquareSum(12));
    Assert.assertFalse(solution.judgeSquareSum(14));
    Assert.assertFalse(solution.judgeSquareSum(15));
    Assert.assertFalse(solution.judgeSquareSum(19));
  }

  @Test
  public void testLessThanZero() {
    LeetCode633 solution = new LeetCode633();
    Assert.assertFalse(solution.judgeSquareSum(-1));
    Assert.assertFalse(solution.judgeSquareSum(-2));
    Assert.assertFalse(solution.judgeSquareSum(-3));
    Assert.assertFalse(solution.judgeSquareSum(-4));
    Assert.assertFalse(solution.judgeSquareSum(-5));
    Assert.assertFalse(solution.judgeSquareSum(-6));
    Assert.assertFalse(solution.judgeSquareSum(-7));
    Assert.assertFalse(solution.judgeSquareSum(-8));
    Assert.assertFalse(solution.judgeSquareSum(-9));
    Assert.assertFalse(solution.judgeSquareSum(-10));
  }
}
