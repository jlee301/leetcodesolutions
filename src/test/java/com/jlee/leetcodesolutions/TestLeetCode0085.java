package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0085;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0085 {
  @Test
  public void testProblemCase1() {
    char[][] matrix = { {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'} };
    LeetCode0085 solution = new LeetCode0085();
    Assert.assertEquals(6, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase2() {
    char[][] matrix = {};
    LeetCode0085 solution = new LeetCode0085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase3() {
    char[][] matrix = {{}};
    LeetCode0085 solution = new LeetCode0085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }

  @Test
  public void testProblemCase4() {
    char[][] matrix = null;
    LeetCode0085 solution = new LeetCode0085();
    Assert.assertEquals(0, solution.maximalRectangle(matrix));
  }
}
