package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0995;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0995 {
  @Test
  public void testProblemCase1() {
    int[] A = {0,1,0};
    int K = 1;
    LeetCode0995 solution = new LeetCode0995();
    Assert.assertEquals(2, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,0};
    int K = 2;
    LeetCode0995 solution = new LeetCode0995();
    Assert.assertEquals(-1, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {0,0,0,1,0,1,1,0};
    int K = 3;
    LeetCode0995 solution = new LeetCode0995();
    Assert.assertEquals(3, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {0,0,0,1,0,1,1,0};
    int K = 2;
    LeetCode0995 solution = new LeetCode0995();
    Assert.assertEquals(-1, solution.minKBitFlips(A, K));
  }
}
