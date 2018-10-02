package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode913;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode913 {
  @Test
  public void testProblemCase1() {
    int[][] graph = {{2,5},{3},{0,4,5},{1,4,5},{2,3},{0,2,3}};
    LeetCode913 solution = new LeetCode913();
    Assert.assertEquals(0, solution.catMouseGame(graph));
  }

  @Test
  public void testProblemCase2() {
    int[][] graph = {{2},{3},{0,3},{1,2}};
    LeetCode913 solution = new LeetCode913();
    Assert.assertEquals(2, solution.catMouseGame(graph));
    // 0 - 2 - 3 - 1
  }

  @Test
  public void testProblemCase3() {
    int[][] graph = {{1},{0,3},{3},{1,2}};
    LeetCode913 solution = new LeetCode913();
    Assert.assertEquals(1, solution.catMouseGame(graph));    
    // 0 - 1 - 3 - 2
  }

  @Test
  public void testProblemCase4() {
    int[][] graph = {{1,3},{0},{3},{0,2}};
    LeetCode913 solution = new LeetCode913();
    Assert.assertEquals(1, solution.catMouseGame(graph));
    // cat cannot reach node 1
    // 0 - 1 
    // | \
    // 3 - 2
  }

  @Test
  public void testProblemCase5() {
    int[][] graph = {{2,3},{3,4},{0,4},{0,1},{1,2}};
    LeetCode913 solution = new LeetCode913();
    Assert.assertEquals(1, solution.catMouseGame(graph));
    //     2 - 0 
    //   /     | 
    // 4 - 1 - 3
  }
}
