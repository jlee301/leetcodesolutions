package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1106;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1106 {
  @Test
  public void testProblemCase1() {
    String expression = "!(f)";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertTrue(solution.parseBoolExpr(expression));
  }

  @Test
  public void testProblemCase2() {
    String expression = "|(f,t)";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertTrue(solution.parseBoolExpr(expression));
  }

  @Test
  public void testProblemCase3() {
    String expression = "&(t,f)";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertFalse(solution.parseBoolExpr(expression));
  }

  @Test
  public void testProblemCase4() {
    String expression = "|(&(t,f,t),!(t))";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertFalse(solution.parseBoolExpr(expression));
  }

  @Test
  public void testProblemCase5() {
    String expression = "t";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertTrue(solution.parseBoolExpr(expression));
  }

  @Test
  public void testProblemCase6() {
    String expression = "f";
    LeetCode1106 solution = new LeetCode1106();
    Assert.assertFalse(solution.parseBoolExpr(expression));
  }
}
