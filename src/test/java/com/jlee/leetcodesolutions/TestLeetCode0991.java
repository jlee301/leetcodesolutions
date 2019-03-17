package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0991;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0991 {
  @Test
  public void testProblemCase1() {
    int X = 2, Y = 3;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(2, solution.brokenCalc(X, Y));
  }

  @Test
  public void testProblemCase2() {
    int X = 5, Y = 8;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(2, solution.brokenCalc(X, Y));
  }

  @Test
  public void testProblemCase3() {
    int X = 3, Y = 10;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(3, solution.brokenCalc(X, Y));
  }

  @Test
  public void testProblemCase4() {
    int X = 1024, Y = 1;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(1023, solution.brokenCalc(X, Y));
  }

  @Test
  public void testProblemCase5() {
    int X = 1, Y = 1000000000;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(39, solution.brokenCalc(X, Y));
  }

  @Test
  public void testProblemCase6() {
    int X = 10, Y = 10;
    LeetCode0991 solution = new LeetCode0991();
    Assert.assertEquals(0, solution.brokenCalc(X, Y));
  }
}
