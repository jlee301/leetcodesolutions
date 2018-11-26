package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode947;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode947 {
  @Test
  public void testProblemCase1() {
    int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
    LeetCode947 solution = new LeetCode947();
    Assert.assertEquals(5, solution.removeStones(stones));
  }

  @Test
  public void testProblemCase2() {
    int[][] stones = {{0,0},{0,2},{1,1},{2,0},{2,2}};
    LeetCode947 solution = new LeetCode947();
    Assert.assertEquals(3, solution.removeStones(stones));
  }

  @Test
  public void testProblemCase3() {
    int[][] stones = {{0,0}};
    LeetCode947 solution = new LeetCode947();
    Assert.assertEquals(0, solution.removeStones(stones));
  }
}
