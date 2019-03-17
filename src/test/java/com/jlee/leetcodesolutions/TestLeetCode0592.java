package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0592;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0592 {
  @Test
  public void testProblemCase1() {
    String expression = "-1/2+1/2";
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertEquals("0/1", solution.fractionAddition(expression));
  }

  @Test
  public void testProblemCase2() {
    String expression = "-1/2+1/2+1/3";
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertEquals("1/3", solution.fractionAddition(expression));
  }

  @Test
  public void testProblemCase3() {
    String expression = "1/3-1/2";
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertEquals("-1/6", solution.fractionAddition(expression));
  }

  @Test
  public void testProblemCase4() {
    String expression = "5/3+1/3";
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertEquals("2/1", solution.fractionAddition(expression));
  }

  @Test
  public void testEmpty() {
    String expression = "";
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertEquals("", solution.fractionAddition(expression));
  }

  @Test
  public void testNull() {
    String expression = null;
    LeetCode0592 solution = new LeetCode0592();
    Assert.assertNull(solution.fractionAddition(expression));
  }
}
