package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode924;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode924 {
  @Test
  public void testProblemCase1() {
    int[][] graph = {{1,1,0},{1,1,0},{0,0,1}};
    int[] initial = {0,1};
    LeetCode924 solution = new LeetCode924();
    Assert.assertEquals(0, solution.minMalwareSpread(graph, initial));
  }

  @Test
  public void testProblemCase2() {
    int[][] graph = {{1,0,0},{0,1,0},{0,0,1}};
    int[] initial = {0,2};
    LeetCode924 solution = new LeetCode924();
    Assert.assertEquals(0, solution.minMalwareSpread(graph, initial));
  }

  @Test
  public void testProblemCase3() {
    int[][] graph = {{1,1,1},{1,1,1},{1,1,1}};
    int[] initial = {1,2};
    LeetCode924 solution = new LeetCode924();
    Assert.assertEquals(1, solution.minMalwareSpread(graph, initial));
  }

  @Test
  public void testProblemCase4() {
    int[][] graph = {{1,0,0,0,0,0},{0,1,0,0,0,0},{0,0,1,0,0,0},{0,0,0,1,1,0},{0,0,0,1,1,0},{0,0,0,0,0,1}};
    int[] initial = {5,0};
    LeetCode924 solution = new LeetCode924();
    Assert.assertEquals(0, solution.minMalwareSpread(graph, initial));
  }
}
