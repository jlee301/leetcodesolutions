package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0310;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0310 {
  @Test
  public void testProblemCase1() {
    int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
    int n = 4;
    LeetCode0310 solution = new LeetCode0310();
    List<Integer> result = solution.findMinHeightTrees(n, edges);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(1, (int) result.get(0));
  }

  @Test
  public void testProblemCase2() {
    int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
    int n = 6;
    LeetCode0310 solution = new LeetCode0310();
    List<Integer> result = solution.findMinHeightTrees(n, edges);
    Assert.assertEquals(2, result.size());
    Assert.assertEquals(3, (int) result.get(0));
    Assert.assertEquals(4, (int) result.get(1));
  }

  @Test
  public void testN0() {
    int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
    int n = 0;
    LeetCode0310 solution = new LeetCode0310();
    List<Integer> result = solution.findMinHeightTrees(n, edges);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testEmpty() {
    int[][] edges = {};
    int n = 1;
    LeetCode0310 solution = new LeetCode0310();
    List<Integer> result = solution.findMinHeightTrees(n, edges);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(0, (int) result.get(0));
  }

  @Test
  public void testNull() {
    int[][] edges = null;
    int n = 6;
    LeetCode0310 solution = new LeetCode0310();
    List<Integer> result = solution.findMinHeightTrees(n, edges);
    Assert.assertEquals(0, result.size());
  }
}
