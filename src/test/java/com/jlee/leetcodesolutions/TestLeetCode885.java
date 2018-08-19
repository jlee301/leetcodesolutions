package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode885;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode885 {
  @Test
  public void testProblemCase1() {
    // Input: R = 1, C = 4, r0 = 0, c0 = 0
    // Output: [[0,0],[0,1],[0,2],[0,3]]
    int R = 1, C = 4, r0 = 0, c0 = 0;
    LeetCode885 solution = new LeetCode885();
    Assert.assertArrayEquals(new int[][] {{0,0},{0,1},{0,2},{0,3}}, solution.spiralMatrixIII(R, C, r0, c0));
  }

  @Test
  public void testProblemCase2() {
    // Input: R = 5, C = 6, r0 = 1, c0 = 4
    // Output: [[1,4],[1,5],[2,5],[2,4],[2,3],[1,3],[0,3],[0,4],[0,5],[3,5],[3,4],[3,3],[3,2],[2,2],[1,2],[0,2],[4,5],[4,4],[4,3],[4,2],[4,1],[3,1],[2,1],[1,1],[0,1],[4,0],[3,0],[2,0],[1,0],[0,0]]
    int R = 5, C = 6, r0 = 1, c0 = 4;
    LeetCode885 solution = new LeetCode885();
    Assert.assertArrayEquals(new int[][] { { 1, 4 }, { 1, 5 }, { 2, 5 }, { 2, 4 }, { 2, 3 }, { 1, 3 }, { 0, 3 },
        { 0, 4 }, { 0, 5 }, { 3, 5 }, { 3, 4 }, { 3, 3 }, { 3, 2 }, { 2, 2 }, { 1, 2 }, { 0, 2 }, { 4, 5 }, { 4, 4 },
        { 4, 3 }, { 4, 2 }, { 4, 1 }, { 3, 1 }, { 2, 1 }, { 1, 1 }, { 0, 1 }, { 4, 0 }, { 3, 0 }, { 2, 0 }, { 1, 0 },
        { 0, 0 } }, solution.spiralMatrixIII(R, C, r0, c0));
  }
}
