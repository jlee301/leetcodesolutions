package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0639;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0639 {
  @Test
  public void testProblemCase1() {
    String s = "*";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(9, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "1*";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(18, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "2*";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(15, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase4() {
    String s = "**";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(96, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase5() {
    String s = "10*";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(9, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase6() {
    String s = "11";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(2, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase7() {
    String s = "26";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(2, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase8() {
    String s = "27";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(1, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase9() {
    String s = "*6";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(11, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase10() {
    String s = "*7";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(10, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase11() {
    String s = "0";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(0, solution.numDecodings(s));
  }

  @Test
  public void testProblemCase12() {
    String s = "**********1111111111";
    LeetCode0639 solution = new LeetCode0639();
    Assert.assertEquals(133236775, solution.numDecodings(s));
  }
}
