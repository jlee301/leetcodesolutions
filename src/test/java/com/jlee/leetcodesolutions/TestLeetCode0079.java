package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0079;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0079 {
  @Test
  public void testProblemCase1() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','C','S'}, 
                       {'A','D','E','E'} };
    String word = "ABCCED";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testProblemCase2() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','C','S'}, 
                       {'A','D','E','E'} };
    String word = "SEE";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testProblemCase3() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','C','S'}, 
                       {'A','D','E','E'} };
    String word = "ABCB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }
  
  @Test
  public void testWrongAnswer() {
    char[][] board = { {'C','A','A'}, 
                       {'A','A','A'}, 
                       {'B','C','D'} };
    String word = "AAB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }  

  @Test
  public void testWrongAnswer2() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','E','S'}, 
                       {'A','D','E','E'} };
    String word = "ABCESEEEFS";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }  

  @Test
  public void testNoMatchVerticalUp() {
    char[][] board = { {'A'}, 
                       {'A'}, 
                       {'B'} };
    String word = "BAB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testNoMatchVerticalDown() {
    char[][] board = { {'B'}, 
                       {'A'}, 
                       {'A'} };
    String word = "BAB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testMatchVerticalUp() {
    char[][] board = { {'A'}, 
                       {'A'}, 
                       {'B'} };
    String word = "BAA";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testMatchVerticalDown() {
    char[][] board = { {'B'}, 
                       {'A'}, 
                       {'A'} };
    String word = "BAA";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testNoMatchHorizontalLeft() {
    char[][] board = { {'B','A','A'} };
    String word = "BAB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testNoMatchHorizontalRight() {
    char[][] board = { {'A','A','B'} };
    String word = "BAB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testMatchHorizontalLeft() {
    char[][] board = { {'B','A','A'} };
    String word = "BAA";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testMatchHorizontalRight() {
    char[][] board = { {'A','A','B'} };
    String word = "BAA";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertTrue(solution.exist(board, word));
  }

  @Test
  public void testEmptyBoardRow() {
    char[][] board = {};
    String word = "ABCB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testEmptyBoardCol() {
    char[][] board = {{}};
    String word = "ABCB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testNullBoard() {
    char[][] board = null;
    String word = "ABCB";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testEmptyWord() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','C','S'}, 
                       {'A','D','E','E'} };
    String word = "";
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }

  @Test
  public void testNullWord() {
    char[][] board = { {'A','B','C','E'}, 
                       {'S','F','C','S'}, 
                       {'A','D','E','E'} };
    String word = null;
    LeetCode0079 solution = new LeetCode0079();
    Assert.assertFalse(solution.exist(board, word));
  }
}
