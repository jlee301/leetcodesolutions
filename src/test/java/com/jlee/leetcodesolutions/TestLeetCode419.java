package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode419;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode419 {
  @Test
  public void testProblemCase() {
    char[][] board = { {'X','.','.','X'},
                       {'.','.','.','X'},
                       {'.','.','.','X'} };
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testShipsVerticalAlt() {
    char[][] board = { {'X','.','X','.'},
                       {'X','.','X','.'},
                       {'X','.','X','.'} };
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testShipsHorizontalAlt() {
    char[][] board = { {'X','X','X','X'},
                       {'.','.','.','.'},
                       {'X','X','X','X'} };
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(2, solution.countBattleships(board));        
  }

  @Test
  public void testNoShips() {
    char[][] board = { {'.','.','.','.'},
                       {'.','.','.','.'},
                       {'.','.','.','.'} };
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testEmpty() {
    char[][] board = {};
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testEmptyRow() {
    char[][] board = {{}};
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }

  @Test
  public void testNull() {
    char[][] board = null;
    LeetCode419 solution = new LeetCode419();
    Assert.assertEquals(0, solution.countBattleships(board));        
  }
}
