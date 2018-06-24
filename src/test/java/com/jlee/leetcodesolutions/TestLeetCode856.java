package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode856;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode856 {
  @Test
  public void testProblemCase1() {
    String S = "()";
    LeetCode856 solution = new LeetCode856();
    Assert.assertEquals(1, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase2() {
    String S = "(())";
    LeetCode856 solution = new LeetCode856();
    Assert.assertEquals(2, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase3() {
    String S = "()()";
    LeetCode856 solution = new LeetCode856();
    Assert.assertEquals(2, solution.scoreOfParentheses(S));
  }

  @Test
  public void testProblemCase4() {
    String S = "(()(()))";
    LeetCode856 solution = new LeetCode856();
    Assert.assertEquals(6, solution.scoreOfParentheses(S));
  }
}
