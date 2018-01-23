package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode766;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode766 {
  @Test
  public void testToeplitz() {
    int[][] matrix = {{1,2,3,4},
                      {5,1,2,3},
                      {9,5,1,2}};
    LeetCode766 solution = new LeetCode766();
    Assert.assertTrue(solution.isToeplitzMatrix(matrix));
  }

  @Test
  public void testNotToeplitz() {
    int[][] matrix = {{1,2},
                      {2,2}};
    LeetCode766 solution = new LeetCode766();
    Assert.assertFalse(solution.isToeplitzMatrix(matrix));
  }

  @Test
  public void testOneEntry() {
    int[][] matrix = {{1}};
    LeetCode766 solution = new LeetCode766();
    Assert.assertTrue(solution.isToeplitzMatrix(matrix));
  }

  @Test
  public void testRowEmpty() {
    int[][] matrix = {};
    LeetCode766 solution = new LeetCode766();
    Assert.assertFalse(solution.isToeplitzMatrix(matrix));
  }

  @Test
  public void testColEmpty() {
    int[][] matrix = {{}};
    LeetCode766 solution = new LeetCode766();
    Assert.assertFalse(solution.isToeplitzMatrix(matrix));
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode766 solution = new LeetCode766();
    Assert.assertFalse(solution.isToeplitzMatrix(matrix));
  }
}
