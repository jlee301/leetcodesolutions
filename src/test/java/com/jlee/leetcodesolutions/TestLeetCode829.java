package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode829;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode829 {
  @Test
  public void testProblemCase1() {
    int N = 5;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(2, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 9;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(3, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 15;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(4, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testN1() {
    int N = 1;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(1, solution.consecutiveNumbersSum(N));
  }

  @Test
  public void testN2() {
    int N = 2;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(1, solution.consecutiveNumbersSum(N));
  }
  
  @Test
  public void testTLE() {
    int N = 313653678;
    LeetCode829 solution = new LeetCode829();
    Assert.assertEquals(16, solution.consecutiveNumbersSum(N));
  } 
}
