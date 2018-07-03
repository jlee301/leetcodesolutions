package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode862;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode862 {
  @Test
  public void testProblemCase1() {
    // Input: A = [1], K = 1
    // Output: 1
    int[] A = {1};
    int K = 1;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(1, solution.shortestSubarray(A, K));
  }

  @Test
  public void testProblemCase2() {
    // Input: A = [1,2], K = 4
    // Output: -1
    int[] A = {1,2};
    int K = 4;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(-1, solution.shortestSubarray(A, K));
  }

  @Test
  public void testProblemCase3() {
    // Input: A = [2,-1,2], K = 3
    // Output: 3
    int[] A = {2,-1,2};
    int K = 3;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(3, solution.shortestSubarray(A, K));
  }

  @Test
  public void testProblemCase4() {
    // Input: A = [48,99,37,4,-31], K = 140
    // Output: 2
    int[] A = {48,99,37,4,-31};
    int K = 140;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(2, solution.shortestSubarray(A, K));
  }

  @Test
  public void testProblemCase5() {
    int[] A = { 86396, 74204, 24861, 72405, 30809, 40710, 47892, -48882, -9084, 59464, 29389, 1510, 16521, 38996, 98830,
        15183, 38241, 90465, -10717, 81061, -40387, -23424, 74146, -24051, 56847, 44278, 41403, -763, 50836, 6482,
        44225, 16178, -48529, -36193, 28857, -16654, 48188, 54971, -29822, 25959, 90144, -23182, -9464, 65609, 99248,
        -26248, 47993, -20085, 75072, 70400 };
    int K = 209110;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(4, solution.shortestSubarray(A, K));
  }

  @Test
  public void testProblemCase6() {
    int[] A = { 84,-37,32,40,95 };
    int K = 167;
    LeetCode862 solution = new LeetCode862();
    Assert.assertEquals(3, solution.shortestSubarray(A, K));
  }
}
