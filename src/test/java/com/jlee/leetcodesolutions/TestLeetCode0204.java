package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0204;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0204 {
  @Test
  public void testProblemCase1() {
    LeetCode0204 solution = new LeetCode0204();
    int result = solution.countPrimes(15);
    Assert.assertEquals(6, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0204 solution = new LeetCode0204();
    int result = solution.countPrimes(0);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0204 solution = new LeetCode0204();
    int result = solution.countPrimes(1);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0204 solution = new LeetCode0204();
    int result = solution.countPrimes(2);
    Assert.assertEquals(0, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0204 solution = new LeetCode0204();
    int result = solution.countPrimes(3);
    Assert.assertEquals(1, result);
  }
}
