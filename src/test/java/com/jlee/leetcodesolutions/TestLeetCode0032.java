package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0032;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0032 {
  @Test
  public void testProblemCase1() {
    String s = "(()";
    LeetCode0032 solution = new LeetCode0032();
    Assert.assertEquals(2, solution.longestValidParentheses(s));
  }

  @Test
  public void testProblemCase2() {
    String s = ")()())";
    LeetCode0032 solution = new LeetCode0032();
    Assert.assertEquals(4, solution.longestValidParentheses(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "()()";
    LeetCode0032 solution = new LeetCode0032();
    Assert.assertEquals(4, solution.longestValidParentheses(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "";
    LeetCode0032 solution = new LeetCode0032();
    Assert.assertEquals(0, solution.longestValidParentheses(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "((((";
    LeetCode0032 solution = new LeetCode0032();
    Assert.assertEquals(0, solution.longestValidParentheses(s));
  }
}
