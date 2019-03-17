package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0464;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0464 {
  @Test
  public void testProblemCase() {
    int maxChoosableInteger = 10, desiredTotal = 11;
    LeetCode0464 solution = new LeetCode0464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testMax() {
    int maxChoosableInteger = 20, desiredTotal = 300;
    LeetCode0464 solution = new LeetCode0464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testSumLowerThanTotal() {
    int maxChoosableInteger = 1, desiredTotal = 10;
    LeetCode0464 solution = new LeetCode0464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testCanWin() {
    int maxChoosableInteger = 11, desiredTotal = 10;
    LeetCode0464 solution = new LeetCode0464();
    Assert.assertTrue(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testDesiredTotal0() {
    int maxChoosableInteger = 11, desiredTotal = 0;
    LeetCode0464 solution = new LeetCode0464();
    Assert.assertTrue(solution.canIWin(maxChoosableInteger, desiredTotal));
  }
}
