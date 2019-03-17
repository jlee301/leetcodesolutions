package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0273;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0273 {
  @Test
  public void testProblemCase1() {
    int num = 123;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One Hundred Twenty Three", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase2() {
    int num = 12345;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Twelve Thousand Three Hundred Forty Five", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase3() {
    int num = 1234567;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase4() {
    int num = 1234567891;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase5() {
    int num = 0;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Zero", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase6() {
    int num = 1;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase7() {
    int num = 10;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Ten", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase8() {
    int num = 11;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Eleven", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase9() {
    int num = 19;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Nineteen", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase10() {
    int num = 20;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("Twenty", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase11() {
    int num = 100000;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One Hundred Thousand", solution.numberToWords(num));
  }

  @Test
  public void testProblemCase12() {
    int num = 1000000;
    LeetCode0273 solution = new LeetCode0273();
    Assert.assertEquals("One Million", solution.numberToWords(num));
  }
}
