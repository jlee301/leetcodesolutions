package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode529;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode529 {
  @Test
  public void testProblemCase1() {
    char[][] board = { {'E', 'E', 'E', 'E', 'E'},
                       {'E', 'E', 'M', 'E', 'E'},
                       {'E', 'E', 'E', 'E', 'E'},
                       {'E', 'E', 'E', 'E', 'E'} };
    int[] click = { 3,0 };
    LeetCode529 solution = new LeetCode529();
    char[][] result = solution.updateBoard(board, click);
    Assert.assertArrayEquals(new char[][] {{'B', '1', 'E', '1', 'B'},{'B', '1', 'M', '1', 'B'},{'B', '1', '1', '1', 'B'},{'B', 'B', 'B', 'B', 'B'}}, result);
  }

  @Test
  public void testProblemCase2() {
    char[][] board = { {'B', '1', 'E', '1', 'B'},
                       {'B', '1', 'M', '1', 'B'},
                       {'B', '1', '1', '1', 'B'},
                       {'B', 'B', 'B', 'B', 'B'} };
    int[] click = { 1,2 };
    LeetCode529 solution = new LeetCode529();
    char[][] result = solution.updateBoard(board, click);
    Assert.assertArrayEquals(new char[][] {{'B', '1', 'E', '1', 'B'},{'B', '1', 'X', '1', 'B'},{'B', '1', '1', '1', 'B'},{'B', 'B', 'B', 'B', 'B'}}, result);
  }

  @Test
  public void testNoMines() {
    char[][] board = { {'E', 'E'},
                       {'E', 'E'} };
    int[] click = { 1,0 };
    LeetCode529 solution = new LeetCode529();
    char[][] result = solution.updateBoard(board, click);
    Assert.assertArrayEquals(new char[][] {{'B','B'},{'B','B'}}, result);
  }

  @Test
  public void testOneMine() {
    char[][] board = { {'E', 'M'},
                       {'E', 'E'} };
    int[] click = { 1,0 };
    LeetCode529 solution = new LeetCode529();
    char[][] result = solution.updateBoard(board, click);
    Assert.assertArrayEquals(new char[][] {{'E','M'},{'1','E'}}, result);
  }

  @Test
  public void testAllMines() {
    char[][] board = { {'M', 'M'},
                       {'M', 'M'} };
    int[] click = { 1,0 };
    LeetCode529 solution = new LeetCode529();
    char[][] result = solution.updateBoard(board, click);
    Assert.assertArrayEquals(new char[][] {{'M','M'},{'X','M'}}, result);
  }
}
