package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1021;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1021 {
  @Test
  public void testProblemCase1() {
    String S = "(()())(())";
    LeetCode1021 solution = new LeetCode1021();
    Assert.assertEquals("()()()", solution.removeOuterParentheses(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "(()())(())(()(()))";
    LeetCode1021 solution = new LeetCode1021();
    Assert.assertEquals("()()()()(())", solution.removeOuterParentheses(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "()()";
    LeetCode1021 solution = new LeetCode1021();
    Assert.assertEquals("", solution.removeOuterParentheses(S));
  }
}
