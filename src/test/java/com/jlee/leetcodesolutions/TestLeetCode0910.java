package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0910;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0910 {
  @Test
  public void testProblemCase1() {
    int[] A = {1};
    int K = 0;
    LeetCode0910 solution = new LeetCode0910();
    Assert.assertEquals(0, solution.smallestRangeII(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {0,10};
    int K = 2;
    LeetCode0910 solution = new LeetCode0910();
    Assert.assertEquals(6, solution.smallestRangeII(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,3,6};
    int K = 3;
    LeetCode0910 solution = new LeetCode0910();
    Assert.assertEquals(3, solution.smallestRangeII(A, K));
  }
  
  @Test
  public void testProblemCase4() {
    int[] A = {7,8,8};
    int K = 5;
    LeetCode0910 solution = new LeetCode0910();
    Assert.assertEquals(1, solution.smallestRangeII(A, K));
  }
}
