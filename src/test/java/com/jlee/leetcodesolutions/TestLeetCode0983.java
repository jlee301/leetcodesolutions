package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0983;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0983 {
  @Test
  public void testProblemCase1() {
    int[] days = {1,4,6,7,8,20}, costs = {2,7,15};
    LeetCode0983 solution = new LeetCode0983();
    Assert.assertEquals(11, solution.mincostTickets(days, costs));
  }

  @Test
  public void testProblemCase2() {
    int[] days = {1,2,3,4,5,6,7,8,9,10,30,31}, costs = {2,7,15};
    LeetCode0983 solution = new LeetCode0983();
    Assert.assertEquals(17, solution.mincostTickets(days, costs));
  }

  @Test
  public void testProblemCase3() {
    int[] days = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 24, 25, 27, 28, 29, 30, 31, 34,
        37, 38, 39, 41, 43, 44, 45, 47, 48, 49, 54, 57, 60, 62, 63, 66, 69, 70, 72, 74, 76, 78, 80, 81, 82, 83, 84, 85,
        88, 89, 91, 93, 94, 97, 99 };
    int[] costs = {9,38,134};
    LeetCode0983 solution = new LeetCode0983();
    Assert.assertEquals(423, solution.mincostTickets(days, costs));
  }

  @Test
  public void testProblemCase4() {
    int[] days = {1,4,6,9,10,11,12,13,14,15,16,17,18,20,21,22,23,27,28}, costs = {3,13,45};
    LeetCode0983 solution = new LeetCode0983();
    Assert.assertEquals(44, solution.mincostTickets(days, costs));
  }
}
