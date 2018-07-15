package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode869;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode869 {
  @Test
  public void testProblemCase1() {
    int N = 1;
    LeetCode869 solution = new LeetCode869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 10;
    LeetCode869 solution = new LeetCode869();
    Assert.assertFalse(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 16;
    LeetCode869 solution = new LeetCode869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 24;
    LeetCode869 solution = new LeetCode869();
    Assert.assertFalse(solution.reorderedPowerOf2(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 46;
    LeetCode869 solution = new LeetCode869();
    Assert.assertTrue(solution.reorderedPowerOf2(N));
  }
}
