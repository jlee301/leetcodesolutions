package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode972;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode972 {
  @Test
  public void testProblemCase1() {
    String S = "0.(52)", T = "0.5(25)";
    LeetCode972 solution = new LeetCode972();
    Assert.assertTrue(solution.isRationalEqual(S, T));
  }

  @Test
  public void testProblemCase2() {
    String S = "0.1666(6)", T = "0.166(66)";
    LeetCode972 solution = new LeetCode972();
    Assert.assertTrue(solution.isRationalEqual(S, T));
  }

  @Test
  public void testProblemCase3() {
    String S = "0.9(9)", T = "1.";
    LeetCode972 solution = new LeetCode972();
    Assert.assertTrue(solution.isRationalEqual(S, T));
  }

  @Test
  public void testProblemCase4() {
    String S = "0.001(9)", T = "0.002";
    LeetCode972 solution = new LeetCode972();
    Assert.assertTrue(solution.isRationalEqual(S, T));
  }

  @Test
  public void testProblemCase5() {
    String S = "1.0", T = "2.0";
    LeetCode972 solution = new LeetCode972();
    Assert.assertFalse(solution.isRationalEqual(S, T));
  }
}
