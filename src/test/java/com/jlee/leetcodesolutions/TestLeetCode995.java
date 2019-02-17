package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode995;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode995 {
  @Test
  public void testProblemCase1() {
    int[] A = {0,1,0};
    int K = 1;
    LeetCode995 solution = new LeetCode995();
    Assert.assertEquals(2, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,0};
    int K = 2;
    LeetCode995 solution = new LeetCode995();
    Assert.assertEquals(-1, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {0,0,0,1,0,1,1,0};
    int K = 3;
    LeetCode995 solution = new LeetCode995();
    Assert.assertEquals(3, solution.minKBitFlips(A, K));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {0,0,0,1,0,1,1,0};
    int K = 2;
    LeetCode995 solution = new LeetCode995();
    Assert.assertEquals(-1, solution.minKBitFlips(A, K));
  }
}
