package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0289;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0289 {
  @Test
  public void testUnderPopulation() {
    int[][] board = { {0,0,0,0,0},
                      {0,0,1,0,0},
                      {0,0,1,0,0},
                      {0,0,0,0,0},
                      {0,0,0,0,0} };
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[0]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[1]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[2]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[3]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[4]);
  }
  
  @Test
  public void testOverPopulation() {
    int[][] board = { {0,0,1,0,0},
                      {0,1,1,0,0},
                      {0,1,1,0,0},
                      {0,0,0,0,0},
                      {0,0,0,0,0} };
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertArrayEquals(new int[] {0,1,1,0,0}, board[0]);
    Assert.assertArrayEquals(new int[] {0,0,0,1,0}, board[1]);
    Assert.assertArrayEquals(new int[] {0,1,1,0,0}, board[2]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[3]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[4]);
  }
  
  @Test
  public void testDeadCellReproduction() {
    int[][] board = { {0,0,0,0,0},
                      {0,0,1,0,0},
                      {0,0,1,0,0},
                      {0,0,1,0,0},
                      {0,0,0,0,0} };
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[0]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[1]);
    Assert.assertArrayEquals(new int[] {0,1,1,1,0}, board[2]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[3]);
    Assert.assertArrayEquals(new int[] {0,0,0,0,0}, board[4]);
  }
  
  @Test
  public void testOneEntry() {
    int[][] board = {{0}};
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertArrayEquals(new int[] {0}, board[0]);
  }

  @Test
  public void testEmpty() {
    int[][] board = {};
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertEquals(0, board.length);
  }

  @Test
  public void testEmptyRow() {
    int[][] board = {{}};
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertEquals(0, board[0].length);
  }

  @Test
  public void testNull() {
    int[][] board = null;
    LeetCode0289 solution = new LeetCode0289();
    solution.gameOfLife(board);
    Assert.assertNull(board);
  }
}
