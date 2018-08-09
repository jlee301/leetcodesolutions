package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode517;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode517 {
  @Test
  public void testProblemCase1() {
    int[] machines = {1,0,5};
    LeetCode517 solution = new LeetCode517();
    Assert.assertEquals(3, solution.findMinMoves(machines));
  }

  @Test
  public void testProblemCase2() {
    int[] machines = {0,3,0};
    LeetCode517 solution = new LeetCode517();
    Assert.assertEquals(2, solution.findMinMoves(machines));
  }

  @Test
  public void testProblemCase3() {
    int[] machines = {0,2,0};
    LeetCode517 solution = new LeetCode517();
    Assert.assertEquals(-1, solution.findMinMoves(machines));
  }
}
