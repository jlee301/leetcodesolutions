package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode048;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode048 {
  @Test
  public void testProblemCase() {
    int[][] matrix = { {1,2,3},
                       {4,5,6},
                       {7,8,9} };
    LeetCode048 solution = new LeetCode048();
    solution.rotate(matrix);
    Assert.assertEquals(7, matrix[0][0]);
    Assert.assertEquals(4, matrix[0][1]);
    Assert.assertEquals(1, matrix[0][2]);
    Assert.assertEquals(8, matrix[1][0]);
    Assert.assertEquals(5, matrix[1][1]);
    Assert.assertEquals(2, matrix[1][2]);
    Assert.assertEquals(9, matrix[2][0]);
    Assert.assertEquals(6, matrix[2][1]);
    Assert.assertEquals(3, matrix[2][2]);
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    LeetCode048 solution = new LeetCode048();
    solution.rotate(matrix);
    Assert.assertEquals(0, matrix.length);
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode048 solution = new LeetCode048();
    solution.rotate(matrix);
    Assert.assertNull(matrix);
  }
}
