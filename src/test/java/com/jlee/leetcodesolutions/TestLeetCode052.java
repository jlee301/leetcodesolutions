package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode052;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode052 {
  @Test
  public void testProblemCase1() {
    int n = 4;
    LeetCode052 solution = new LeetCode052();
    Assert.assertEquals(2, solution.totalNQueens(n));
  }

  @Test
  public void testProblemCase2() {
    int n = 2;
    LeetCode052 solution = new LeetCode052();
    Assert.assertEquals(0, solution.totalNQueens(n));
  }

  @Test
  public void testProblemCase3() {
    int n = 1;
    LeetCode052 solution = new LeetCode052();
    Assert.assertEquals(1, solution.totalNQueens(n));
  }

  @Test
  public void testProblemCase4() {
    int n = 5;
    LeetCode052 solution = new LeetCode052();
    Assert.assertEquals(10, solution.totalNQueens(n));
  }

  @Test
  public void testProblemCase5() {
    int n = 6;
    LeetCode052 solution = new LeetCode052();
    Assert.assertEquals(4, solution.totalNQueens(n));
  }
}
