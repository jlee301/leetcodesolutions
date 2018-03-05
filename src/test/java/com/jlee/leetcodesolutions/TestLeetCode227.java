package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode227;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode227 {
  @Test
  public void testProblemCase1() {
    String s = "3+2*2";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(7, solution.calculate(s));
  }

  @Test
  public void testProblemCase2() {
    String s = " 3/2 ";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testProblemCase3() {
    String s = " 3+5 / 2 ";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(5, solution.calculate(s));
  }

  @Test
  public void testSingleDigit() {
    String s = "3";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(3, solution.calculate(s));
  }

  @Test
  public void testAdd() {
    String s = "3+2";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(5, solution.calculate(s));
  }

  @Test
  public void testSub() {
    String s = "3-2";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testMul() {
    String s = "3*2";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(6, solution.calculate(s));
  }

  @Test
  public void testDiv() {
    String s = "3/2";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(0, solution.calculate(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode227 solution = new LeetCode227();
    Assert.assertEquals(0, solution.calculate(s));
  }
}
