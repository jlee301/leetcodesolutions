package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode240;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode240 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = {{1,4,7,11,15}, 
                      {2,5,8,12,19}, 
                      {3,6,9,16,22}, 
                      {10,13,14,17,24}, 
                      {18,21,23,26,30}}; 
    int target = 5;
    LeetCode240 solution = new LeetCode240();
    Assert.assertTrue(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testProblemCase2() {
    int[][] matrix = {{1,4,7,11,15}, 
                      {2,5,8,12,19}, 
                      {3,6,9,16,22}, 
                      {10,13,14,17,24}, 
                      {18,21,23,26,30}}; 
    int target = 20;
    LeetCode240 solution = new LeetCode240();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testProblemCase3() {
    int[][] matrix = {{1,4,7,11,15}, 
                      {2,5,8,12,19}, 
                      {3,6,9,16,22}, 
                      {10,13,14,17,24}, 
                      {18,21,23,26,30}}; 
    int target = 0;
    LeetCode240 solution = new LeetCode240();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {}; 
    int target = 0;
    LeetCode240 solution = new LeetCode240();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testEmptyRow() {
    int[][] matrix = {{}}; 
    int target = 0;
    LeetCode240 solution = new LeetCode240();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testNull() {
    int[][] matrix = null; 
    int target = 0;
    LeetCode240 solution = new LeetCode240();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }
}
