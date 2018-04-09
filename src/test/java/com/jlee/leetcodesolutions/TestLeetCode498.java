package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode498;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode498 {
  @Test
  public void testProblemCase() {
    int[][] matrix =  { {1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9} };
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {1,2,4,7,5,3,6,8,9}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void test2By2() {
    int[][] matrix =  { {1, 2}, 
                        {3, 4} };
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {1,2,3,4}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void test4By1() {
    int[][] matrix =  { {1}, 
                        {2},
                        {3},
                        {4} };
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {1,2,3,4}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void test1By4() {
    int[][] matrix =  { {1,2,3,4} };
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {1,2,3,4}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode498 solution = new LeetCode498();
    Assert.assertArrayEquals(new int[] {}, solution.findDiagonalOrder(matrix));
  }
}
