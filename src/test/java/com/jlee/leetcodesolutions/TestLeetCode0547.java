package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0547;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0547 {
  @Test
  public void testProblemCase1() {
    int[][] M = { {1,1,0},
                  {1,1,0},
                  {0,0,1} };
    LeetCode0547 solution = new LeetCode0547();
    Assert.assertEquals(2, solution.findCircleNum(M));
  }

  @Test
  public void testProblemCase2() {
    int[][] M = { {1,1,0},
                  {1,1,1},
                  {0,1,1} };
    LeetCode0547 solution = new LeetCode0547();
    Assert.assertEquals(1, solution.findCircleNum(M));
  }

  @Test
  public void testEmptyRow() {
    int[][] M = {};
    LeetCode0547 solution = new LeetCode0547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }

  @Test
  public void testEmptyCol() {
    int[][] M = {{}};
    LeetCode0547 solution = new LeetCode0547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }

  @Test
  public void testNull() {
    int[][] M = null;
    LeetCode0547 solution = new LeetCode0547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }
}
