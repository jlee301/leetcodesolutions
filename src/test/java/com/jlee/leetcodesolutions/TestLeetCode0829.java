package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0829;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0829 {
  @Test
  public void testProblemCase1() {
    int N = 5;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(2, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 9;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(3, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 15;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(4, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testN1() {
    int N = 1;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(1, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testN2() {
    int N = 2;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(1, solution.consecutiveNumbersSum(N));
  }
  
  @Test
  public void testTLE() {
    int N = 313653678;
    LeetCode0829 solution = new LeetCode0829();
    Assert.assertEquals(16, solution.consecutiveNumbersSum(N));
  } 
}
