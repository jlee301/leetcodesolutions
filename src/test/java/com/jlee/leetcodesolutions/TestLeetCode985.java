package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode985;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode985 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,3,4};
    int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
    LeetCode985 solution = new LeetCode985();
    Assert.assertArrayEquals(new int[] {8,6,2,4}, solution.sumEvenAfterQueries(A, queries));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1};
    int[][] queries = {{2,0}};
    LeetCode985 solution = new LeetCode985();
    Assert.assertArrayEquals(new int[] {0}, solution.sumEvenAfterQueries(A, queries));
  }
}
