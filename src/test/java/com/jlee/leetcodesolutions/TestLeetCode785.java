package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode785;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode785 {
  @Test
  public void testProblemCase1() {
    int[][] graph = {{1,3}, {0,2}, {1,3}, {0,2}};
    LeetCode785 solution = new LeetCode785();
    Assert.assertTrue(solution.isBipartite(graph));
  }

  @Test
  public void testProblemCase2() {
    int[][] graph = {{1,2,3}, {0,2}, {0,1,3}, {0,2}};
    LeetCode785 solution = new LeetCode785();
    Assert.assertFalse(solution.isBipartite(graph));
  }

  @Test
  public void testWrongAns() {
    int[][] graph = {{1}, {0,3}, {3}, {1,2}};
    LeetCode785 solution = new LeetCode785();
    Assert.assertTrue(solution.isBipartite(graph));
  }
  
  @Test
  public void testWrongAns2() {
    int[][] graph = {{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
    LeetCode785 solution = new LeetCode785();
    Assert.assertFalse(solution.isBipartite(graph));    
  }

  @Test
  public void testWrongAns3() {
    int[][] graph = {{3},{2,4},{1},{0,4},{1,3}};
    LeetCode785 solution = new LeetCode785();
    Assert.assertTrue(solution.isBipartite(graph));    
  }
}
