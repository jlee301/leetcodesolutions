package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0423;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0423 {
  @Test
  public void testProblemCase1() {
    String s = "owoztneoer";
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("012", solution.originalDigits(s));
  }

  @Test
  public void testProblemCase2() {
    String s = "fviefuro";
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("45", solution.originalDigits(s));
  }

  @Test
  public void testAllNumbers() {
    String s = "nineeightsevensixfivefourthreetwoonezero";
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("0123456789", solution.originalDigits(s));
  }

  @Test
  public void testAllNumbersRepeatedTwice() {
    String s = "nineeightsevensixfivefourthreetwoonezerozeroonetwothreefourfivesixseveneightnine";
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("00112233445566778899", solution.originalDigits(s));
  }

  @Test
  public void testEmpty() {
    String s = "";
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("", solution.originalDigits(s));
  }

  @Test
  public void testNull() {
    String s = null;
    LeetCode0423 solution = new LeetCode0423();
    Assert.assertEquals("", solution.originalDigits(s));
  }
}
