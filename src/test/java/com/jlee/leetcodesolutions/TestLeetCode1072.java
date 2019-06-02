package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1072;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1072 {
  @Test
  public void testProblemCase1() {
    int[][] matrix = {{0,1},{1,1}};
    LeetCode1072 solution = new LeetCode1072();
    Assert.assertEquals(1, solution.maxEqualRowsAfterFlips(matrix));
  }

  @Test
  public void testProblemCase2() {
    int[][] matrix = {{0,1},{1,0}};
    LeetCode1072 solution = new LeetCode1072();
    Assert.assertEquals(2, solution.maxEqualRowsAfterFlips(matrix));
  }

  @Test
  public void testProblemCase3() {
    int[][] matrix = {{0,0,0},{0,0,1},{1,1,0}};
    LeetCode1072 solution = new LeetCode1072();
    Assert.assertEquals(2, solution.maxEqualRowsAfterFlips(matrix));
  }
  
  @Test
  public void testProblemCase4() {
    int[][] matrix = { { 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1 }, 
                       { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
                       { 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1 }, 
                       { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, 
                       { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 } };
    LeetCode1072 solution = new LeetCode1072();
    Assert.assertEquals(2, solution.maxEqualRowsAfterFlips(matrix));
  }
}
