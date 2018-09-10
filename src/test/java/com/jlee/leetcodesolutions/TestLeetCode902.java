package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode902;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode902 {
  @Test
  public void testProblemCase1() {
    String[] D = {"1","3","5","7"};
    int N = 100;
    LeetCode902 solution = new LeetCode902();
    Assert.assertEquals(20, solution.atMostNGivenDigitSet(D, N));
  }

  @Test
  public void testProblemCase2() {
    String[] D = {"1","4","9"};
    int N = 1000000000;
    LeetCode902 solution = new LeetCode902();
    Assert.assertEquals(29523, solution.atMostNGivenDigitSet(D, N));
  }

  @Test
  public void testProblemCase3() {
    String[] D = {"1","2","3","4","5","6","7","8","9"};
    int N = 2345;
    LeetCode902 solution = new LeetCode902();
    Assert.assertEquals(1742, solution.atMostNGivenDigitSet(D, N));
  }
}
