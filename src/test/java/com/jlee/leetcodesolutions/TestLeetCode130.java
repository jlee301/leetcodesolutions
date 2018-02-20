package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode130;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode130 {
  @Test
  public void testProblemCase() {
    char[][] board = {{'X','X','X','X'},
                      {'X','O','O','X'},
                      {'X','X','O','X'},
                      {'X','O','X','X'}};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertArrayEquals(new char[] {'X','X','X','X'}, board[0]);
    Assert.assertArrayEquals(new char[] {'X','X','X','X'}, board[1]);
    Assert.assertArrayEquals(new char[] {'X','X','X','X'}, board[2]);
    Assert.assertArrayEquals(new char[] {'X','O','X','X'}, board[3]);
  }

  @Test
  public void testNoCapture() {
    char[][] board = {{'X','X','X','X'},
                      {'X','O','O','X'},
                      {'X','O','O','X'},
                      {'X','O','X','X'}};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertArrayEquals(new char[] {'X','X','X','X'}, board[0]);
    Assert.assertArrayEquals(new char[] {'X','O','O','X'}, board[1]);
    Assert.assertArrayEquals(new char[] {'X','O','O','X'}, board[2]);
    Assert.assertArrayEquals(new char[] {'X','O','X','X'}, board[3]);
  }

  @Test
  public void testOneRow() {
    char[][] board = {{'X','O','X','X'}};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertArrayEquals(new char[] {'X','O','X','X'}, board[0]);
  }

  @Test
  public void testOneCol() {
    char[][] board = {{'X'},{'O'},{'X'},{'X'}};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertArrayEquals(new char[] {'X'}, board[0]);
    Assert.assertArrayEquals(new char[] {'O'}, board[1]);
    Assert.assertArrayEquals(new char[] {'X'}, board[2]);
    Assert.assertArrayEquals(new char[] {'X'}, board[3]);
  }
  
  @Test
  public void testBoardEmpty() {
    char[][] board = {};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertEquals(0, board.length);
  }

  @Test
  public void testBoardRowEmpty() {
    char[][] board = {{}};
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertEquals(0, board[0].length);
  }

  @Test
  public void testBoardNull() {
    char[][] board = null;
    LeetCode130 solution = new LeetCode130();
    solution.solve(board);
    Assert.assertNull(board);
  }
}
