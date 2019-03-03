package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1004;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1004 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,1,1,0,0,0,1,1,1,1,0};
    int K = 2;
    LeetCode1004 solution = new LeetCode1004();
    Assert.assertEquals(6, solution.longestOnes(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int K = 3;
    LeetCode1004 solution = new LeetCode1004();
    Assert.assertEquals(10, solution.longestOnes(A, K));
  }
}
