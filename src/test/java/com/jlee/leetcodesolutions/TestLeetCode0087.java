package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0087;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0087 {
  @Test
  public void testProblemCase1() {
    String s1 = "great", s2 = "rgeat";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase2() {
    String s1 = "abcde", s2 = "caebd";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase3() {
    String s1 = "great", s2 = "rgtae";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase4() {
    String s1 = "great", s2 = "rgate";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase5() {
    String s1 = "great", s2 = "garte";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase6() {
    String s1 = "great", s2 = "arteg";
    LeetCode0087 solution = new LeetCode0087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }
}
