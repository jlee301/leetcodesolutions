package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode547;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode547 {
  @Test
  public void testProblemCase1() {
    int[][] M = { {1,1,0},
                  {1,1,0},
                  {0,0,1} };
    LeetCode547 solution = new LeetCode547();
    Assert.assertEquals(2, solution.findCircleNum(M));
  }

  @Test
  public void testProblemCase2() {
    int[][] M = { {1,1,0},
                  {1,1,1},
                  {0,1,1} };
    LeetCode547 solution = new LeetCode547();
    Assert.assertEquals(1, solution.findCircleNum(M));
  }

  @Test
  public void testEmptyRow() {
    int[][] M = {};
    LeetCode547 solution = new LeetCode547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }

  @Test
  public void testEmptyCol() {
    int[][] M = {{}};
    LeetCode547 solution = new LeetCode547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }

  @Test
  public void testNull() {
    int[][] M = null;
    LeetCode547 solution = new LeetCode547();
    Assert.assertEquals(0, solution.findCircleNum(M));
  }
}
