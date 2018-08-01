package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode881;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode881 {
  @Test
  public void testProblemCase1() {
    LeetCode881 solution = new LeetCode881(2,3);
    boolean[][] result = new boolean[2][3];
    for(int i = 0; i < 6; i++) {
      int[] data = solution.flip();
      result[data[0]][data[1]] = true;
    }
    for(int r = 0; r < 2; r++) {
      for(int c = 0; c < 3; c++) {
        Assert.assertTrue(result[r][c]);
      }
    }
    solution.reset();
    result = new boolean[2][3];
    for(int i = 0; i < 6; i++) {
      int[] data = solution.flip();
      result[data[0]][data[1]] = true;
    }
    for(int r = 0; r < 2; r++) {
      for(int c = 0; c < 3; c++) {
        Assert.assertTrue(result[r][c]);
      }
    }
  }
}
