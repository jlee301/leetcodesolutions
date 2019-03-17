package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0419;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0419 {
  @Test
  public void testProblemCase() {
    char[][] board = { {'X','.','.','X'},
                       {'.','.','.','X'},
                       {'.','.','.','X'} };
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testShipsVerticalAlt() {
    char[][] board = { {'X','.','X','.'},
                       {'X','.','X','.'},
                       {'X','.','X','.'} };
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testShipsHorizontalAlt() {
    char[][] board = { {'X','X','X','X'},
                       {'.','.','.','.'},
                       {'X','X','X','X'} };
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testNoShips() {
    char[][] board = { {'.','.','.','.'},
                       {'.','.','.','.'},
                       {'.','.','.','.'} };
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testEmpty() {
    char[][] board = {};
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testEmptyRow() {
    char[][] board = {{}};
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testNull() {
    char[][] board = null;
    LeetCode0419 solution = new LeetCode0419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }
}
