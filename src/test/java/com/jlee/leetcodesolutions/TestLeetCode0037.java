package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0037;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0037 {
  @Test
  public void testProblemCase1() {
    char[][] board = {{'5','3','.', '.','7','.', '.','.','.'},
                      {'6','.','.', '1','9','5', '.','.','.'},
                      {'.','9','8', '.','.','.', '.','6','.'},
        
                      {'8','.','.', '.','6','.', '.','.','3'},
                      {'4','.','.', '8','.','3', '.','.','1'},
                      {'7','.','.', '.','2','.', '.','.','6'},
        
                      {'.','6','.', '.','.','.', '2','8','.'},
                      {'.','.','.', '4','1','9', '.','.','5'},
                      {'.','.','.', '.','8','.', '.','7','9'}};
    
    LeetCode0037 solution = new LeetCode0037();
    solution.solveSudoku(board);
    Assert.assertArrayEquals(new char[] {'5','3','4', '6','7','8', '9','1','2'}, board[0]);
    Assert.assertArrayEquals(new char[] {'6','7','2', '1','9','5', '3','4','8'}, board[1]);
    Assert.assertArrayEquals(new char[] {'1','9','8', '3','4','2', '5','6','7'}, board[2]);
    Assert.assertArrayEquals(new char[] {'8','5','9', '7','6','1', '4','2','3'}, board[3]);
    Assert.assertArrayEquals(new char[] {'4','2','6', '8','5','3', '7','9','1'}, board[4]);
    Assert.assertArrayEquals(new char[] {'7','1','3', '9','2','4', '8','5','6'}, board[5]);
    Assert.assertArrayEquals(new char[] {'9','6','1', '5','3','7', '2','8','4'}, board[6]);
    Assert.assertArrayEquals(new char[] {'2','8','7', '4','1','9', '6','3','5'}, board[7]);
    Assert.assertArrayEquals(new char[] {'3','4','5', '2','8','6', '1','7','9'}, board[8]);
  }
}
