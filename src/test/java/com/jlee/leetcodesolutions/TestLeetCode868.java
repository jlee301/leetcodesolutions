package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode868;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode868 {
  @Test
  public void testProblemCase1() {
    // Input: [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[1,4,7],[2,5,8],[3,6,9]]
    int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
    LeetCode868 solution = new LeetCode868();
    Assert.assertArrayEquals(new int[][] {{1,4,7},{2,5,8},{3,6,9}}, solution.transpose(A));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1,2,3],[4,5,6]]
    // Output: [[1,4],[2,5],[3,6]]
    int[][] A = {{1,2,3},{4,5,6}};
    LeetCode868 solution = new LeetCode868();
    Assert.assertArrayEquals(new int[][] {{1,4},{2,5},{3,6}}, solution.transpose(A));
  }
}
