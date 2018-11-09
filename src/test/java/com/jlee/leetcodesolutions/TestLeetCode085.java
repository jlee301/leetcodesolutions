package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode085;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode085 {
  @Test
  public void testProblemCase1() {
    char[][] matrix = { {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'} };
    LeetCode085 solution = new LeetCode085();
    Assert.assertEquals(6, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase2() {
    char[][] matrix = {};
    LeetCode085 solution = new LeetCode085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase3() {
    char[][] matrix = {{}};
    LeetCode085 solution = new LeetCode085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase4() {
    char[][] matrix = null;
    LeetCode085 solution = new LeetCode085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }
}
