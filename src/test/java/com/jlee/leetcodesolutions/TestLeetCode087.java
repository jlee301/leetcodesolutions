package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode087;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode087 {
  @Test
  public void testProblemCase1() {
    String s1 = "great", s2 = "rgeat";
    LeetCode087 solution = new LeetCode087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase2() {
    String s1 = "abcde", s2 = "caebd";
    LeetCode087 solution = new LeetCode087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase3() {
    String s1 = "great", s2 = "rgtae";
    LeetCode087 solution = new LeetCode087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase4() {
    String s1 = "great", s2 = "rgate";
    LeetCode087 solution = new LeetCode087();
    Assert.assertTrue(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase5() {
    String s1 = "great", s2 = "garte";
    LeetCode087 solution = new LeetCode087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }

  @Test
  public void testProblemCase6() {
    String s1 = "great", s2 = "arteg";
    LeetCode087 solution = new LeetCode087();
    Assert.assertFalse(solution.isScramble(s1, s2));
  }
}
