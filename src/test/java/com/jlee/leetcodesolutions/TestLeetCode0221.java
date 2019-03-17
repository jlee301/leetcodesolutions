package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0221;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0221 {
  @Test
  public void testProblemCase() {
    char[][] matrix = {{'1','0','1','0','0'},
                       {'1','0','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','0','0','1','0'}};
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(4, solution.maximalSquare(matrix));
  }

  @Test
  public void testEntireMatrixOnes() {
    char[][] matrix = {{'1','1','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','1','1','1','1'}};
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(16, solution.maximalSquare(matrix));
  }

  @Test
  public void testEntireMatrixZeroes() {
    char[][] matrix = {{'0','0','0','0','0'},
                       {'0','0','0','0','0'},
                       {'0','0','0','0','0'},
                       {'0','0','0','0','0'}};
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testRowEmpty() {
    char[][] matrix = {};
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testColEmpty() {
    char[][] matrix = {{}};
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testNull() {
    char[][] matrix = null;
    LeetCode0221 solution = new LeetCode0221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }
}
