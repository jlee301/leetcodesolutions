package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode464;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode464 {
  @Test
  public void testProblemCase() {
    int maxChoosableInteger = 10, desiredTotal = 11;
    LeetCode464 solution = new LeetCode464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testMax() {
    int maxChoosableInteger = 20, desiredTotal = 300;
    LeetCode464 solution = new LeetCode464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testSumLowerThanTotal() {
    int maxChoosableInteger = 1, desiredTotal = 10;
    LeetCode464 solution = new LeetCode464();
    Assert.assertFalse(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testCanWin() {
    int maxChoosableInteger = 11, desiredTotal = 10;
    LeetCode464 solution = new LeetCode464();
    Assert.assertTrue(solution.canIWin(maxChoosableInteger, desiredTotal));
  }

  @Test
  public void testDesiredTotal0() {
    int maxChoosableInteger = 11, desiredTotal = 0;
    LeetCode464 solution = new LeetCode464();
    Assert.assertTrue(solution.canIWin(maxChoosableInteger, desiredTotal));
  }
}
