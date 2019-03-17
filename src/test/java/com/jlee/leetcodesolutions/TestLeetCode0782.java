package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0782;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0782 {
  @Test
  public void testProblemCase1() {
    // Input: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
    // Output: 2
    int[][] board = {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(2, solution.movesToChessboard(board));
  }

  @Test
  public void testProblemCase2() {
    // Input: board = [[0, 1], [1, 0]]
    // Output: 0
    int[][] board = {{0,1},{1,0}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(0, solution.movesToChessboard(board));
  }

  @Test
  public void testProblemCase3() {
    // Input: board = [[1,0], [1,0]]
    // Output: -1
    int[][] board = {{1,0},{1,0}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(-1, solution.movesToChessboard(board));
  }

  @Test
  public void testBoardNotSameOrInverse() {
    // Input: board = [[1,0], [1,1]]
    // Output: -1
    int[][] board = {{1,0},{1,1}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(-1, solution.movesToChessboard(board));
  }

  @Test
  public void testWrongAns() {
    // Input: board = [[1,1,0], [0,0,1], [0,0,1]]
    // Output: 2
    int[][] board = {{1,1,0},{0,0,1},{0,0,1}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(2, solution.movesToChessboard(board));
  }

  @Test
  public void testWrongAns2() {
    // Input: board = [[0,0,1], [1,1,0], [1,1,0]]
    // Output: 2
    int[][] board = {{0,0,1},{1,1,0},{1,1,0}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(2, solution.movesToChessboard(board));
  }

  @Test
  public void testAllOnes() {
    // Input: board = [[1,1,1], [1,1,1], [1,1,1]]
    // Output: -1
    int[][] board = {{1,1,1},{1,1,1},{1,1,1}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(-1, solution.movesToChessboard(board));
  }

  @Test
  public void testAllZeroes() {
    // Input: board = [[0,0,0], [0,0,0], [0,0,0]]
    // Output: -1
    int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(-1, solution.movesToChessboard(board));
  }

  @Test
  public void testAllSame() {
    // Input: board = [[0,1,0], [0,1,0], [0,1,0]]
    // Output: -1
    int[][] board = {{0,1,0},{0,1,0},{0,1,0}};
    LeetCode0782 solution = new LeetCode0782();
    Assert.assertEquals(-1, solution.movesToChessboard(board));
  }
}
