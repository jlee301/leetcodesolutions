package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0065;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0065 {
  @Test
  public void testProblemCase1() {
    String s = "0";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase2() {
    String s = " 0.1 ";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "abc";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "1 a";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "2e10";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase6() {
    String s = " -90e3   ";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase7() {
    String s = " 1e";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "e3";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase9() {
    String s = " 6e-1";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase10() {
    String s = " 99e2.5 ";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase11() {
    String s = "53.5e93";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }

  @Test
  public void testProblemCase12() {
    String s = " --6 ";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase13() {
    String s = "-+3";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase14() {
    String s = "95a54e53";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }
  
  @Test
  public void testProblemCase15() {
    String s = " 6e-+1";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase16() {
    String s = ".6.e1";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }

  @Test
  public void testProblemCase17() {
    String s = "+5e+1";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }
  
  @Test
  public void testProblemCase18() {
    String s = "-5e-1";
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertTrue(solution.isNumber(s));
  }
  
  @Test
  public void testProblemCase19() {
    String s = null;
    LeetCode0065 solution = new LeetCode0065();
    Assert.assertFalse(solution.isNumber(s));
  }
}
