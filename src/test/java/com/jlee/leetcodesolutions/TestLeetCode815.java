package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode815;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode815 {
  @Test
  public void testProblemCase() {
    // Input: routes = [[1, 2, 7], [3, 6, 7]]
    //        S = 1
    //        T = 6
    // Output: 2
    int[][] routes = { {1,2,7}, {3,6,7} };
    int S = 1, T = 6;
    LeetCode815 solution = new LeetCode815();
    Assert.assertEquals(2, solution.numBusesToDestination(routes, S, T));
  }

  @Test
  public void testNoBusToDestination() {
    int[][] routes = { {1,2,7}, {3,6,7} };
    int S = 1, T = 8;
    LeetCode815 solution = new LeetCode815();
    Assert.assertEquals(-1, solution.numBusesToDestination(routes, S, T));
  }
  
  @Test
  public void testStartAndEndAtSameStop() {
    int[][] routes = { {1,7}, {3,5} };
    int S = 5, T = 5;
    LeetCode815 solution = new LeetCode815();
    Assert.assertEquals(0, solution.numBusesToDestination(routes, S, T));
  }
  
  @Test
  public void testEmpty() {
    int[][] routes = {};
    int S = 1, T = 6;
    LeetCode815 solution = new LeetCode815();
    Assert.assertEquals(-1, solution.numBusesToDestination(routes, S, T));
  }  

  @Test
  public void testNull() {
    int[][] routes = null;
    int S = 1, T = 6;
    LeetCode815 solution = new LeetCode815();
    Assert.assertEquals(-1, solution.numBusesToDestination(routes, S, T));
  }  
}
