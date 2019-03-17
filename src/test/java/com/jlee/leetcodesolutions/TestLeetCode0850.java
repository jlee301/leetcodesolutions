package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0850;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0850 {
  @Test
  public void testProblemCase1() {
    // Input: [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
    // Output: 6
    int[][] rectangles = { {0,0,2,2}, {1,0,2,3}, {1,0,3,1} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(6, solution.rectangleArea(rectangles));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[0,0,1000000000,1000000000]]
    // Output: 49
    int[][] rectangles = { {0,0,1000000000,1000000000} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(49, solution.rectangleArea(rectangles));
  }

  @Test
  public void testWrongAns() {
    // Input: [[0,0,1,1],[2,2,3,3]]
    // Output: 2
    int[][] rectangles = { {0,0,1,1}, {2,2,3,3} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(2, solution.rectangleArea(rectangles));
  }
  
  @Test
  public void testCurrentAhead() {
    int[][] rectangles = { {0,0,2,2}, {1,1,3,3} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(7, solution.rectangleArea(rectangles));
  }

  @Test
  public void testCurrentBehind() {
    int[][] rectangles = { {1,1,3,3}, {0,0,2,2} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(7, solution.rectangleArea(rectangles));
  }

  @Test
  public void testDoesNotOverLap() {
    int[][] rectangles = { {0,0,1,1}, {-1,0,0,1}, {-1,1,0,2}, {0,1,1,2}, {1,1,2,2}, {1,0,2,1}, {1,-1,2,0}, {0,-1,1,0}, {-1,-1,0,0} };
    LeetCode0850 solution = new LeetCode0850();
    Assert.assertEquals(9, solution.rectangleArea(rectangles));
  }
}
