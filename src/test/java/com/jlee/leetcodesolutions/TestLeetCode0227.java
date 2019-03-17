package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0227;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0227 {
  @Test
  public void testProblemCase1() {
    String s = "3+2*2";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(7, solution.calculate(s));
  }

  @Test
  public void testProblemCase2() {
    String s = " 3/2 ";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testProblemCase3() {
    String s = " 3+5 / 2 ";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(5, solution.calculate(s));
  }

  @Test
  public void testSingleDigit() {
    String s = "3";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(3, solution.calculate(s));
  }

  @Test
  public void testAdd() {
    String s = "3+2";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(5, solution.calculate(s));
  }

  @Test
  public void testSub() {
    String s = "3-2";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testMul() {
    String s = "3*2";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(6, solution.calculate(s));
  }

  @Test
  public void testDiv() {
    String s = "3/2";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(1, solution.calculate(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(0, solution.calculate(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0227 solution = new LeetCode0227();
    Assert.assertEquals(0, solution.calculate(s));
  }
}
