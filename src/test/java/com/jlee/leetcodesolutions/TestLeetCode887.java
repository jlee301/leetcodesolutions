package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode887;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode887 {
  @Test
  public void testProblemCase1() {
    // Input: K = 1, N = 2
    // Output: 2
    int K = 1, N = 2;
    LeetCode887 solution = new LeetCode887();
    Assert.assertEquals(2, solution.superEggDrop(K, N));
  }

  @Test
  public void testProblemCase2() {
    // Input: K = 2, N = 6
    // Output: 3
    int K = 2, N = 6;
    LeetCode887 solution = new LeetCode887();
    Assert.assertEquals(3, solution.superEggDrop(K, N));
  }

  @Test
  public void testProblemCase3() {
    // Input: K = 3, N = 14
    // Output: 4
    int K = 3, N = 14;
    LeetCode887 solution = new LeetCode887();
    Assert.assertEquals(4, solution.superEggDrop(K, N));
  }

  @Test
  public void testProblemCase4() {
    // Input: K = 100, N = 10000
    // Output: 14
    int K = 100, N = 10000;
    LeetCode887 solution = new LeetCode887();
    Assert.assertEquals(14, solution.superEggDrop(K, N));
  }
}
