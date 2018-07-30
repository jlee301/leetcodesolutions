package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode878;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode878 {
  @Test
  public void testProblemCase1() {
    // Input: N = 1, A = 2, B = 3
    // Output: 2
    int N = 1, A = 2, B = 3;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(2, solution.nthMagicalNumber(N, A, B));
  }

  @Test
  public void testProblemCase2() {
    // Input: N = 4, A = 2, B = 3
    // Output: 6
    int N = 4, A = 2, B = 3;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(6, solution.nthMagicalNumber(N, A, B));
  }

  @Test
  public void testProblemCase3() {
    // Input: N = 5, A = 2, B = 4
    // Output: 10
    int N = 5, A = 2, B = 4;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(10, solution.nthMagicalNumber(N, A, B));
  }

  @Test
  public void testProblemCase4() {
    // Input: N = 3, A = 6, B = 4
    // Output: 8
    int N = 3, A = 6, B = 4;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(8, solution.nthMagicalNumber(N, A, B));
  }

  @Test
  public void testProblemCase5() {
    // Input: N = 1000000000, A = 40000, B = 40000
    // Output: 999720007
    int N = 1000000000, A = 40000, B = 40000;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(999720007, solution.nthMagicalNumber(N, A, B));
  }

  @Test
  public void testProblemCase6() {
    // Input: N = 887859796, A = 29911, B = 37516
    // Output: 257511204
    int N = 887859796, A = 29911, B = 37516;
    LeetCode878 solution = new LeetCode878();
    Assert.assertEquals(257511204, solution.nthMagicalNumber(N, A, B));
  }
}
