package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0073;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0073 {
  @Test
  public void test3By3With0InMiddle() {
    int[][] matrix = { {1,2,3}, 
                       {4,0,5}, 
                       {6,7,8} };
    LeetCode0073 solution = new LeetCode0073();
    solution.setZeroes(matrix);
    Assert.assertEquals(1, matrix[0][0]);
    Assert.assertEquals(0, matrix[0][1]);
    Assert.assertEquals(3, matrix[0][2]);
    Assert.assertEquals(0, matrix[1][0]);
    Assert.assertEquals(0, matrix[1][1]);
    Assert.assertEquals(0, matrix[1][2]);
    Assert.assertEquals(6, matrix[2][0]);
    Assert.assertEquals(0, matrix[2][1]);
    Assert.assertEquals(8, matrix[2][2]);
  }

  @Test
  public void testEmptyRow() {
    int[][] matrix = {};
    LeetCode0073 solution = new LeetCode0073();
    solution.setZeroes(matrix);
    Assert.assertEquals(0, matrix.length);
  }

  @Test
  public void testEmptyCol() {
    int[][] matrix = {{}};
    LeetCode0073 solution = new LeetCode0073();
    solution.setZeroes(matrix);
    Assert.assertEquals(0, matrix[0].length);
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode0073 solution = new LeetCode0073();
    solution.setZeroes(matrix);
    Assert.assertNull(matrix);
  }
}
