package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0059;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0059 {
  @Test
  public void testN3() {
    int n = 3;
    LeetCode0059 solution = new LeetCode0059();
    int[][] result = solution.generateMatrix(n);
    Assert.assertEquals(n, result.length);
    Assert.assertEquals(n, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(3, result[0][2]);
    Assert.assertEquals(8, result[1][0]);
    Assert.assertEquals(9, result[1][1]);
    Assert.assertEquals(4, result[1][2]);
    Assert.assertEquals(7, result[2][0]);
    Assert.assertEquals(6, result[2][1]);
    Assert.assertEquals(5, result[2][2]);
  }

  @Test
  public void testN2() {
    int n = 2;
    LeetCode0059 solution = new LeetCode0059();
    int[][] result = solution.generateMatrix(n);
    Assert.assertEquals(n, result.length);
    Assert.assertEquals(n, result[0].length);
    Assert.assertEquals(1, result[0][0]);
    Assert.assertEquals(2, result[0][1]);
    Assert.assertEquals(4, result[1][0]);
    Assert.assertEquals(3, result[1][1]);
  }

  @Test
  public void testN1() {
    int n = 1;
    LeetCode0059 solution = new LeetCode0059();
    int[][] result = solution.generateMatrix(n);
    Assert.assertEquals(n, result.length);
    Assert.assertEquals(n, result[0].length);
    Assert.assertEquals(1, result[0][0]);
  }

  @Test
  public void testN0() {
    int n = 0;
    LeetCode0059 solution = new LeetCode0059();
    int[][] result = solution.generateMatrix(n);
    Assert.assertEquals(0, result.length);
  }

  @Test
  public void testNeg() {
    int n = -1;
    LeetCode0059 solution = new LeetCode0059();
    int[][] result = solution.generateMatrix(n);
    Assert.assertEquals(0, result.length);
  }
}
