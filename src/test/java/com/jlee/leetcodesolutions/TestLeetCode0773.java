package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0773;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0773 {
  @Test
  public void testProblemCase1() {
    // Input: board = [[1,2,3],[4,0,5]]
    // Output: 1
    int[][] board = {{1,2,3},{4,0,5}};
    LeetCode0773 solution = new LeetCode0773();
    Assert.assertEquals(1, solution.slidingPuzzle(board));
  }

  @Test
  public void testProblemCase2() {
    // Input: board = [[1,2,3],[5,4,0]]
    // Output: -1
    int[][] board = {{1,2,3},{5,4,0}};
    LeetCode0773 solution = new LeetCode0773();
    Assert.assertEquals(-1, solution.slidingPuzzle(board));
  }

  @Test
  public void testProblemCase3() {
    // Input: board = [[4,1,2],[5,0,3]]
    // Output: 5
    int[][] board = {{4,1,2},{5,0,3}};
    LeetCode0773 solution = new LeetCode0773();
    Assert.assertEquals(5, solution.slidingPuzzle(board));
  }

  @Test
  public void testProblemCase4() {
    // Input: board = [[3,2,4],[1,5,0]]
    // Output: 14
    int[][] board = {{3,2,4},{1,5,0}};
    LeetCode0773 solution = new LeetCode0773();
    Assert.assertEquals(14, solution.slidingPuzzle(board));
  }
}
