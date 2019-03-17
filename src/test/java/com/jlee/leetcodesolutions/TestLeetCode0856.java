package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0856;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0856 {
  @Test
  public void testProblemCase1() {
    String S = "()";
    LeetCode0856 solution = new LeetCode0856();
    Assert.assertEquals(1, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "(())";
    LeetCode0856 solution = new LeetCode0856();
    Assert.assertEquals(2, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "()()";
    LeetCode0856 solution = new LeetCode0856();
    Assert.assertEquals(2, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "(()(()))";
    LeetCode0856 solution = new LeetCode0856();
    Assert.assertEquals(6, solution.scoreOfParentheses(S));
  }
}
