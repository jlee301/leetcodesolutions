package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1003;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1003 {
  @Test
  public void testProblemCase1() {
    String S = "aabcbc";
    LeetCode1003 solution = new LeetCode1003();
    Assert.assertTrue(solution.isValid(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "abcabcababcc";
    LeetCode1003 solution = new LeetCode1003();
    Assert.assertTrue(solution.isValid(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "abccba";
    LeetCode1003 solution = new LeetCode1003();
    Assert.assertFalse(solution.isValid(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "cababc";
    LeetCode1003 solution = new LeetCode1003();
    Assert.assertFalse(solution.isValid(S));
  }
}
