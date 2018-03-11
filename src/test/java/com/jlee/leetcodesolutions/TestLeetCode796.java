package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode796;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode796 {
  @Test
  public void testProblemCase1() {
    String A = "abcde", B = "cdeab";
    LeetCode796 solution = new LeetCode796();
    Assert.assertTrue(solution.rotateString(A, B));
  }

  @Test
  public void testProblemCase2() {
    String A = "abcde", B = "abced";
    LeetCode796 solution = new LeetCode796();
    Assert.assertFalse(solution.rotateString(A, B));
  }

  @Test
  public void testEmpty() {
    String A = "", B = "";
    LeetCode796 solution = new LeetCode796();
    Assert.assertTrue(solution.rotateString(A, B));
  }

  @Test
  public void testANull() {
    String A = null, B = "abced";
    LeetCode796 solution = new LeetCode796();
    Assert.assertFalse(solution.rotateString(A, B));
  }

  @Test
  public void testBNull() {
    String A = "abced", B = null;
    LeetCode796 solution = new LeetCode796();
    Assert.assertFalse(solution.rotateString(A, B));
  }
}
