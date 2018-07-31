package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode879;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode879 {
  @Test
  public void testProblemCase1() {
    // Input: G = 5, P = 3, group = [2,2], profit = [2,3]
    // Output: 2
    int G = 5, P = 3;
    int[] group = {2,2}, profit = {2,3};
    LeetCode879 solution = new LeetCode879();
    Assert.assertEquals(2, solution.profitableSchemes(G, P, group, profit));
  }

  @Test
  public void testProblemCase2() {
    // Input: G = 10, P = 5, group = [2,3,5], profit = [6,7,8]
    // Output: 7
    int G = 10, P = 5;
    int[] group = {2,3,5}, profit = {6,7,8};
    LeetCode879 solution = new LeetCode879();
    Assert.assertEquals(7, solution.profitableSchemes(G, P, group, profit));
  }

  @Test
  public void testProblemCase3() {
    int G = 100, P = 1;
    int[] group = { 60, 36, 37, 80, 66, 96, 61, 14, 43, 18, 35, 98, 38, 49, 66, 83, 90, 60, 80, 88, 14, 44, 65, 78, 31,
        55, 79, 46, 1, 90, 74, 53, 62, 68, 24, 37, 73, 56, 37, 48, 86, 51, 56, 66, 51, 72, 29, 34, 96, 57, 84, 13, 99,
        69, 47, 45, 55, 58, 31, 60, 94, 9, 60, 72, 27, 59, 95, 100, 40, 98, 77, 10, 62, 78, 32, 100, 51, 96, 52, 85, 40,
        61, 31, 8, 20, 75, 32, 78, 53, 67, 22, 2, 40, 29, 74, 68, 2, 46, 3, 93 };
    int[] profit = { 2, 2, 0, 0, 2, 2, 0, 1, 2, 2, 2, 2, 2, 1, 0, 0, 2, 1, 2, 0, 1, 1, 2, 2, 0, 0, 2, 0, 2, 0, 1, 1, 0,
        0, 0, 1, 2, 2, 0, 2, 2, 1, 0, 1, 2, 0, 1, 0, 2, 1, 2, 2, 2, 0, 1, 1, 0, 0, 0, 2, 1, 2, 1, 0, 2, 1, 1, 1, 0, 1,
        1, 2, 2, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 2, 0, 0, 1, 2, 1, 1, 0, 1, 2, 2, 1, 1, 0, 0, 0, 1 };
    LeetCode879 solution = new LeetCode879();
    Assert.assertEquals(277517, solution.profitableSchemes(G, P, group, profit));
  }
}
