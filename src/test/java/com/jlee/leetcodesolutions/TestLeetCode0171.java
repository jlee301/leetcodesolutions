package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0171;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0171 {
  @Test
  public void testProblemCase1() {
    LeetCode0171 solution = new LeetCode0171();
    Assert.assertEquals(1, solution.titleToNumber("A"));
    Assert.assertEquals(2, solution.titleToNumber("B"));
    Assert.assertEquals(3, solution.titleToNumber("C"));
    Assert.assertEquals(4, solution.titleToNumber("D"));
    Assert.assertEquals(5, solution.titleToNumber("E"));
    Assert.assertEquals(6, solution.titleToNumber("F"));
    Assert.assertEquals(7, solution.titleToNumber("G"));
    Assert.assertEquals(8, solution.titleToNumber("H"));
    Assert.assertEquals(9, solution.titleToNumber("I"));
    Assert.assertEquals(10, solution.titleToNumber("J"));
    Assert.assertEquals(11, solution.titleToNumber("K"));
    Assert.assertEquals(12, solution.titleToNumber("L"));
    Assert.assertEquals(13, solution.titleToNumber("M"));
    Assert.assertEquals(14, solution.titleToNumber("N"));
    Assert.assertEquals(15, solution.titleToNumber("O"));
    Assert.assertEquals(16, solution.titleToNumber("P"));
    Assert.assertEquals(17, solution.titleToNumber("Q"));
    Assert.assertEquals(18, solution.titleToNumber("R"));
    Assert.assertEquals(19, solution.titleToNumber("S"));
    Assert.assertEquals(20, solution.titleToNumber("T"));
    Assert.assertEquals(21, solution.titleToNumber("U"));
    Assert.assertEquals(22, solution.titleToNumber("V"));
    Assert.assertEquals(23, solution.titleToNumber("W"));
    Assert.assertEquals(24, solution.titleToNumber("X"));
    Assert.assertEquals(25, solution.titleToNumber("Y"));
    Assert.assertEquals(26, solution.titleToNumber("Z"));
  }

  @Test
  public void testProblemCase2() {
    LeetCode0171 solution = new LeetCode0171();
    Assert.assertEquals(27, solution.titleToNumber("AA"));
    Assert.assertEquals(28, solution.titleToNumber("AB"));
    Assert.assertEquals(52, solution.titleToNumber("AZ"));
    Assert.assertEquals(53, solution.titleToNumber("BA"));
    Assert.assertEquals(54, solution.titleToNumber("BB"));
    Assert.assertEquals(702, solution.titleToNumber("ZZ"));
    Assert.assertEquals(703, solution.titleToNumber("AAA"));
    Assert.assertEquals(704, solution.titleToNumber("AAB"));
    Assert.assertEquals(1406, solution.titleToNumber("BBB"));
    Assert.assertEquals(1407, solution.titleToNumber("BBC"));
    Assert.assertEquals(18278, solution.titleToNumber("ZZZ"));
    Assert.assertEquals(18279, solution.titleToNumber("AAAA"));
    Assert.assertEquals(18280, solution.titleToNumber("AAAB"));
  }

  @Test
  public void testProblemCase3() {
    LeetCode0171 solution = new LeetCode0171();
    Assert.assertEquals(0, solution.titleToNumber(""));
  }
}
