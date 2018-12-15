package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode507;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode507 {
  @Test
  public void testProblemCase1() {
    LeetCode507 solution = new LeetCode507();
    Assert.assertTrue(solution.checkPerfectNumber(6));
    Assert.assertTrue(solution.checkPerfectNumber(28));
    Assert.assertTrue(solution.checkPerfectNumber(496));
    Assert.assertTrue(solution.checkPerfectNumber(8128));
    Assert.assertTrue(solution.checkPerfectNumber(33550336));
  }
  
  @Test
  public void testProblemCase2() {
    LeetCode507 solution = new LeetCode507();
    Assert.assertFalse(solution.checkPerfectNumber(1));
    Assert.assertFalse(solution.checkPerfectNumber(2));
    Assert.assertFalse(solution.checkPerfectNumber(3));
    Assert.assertFalse(solution.checkPerfectNumber(4));
    Assert.assertFalse(solution.checkPerfectNumber(5));
    Assert.assertFalse(solution.checkPerfectNumber(7));
    Assert.assertFalse(solution.checkPerfectNumber(8));
    Assert.assertFalse(solution.checkPerfectNumber(9));
    Assert.assertFalse(solution.checkPerfectNumber(10));
    Assert.assertFalse(solution.checkPerfectNumber(100000000));
  }
  
  @Test
  public void testProblemCase3() {
    LeetCode507 solution = new LeetCode507();
    Assert.assertFalse(solution.checkPerfectNumber(0));
    Assert.assertFalse(solution.checkPerfectNumber(-1));
    Assert.assertFalse(solution.checkPerfectNumber(-2));
    Assert.assertFalse(solution.checkPerfectNumber(-3));
    Assert.assertFalse(solution.checkPerfectNumber(-4));
    Assert.assertFalse(solution.checkPerfectNumber(-5));
  }
}
