package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode054;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode054 {
  @Test
  public void testProblemCase() {
    int[][] matrix = { {1,2,3},
                       {4,5,6},
                       {7,8,9} };
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(9, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(6, (int) result.get(3));
    Assert.assertEquals(9, (int) result.get(4));
    Assert.assertEquals(8, (int) result.get(5));
    Assert.assertEquals(7, (int) result.get(6));
    Assert.assertEquals(4, (int) result.get(7));
    Assert.assertEquals(5, (int) result.get(8));
  }

  @Test
  public void testOneByNine() {
    int[][] matrix = { {1,2,3,4,5,6,7,8,9} };
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(9, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(4, (int) result.get(3));
    Assert.assertEquals(5, (int) result.get(4));
    Assert.assertEquals(6, (int) result.get(5));
    Assert.assertEquals(7, (int) result.get(6));
    Assert.assertEquals(8, (int) result.get(7));
    Assert.assertEquals(9, (int) result.get(8));
  }

  @Test
  public void testNineByOne() {
    int[][] matrix = { {1},{2},{3},{4},{5},{6},{7},{8},{9} };
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(9, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(4, (int) result.get(3));
    Assert.assertEquals(5, (int) result.get(4));
    Assert.assertEquals(6, (int) result.get(5));
    Assert.assertEquals(7, (int) result.get(6));
    Assert.assertEquals(8, (int) result.get(7));
    Assert.assertEquals(9, (int) result.get(8));
  }

  @Test
  public void testFourByFour() {
    int[][] matrix = { {1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16} };
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(16, result.size());
    Assert.assertEquals(1, (int) result.get(0));
    Assert.assertEquals(2, (int) result.get(1));
    Assert.assertEquals(3, (int) result.get(2));
    Assert.assertEquals(4, (int) result.get(3));
    Assert.assertEquals(8, (int) result.get(4));
    Assert.assertEquals(12, (int) result.get(5));
    Assert.assertEquals(16, (int) result.get(6));
    Assert.assertEquals(15, (int) result.get(7));
    Assert.assertEquals(14, (int) result.get(8));
    Assert.assertEquals(13, (int) result.get(9));
    Assert.assertEquals(9, (int) result.get(10));
    Assert.assertEquals(5, (int) result.get(11));
    Assert.assertEquals(6, (int) result.get(12));
    Assert.assertEquals(7, (int) result.get(13));
    Assert.assertEquals(11, (int) result.get(14));
    Assert.assertEquals(10, (int) result.get(15));
  }

  @Test
  public void testEmpty() {
    int[][] matrix = {};
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testRowEmpty() {
    int[][] matrix = {{}};
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(0, result.size());
  }

  @Test
  public void testNull() {
    int[][] matrix = null;
    LeetCode054 solution = new LeetCode054();
    List<Integer> result = solution.spiralOrder(matrix);
    Assert.assertEquals(0, result.size());
  }
}
