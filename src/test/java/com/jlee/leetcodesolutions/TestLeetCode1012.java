package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1012;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1012 {
  @Test
  public void testProblemCase1() {
    int N = 20;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(1, solution.numDupDigitsAtMostN(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 100;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(10, solution.numDupDigitsAtMostN(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 1000;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(262, solution.numDupDigitsAtMostN(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 350;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(83, solution.numDupDigitsAtMostN(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 110;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(12, solution.numDupDigitsAtMostN(N));
  }
}
