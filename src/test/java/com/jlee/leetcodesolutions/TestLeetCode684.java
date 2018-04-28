package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode684;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode684 {
  @Test
  public void testProblemCase1() {
    int[][] edges = {{1,2}, {1,3}, {2,3}};
    LeetCode684 solution = new LeetCode684();
    Assert.assertArrayEquals(new int[] {2,3}, solution.findRedundantConnection(edges));
  }

  @Test
  public void testProblemCase2() {
    int[][] edges = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
    LeetCode684 solution = new LeetCode684();
    Assert.assertArrayEquals(new int[] {1,4}, solution.findRedundantConnection(edges));
  }
  
  @Test
  public void testWrongAns() {
    int[][] edges = {{1,3}, {3,4}, {1,5}, {3,5}, {2,3}};
    LeetCode684 solution = new LeetCode684();
    Assert.assertArrayEquals(new int[] {3,5}, solution.findRedundantConnection(edges));
  }
  
  @Test
  public void testOneEdge() {
    int[][] edges = {{1,3}};
    LeetCode684 solution = new LeetCode684();
    Assert.assertArrayEquals(new int[] {}, solution.findRedundantConnection(edges));
  }
  
  @Test
  public void testNull() {
    int[][] edges = null;
    LeetCode684 solution = new LeetCode684();
    Assert.assertNull(solution.findRedundantConnection(edges));
  }
}
