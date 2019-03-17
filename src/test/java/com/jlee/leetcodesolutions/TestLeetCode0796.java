package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0796;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0796 {
  @Test
  public void testProblemCase1() {
    String A = "abcde", B = "cdeab";
    LeetCode0796 solution = new LeetCode0796();
    Assert.assertTrue(solution.rotateString(A, B));
  }

  @Test
  public void testProblemCase2() {
    String A = "abcde", B = "abced";
    LeetCode0796 solution = new LeetCode0796();
    Assert.assertFalse(solution.rotateString(A, B));
  }

  @Test
  public void testEmpty() {
    String A = "", B = "";
    LeetCode0796 solution = new LeetCode0796();
    Assert.assertTrue(solution.rotateString(A, B));
  }

  @Test
  public void testANull() {
    String A = null, B = "abced";
    LeetCode0796 solution = new LeetCode0796();
    Assert.assertFalse(solution.rotateString(A, B));
  }

  @Test
  public void testBNull() {
    String A = "abced", B = null;
    LeetCode0796 solution = new LeetCode0796();
    Assert.assertFalse(solution.rotateString(A, B));
  }
}
