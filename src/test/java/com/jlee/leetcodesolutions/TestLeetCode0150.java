package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0150;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0150 {
  @Test
  public void testBasicPlus() {
    String tokens[] = {"1","2","+"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(3, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicMinus() {
    String tokens[] = {"1","2","-"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(-1, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicMulti() {
    String tokens[] = {"2","2","*"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(4, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicDivide() {
    String tokens[] = {"10","2","/"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(5, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicMultipleOperators1() {
    String tokens[] = {"1","10","+","2","*"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(22, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicMultipleOperators2() {
    String tokens[] = {"2","1","10","+","*"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(22, solution.evalRPN(tokens));
  }

  @Test
  public void testBasicMultipleOperators3() {
    String tokens[] = {"2","1","10","*","+"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(12, solution.evalRPN(tokens));
  }

  @Test
  public void testJustOneNumber() {
    String tokens[] = {"2"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(2, solution.evalRPN(tokens));
  }

  @Test
  public void testDividing0() {
    String tokens[] = {"0","3","/"};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(0, solution.evalRPN(tokens));
  }

  @Test
  public void testEmpty() {
    String tokens[] = {};
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(0, solution.evalRPN(tokens));
  }

  @Test
  public void testNull() {
    String tokens[] = null;
    LeetCode0150 solution = new LeetCode0150();
    Assert.assertEquals(0, solution.evalRPN(tokens));
  }
}
