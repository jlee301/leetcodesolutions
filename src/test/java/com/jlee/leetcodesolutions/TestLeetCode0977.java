package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0977;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0977 {
  @Test
  public void testProblemCase1() {
    int[] A = {-4,-1,0,3,10};
    LeetCode0977 solution = new LeetCode0977();
    Assert.assertArrayEquals(new int[] {0,1,9,16,100}, solution.sortedSquares(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {-7,-3,2,3,11};
    LeetCode0977 solution = new LeetCode0977();
    Assert.assertArrayEquals(new int[] {4,9,9,49,121}, solution.sortedSquares(A));
  }
}
