package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1025;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1025 {
  @Test
  public void testProblemCase1() {
    int N = 2;
    LeetCode1025 solution = new LeetCode1025();
    Assert.assertTrue(solution.divisorGame(N));
  }
  
  @Test
  public void testProblemCase2() {
    int N = 3;
    LeetCode1025 solution = new LeetCode1025();
    Assert.assertFalse(solution.divisorGame(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 1;
    LeetCode1025 solution = new LeetCode1025();
    Assert.assertFalse(solution.divisorGame(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 21;
    LeetCode1025 solution = new LeetCode1025();
    Assert.assertFalse(solution.divisorGame(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 22;
    LeetCode1025 solution = new LeetCode1025();
    Assert.assertTrue(solution.divisorGame(N));
  }
}
