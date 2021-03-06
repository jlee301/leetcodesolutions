package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0013;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0013 {

  @Test
  public void testProblemCase1() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("I");
    Assert.assertEquals(1, result);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("II");
    Assert.assertEquals(2, result);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("III");
    Assert.assertEquals(3, result);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("IV");
    Assert.assertEquals(4, result);
  }

  @Test
  public void testProblemCase5() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("V");
    Assert.assertEquals(5, result);
  }

  @Test
  public void testProblemCase6() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("VI");
    Assert.assertEquals(6, result);
  }

  @Test
  public void testProblemCase7() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("VII");
    Assert.assertEquals(7, result);
  }

  @Test
  public void testProblemCase8() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("VIII");
    Assert.assertEquals(8, result);
  }

  @Test
  public void testProblemCase9() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("IX");
    Assert.assertEquals(9, result);
  }

  @Test
  public void testProblemCase10() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("X");
    Assert.assertEquals(10, result);
  }

  @Test
  public void testProblemCase11() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("XLIX");
    Assert.assertEquals(49, result);
  }

  @Test
  public void testProblemCase12() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("L");
    Assert.assertEquals(50, result);
  }

  @Test
  public void testProblemCase13() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("XCIX");
    Assert.assertEquals(99, result);
  }

  @Test
  public void testProblemCase14() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("C");
    Assert.assertEquals(100, result);
  }

  @Test
  public void testProblemCase15() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("CDXCIX");
    Assert.assertEquals(499, result);
  }

  @Test
  public void testProblemCase16() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("D");
    Assert.assertEquals(500, result);
  }

  @Test
  public void testProblemCase17() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("CMXCIX");
    Assert.assertEquals(999, result);
  }

  @Test
  public void testProblemCase18() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("M");
    Assert.assertEquals(1000, result);
  }

  @Test
  public void testProblemCase19() {
    LeetCode0013 solution = new LeetCode0013();
    int result = solution.romanToInt("MMMCMXCIX");
    Assert.assertEquals(3999, result);
  }
}
