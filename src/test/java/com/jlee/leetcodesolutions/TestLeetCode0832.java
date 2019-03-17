package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0832;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0832 {
  @Test
  public void testProblemCase1() {
    int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
    LeetCode0832 solution = new LeetCode0832();
    Assert.assertArrayEquals(new int[][] {{1,0,0},{0,1,0},{1,1,1}}, solution.flipAndInvertImage(A));
  }

  @Test
  public void testProblemCase2() {
    int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    LeetCode0832 solution = new LeetCode0832();
    Assert.assertArrayEquals(new int[][] {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}, solution.flipAndInvertImage(A));
  }
}
