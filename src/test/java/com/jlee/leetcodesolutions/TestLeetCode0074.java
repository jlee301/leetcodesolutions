package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0074;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0074 {
  @Test
  public void testProblemCase() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = 7;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertTrue(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testTargetLessThanEveryElement() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = -1;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testTargetNotFound() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = 8;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testTargetFoundOnRowDetermination() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = 10;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertTrue(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testElementIsBiggerThanTargetOnRowSearch() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = 6;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testTargetBiggerThanEveryElement() {
    int[][] matrix = { {1,3,5,7}, 
                       {10,11,16,20}, 
                       {23,30,34,50} };
    int target = 100;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testEmptyRow() {
    int[][] matrix = {};
    int target = 7;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testEmptyCol() {
    int[][] matrix = {{}};
    int target = 7;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    int target = 7;
    LeetCode0074 solution = new LeetCode0074();
    Assert.assertFalse(solution.searchMatrix(matrix, target));
  }
}
