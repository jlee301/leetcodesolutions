package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode542;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode542 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = { {0,0,0},
                       {0,1,0},
                       {0,0,0} };
    LeetCode542 solution = new LeetCode542();
    Assert.assertArrayEquals(new int[][] {{0,0,0},{0,1,0},{0,0,0}}, solution.updateMatrix(matrix));
  }

  @Test
  public void testProblemCase2() {
    int[][] matrix = { {0,0,0},
                       {0,1,0},
                       {1,1,1} };
    LeetCode542 solution = new LeetCode542();
    Assert.assertArrayEquals(new int[][] {{0,0,0},{0,1,0},{1,2,1}}, solution.updateMatrix(matrix));
  }

  @Test
  public void testEmptyRow() {
    int[][] matrix = {};
    LeetCode542 solution = new LeetCode542();
    Assert.assertArrayEquals(new int[][] {}, solution.updateMatrix(matrix));
  }

  @Test
  public void testEmptyCol() {
    int[][] matrix = {{}};
    LeetCode542 solution = new LeetCode542();
    Assert.assertArrayEquals(new int[][] {{}}, solution.updateMatrix(matrix));
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode542 solution = new LeetCode542();
    Assert.assertNull(solution.updateMatrix(matrix));
  }
}
