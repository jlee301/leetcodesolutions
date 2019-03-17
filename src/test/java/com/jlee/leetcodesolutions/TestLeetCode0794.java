package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0794;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0794 {
  @Test
  public void testProblemCase1() {
    String[] board = {"O  ", "   ", "   "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }

  @Test
  public void testProblemCase2() {
    String[] board = {"XOX", " X ", "   "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }

  @Test
  public void testProblemCase3() {
    String[] board = {"XXX", "   ", "OOO"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }

  @Test
  public void testProblemCase4() {
    String[] board = {"XOX", "O O", "XOX"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testMultipleVerticalWinners() {
    String[] board = {"XO ", "XO ", "XO "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }

  @Test
  public void testDiagonalWinnerX() {
    String[] board = {"X  ", "OX ", " OX"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testDiagonalWinnerO() {
    String[] board = {"OX ", "XO ", " XO"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testDiagonalWinnerOppositeX() {
    String[] board = {"  X", " XO", "XO "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testDiagonalWinnerOppositeO() {
    String[] board = {" XO", " OX", "OX "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testXFilledTwoRowsWin() {
    String[] board = {"XXX","OOX","OOX"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertTrue(solution.validTicTacToe(board));
  }

  @Test
  public void testXShouldHave1ExtraMoveIfWon() {
    String[] board = {"XXX","XOO","OO "};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }

  @Test
  public void testOShouldHaveEqualMovesIfWon() {
    String[] board = {"OXX","XOX","OXO"};
    LeetCode0794 solution = new LeetCode0794();
    Assert.assertFalse(solution.validTicTacToe(board));
  }
}
