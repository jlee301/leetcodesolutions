package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1129;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1129 {
  @Test
  public void testProblemCase1() {
    int n = 3;
    int[][] red_edges = {{0,1},{1,2}}, blue_edges = {};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,1,-1}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }

  @Test
  public void testProblemCase2() {
    int n = 3;
    int[][] red_edges = {{0,1}}, blue_edges = {{2,1}};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,1,-1}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }

  @Test
  public void testProblemCase3() {
    int n = 3;
    int[][] red_edges = {{1,0}}, blue_edges = {{2,1}};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,-1,-1}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }

  @Test
  public void testProblemCase4() {
    int n = 3;
    int[][] red_edges = {{0,1}}, blue_edges = {{1,2}};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,1,2}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }

  @Test
  public void testProblemCase5() {
    int n = 3;
    int[][] red_edges = {{0,1},{0,2}}, blue_edges = {{1,0}};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,1,1}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }

  @Test
  public void testProblemCase6() {
    int n = 5;
    int[][] red_edges = {{2,2},{0,1},{0,3},{0,0},{0,4},{2,1},{2,0},{1,4},{3,4}}, blue_edges = {{1,3},{0,0},{0,3},{4,2},{1,0}};
    LeetCode1129 solution = new LeetCode1129();
    Assert.assertArrayEquals(new int[] {0,1,2,1,1}, solution.shortestAlternatingPaths(n, red_edges, blue_edges));
  }
}
