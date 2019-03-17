package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0764;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0764 {
  @Test
  public void testProblemCase1() {
    int N = 5;
    int[][] mines = { {4,2} };
    LeetCode0764 solution = new LeetCode0764();
    Assert.assertEquals(2, solution.orderOfLargestPlusSign(N, mines));
  }

  @Test
  public void testProblemCase2() {
    int N = 2;
    int[][] mines = {};
    LeetCode0764 solution = new LeetCode0764();
    Assert.assertEquals(1, solution.orderOfLargestPlusSign(N, mines));
  }

  @Test
  public void testProblemCase3() {
    int N = 1;
    int[][] mines = { {0,0} };
    LeetCode0764 solution = new LeetCode0764();
    Assert.assertEquals(0, solution.orderOfLargestPlusSign(N, mines));
  }
}
