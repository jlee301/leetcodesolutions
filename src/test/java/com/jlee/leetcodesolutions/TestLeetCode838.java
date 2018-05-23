package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode838;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode838 {
  @Test
  public void testProblemCase1() {
    String dominoes = ".L.R...LR..L..";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("LL.RR.LLRRLL..", solution.pushDominoes(dominoes));
  }

  @Test
  public void testProblemCase2() {
    String dominoes = "RR.L";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("RR.L", solution.pushDominoes(dominoes));
  }

  @Test
  public void testProblemCase1Too() {
    String dominoes = ".L.R...LR..L..";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("LL.RR.LLRRLL..", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testProblemCase2Too() {
    String dominoes = "RR.L";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("RR.L", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testNoDominoes() {
    String dominoes = ".";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals(".", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testFallsRightToNothing() {
    String dominoes = ".R";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals(".R", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testFallsRightToDominoes() {
    String dominoes = "R.";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("RR", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testEqualDist() {
    String dominoes = "R.L";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("R.L", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testEqualDistLeft() {
    String dominoes = "L.L";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("LLL", solution.pushDominoesToo(dominoes));
  }

  @Test
  public void testEqualDistRight() {
    String dominoes = "R.R";
    LeetCode838 solution = new LeetCode838();
    Assert.assertEquals("RRR", solution.pushDominoesToo(dominoes));
  }
}
