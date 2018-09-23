package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode909;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode909 {
  @Test
  public void testProblemCase1() {
    int[][] board = { { -1, -1, -1, -1, -1, -1 }, 
                      { -1, -1, -1, -1, -1, -1 }, 
                      { -1, -1, -1, -1, -1, -1 },
                      { -1, 35, -1, -1, 13, -1 }, 
                      { -1, -1, -1, -1, -1, -1 }, 
                      { -1, 15, -1, -1, -1, -1 } };
    LeetCode909 solution = new LeetCode909();
    Assert.assertEquals(4, solution.snakesAndLadders(board));
  }

  @Test
  public void testProblemCase2() {
    int[][] board = { { -1, -1, -1, 46, 47, -1, -1, -1 }, 
                      { 51, -1, -1, 63, -1, 31, 21, -1 },
                      { -1, -1, 26, -1, -1, 38, -1, -1 }, 
                      { -1, -1, 11, -1, 14, 23, 56, 57 }, 
                      { 11, -1, -1, -1, 49, 36, -1, 48 },
                      { -1, -1, -1, 33, 56, -1, 57, 21 }, 
                      { -1, -1, -1, -1, -1, -1, 2, -1 }, 
                      { -1, -1, -1, 8, 3, -1, 6, 56 } };
    LeetCode909 solution = new LeetCode909();
    Assert.assertEquals(4, solution.snakesAndLadders(board));
  }

  @Test
  public void testProblemCase3() {
    int[][] board = { { -1, -1 }, 
                      { -1,  3 } };
    LeetCode909 solution = new LeetCode909();
    Assert.assertEquals(1, solution.snakesAndLadders(board));
  }

  @Test
  public void testProblemCase4() {
    int[][] board = { { -1,  1,  2, -1 }, 
                      {  2, 13, 15, -1 }, 
                      { -1, 10, -1, -1 }, 
                      { -1,  6,  2,  8 } };
    LeetCode909 solution = new LeetCode909();
    Assert.assertEquals(2, solution.snakesAndLadders(board));
  }

  @Test
  public void testProblemCase5() {
    int[][] board = { { -1,  2,  2,  2 }, 
                      { -1,  2,  2,  2 } };
    LeetCode909 solution = new LeetCode909();
    Assert.assertEquals(-1, solution.snakesAndLadders(board));
  }
}
