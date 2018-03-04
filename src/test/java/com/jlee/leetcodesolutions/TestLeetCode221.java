package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode221;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode221 {
  @Test
  public void testProblemCase() {
    char[][] matrix = {{'1','0','1','0','0'},
                       {'1','0','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','0','0','1','0'}};
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(4, solution.maximalSquare(matrix));
  }

  @Test
  public void testEntireMatrixOnes() {
    char[][] matrix = {{'1','1','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','1','1','1','1'},
                       {'1','1','1','1','1'}};
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(16, solution.maximalSquare(matrix));
  }

  @Test
  public void testEntireMatrixZeroes() {
    char[][] matrix = {{'0','0','0','0','0'},
                       {'0','0','0','0','0'},
                       {'0','0','0','0','0'},
                       {'0','0','0','0','0'}};
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testRowEmpty() {
    char[][] matrix = {};
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testColEmpty() {
    char[][] matrix = {{}};
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }

  @Test
  public void testNull() {
    char[][] matrix = null;
    LeetCode221 solution = new LeetCode221();
    Assert.assertEquals(0, solution.maximalSquare(matrix));
  }
}
