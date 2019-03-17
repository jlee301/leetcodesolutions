package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.NumMatrix;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0304 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = { {3, 0, 1, 4, 2}, 
                       {5, 6, 3, 2, 1}, 
                       {1, 2, 0, 1, 5},
                       {4, 1, 0, 1, 7}, 
                       {1, 0, 3, 0, 5} };
    NumMatrix solution = new NumMatrix(matrix);
    Assert.assertEquals(8, solution.sumRegion(2, 1, 4, 3)); 
    Assert.assertEquals(11, solution.sumRegion(1, 1, 2, 2)); 
    Assert.assertEquals(12, solution.sumRegion(1, 2, 2, 4)); 
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    NumMatrix solution = new NumMatrix(matrix);
    Assert.assertEquals(0, solution.sumRegion(2, 1, 4, 3)); 
  }

  @Test
  public void testEmptyRow() {
    int[][] matrix = {{}};
    NumMatrix solution = new NumMatrix(matrix);
    Assert.assertEquals(0, solution.sumRegion(2, 1, 4, 3)); 
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    NumMatrix solution = new NumMatrix(matrix);
    Assert.assertEquals(0, solution.sumRegion(2, 1, 4, 3)); 
  }
}
