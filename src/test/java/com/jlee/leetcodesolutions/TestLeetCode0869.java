package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0869;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0869 {
  @Test
  public void testProblemCase1() {
    int N = 1;
    LeetCode0869 solution = new LeetCode0869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 10;
    LeetCode0869 solution = new LeetCode0869();
    Assert.assertFalse(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 16;
    LeetCode0869 solution = new LeetCode0869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 24;
    LeetCode0869 solution = new LeetCode0869();
    Assert.assertFalse(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 46;
    LeetCode0869 solution = new LeetCode0869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }
}
