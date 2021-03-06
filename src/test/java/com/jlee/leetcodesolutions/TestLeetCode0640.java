package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0640;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0640 {
  @Test
  public void testProblemCase1() {
    String equation = "x+5-3+x=6+x-2";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("x=2", solution.solveEquation(equation));
  }

  @Test
  public void testProblemCase2() {
    String equation = "x=x";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("Infinite solutions", solution.solveEquation(equation));
  }

  @Test
  public void testProblemCase3() {
    String equation = "2x=x";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("x=0", solution.solveEquation(equation));
  }

  @Test
  public void testProblemCase4() {
    String equation = "2x+3x-6x=x+2";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("x=-1", solution.solveEquation(equation));
  }

  @Test
  public void testProblemCase5() {
    String equation = "x=x+2";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("No solution", solution.solveEquation(equation));
  }

  @Test
  public void testWrongAns() {
    String equation = "-x=-1";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("x=1", solution.solveEquation(equation));
  }

  @Test
  public void testEmpty() {
    String equation = "";
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("No solution", solution.solveEquation(equation));
  }

  @Test
  public void testNull() {
    String equation = null;
    LeetCode0640 solution = new LeetCode0640();
    Assert.assertEquals("No solution", solution.solveEquation(equation));
  }
}
