package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0934;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0934 {
  @Test
  public void testProblemCase1() {
    int[][] A = {{0,1},{1,0}};
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(1, solution.shortestBridge(A));
  }

  @Test
  public void testProblemCase2() {
    int[][] A = {{0,1,0},{0,0,0},{0,0,1}};
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(2, solution.shortestBridge(A));
  }

  @Test
  public void testProblemCase3() {
    int[][] A = {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(1, solution.shortestBridge(A));
  }

  @Test
  public void testProblemCase4() {
    int[][] A = { {0,0,0,0,0,0},
                  {0,1,0,0,0,0},
                  {1,1,0,0,0,0},
                  {1,1,0,0,0,0},
                  {0,0,0,0,0,0},
                  {0,0,1,1,0,0} };
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(2, solution.shortestBridge(A));
  }

  @Test
  public void testProblemCase5() {
    int[][] A = {{0,0,0},{0,0,0},{0,0,0}};
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(Integer.MAX_VALUE, solution.shortestBridge(A));
  }

  @Test
  public void testProblemCase6() {
    int[][] A = {{1,1,1},{0,0,0},{0,0,0}};
    LeetCode0934 solution = new LeetCode0934();
    Assert.assertEquals(Integer.MAX_VALUE, solution.shortestBridge(A));
  }
}
