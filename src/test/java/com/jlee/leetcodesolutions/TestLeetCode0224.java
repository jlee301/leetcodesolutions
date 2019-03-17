package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0224;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0224 {
  @Test
  public void testProblemCase1() {
    String s = "1 + 1";
    LeetCode0224 solution = new LeetCode0224();
    Assert.assertEquals(2, solution.calculate(s));
  }

  @Test
  public void testProblemCase2() {
    String s = " 2-1 + 2 ";
    LeetCode0224 solution = new LeetCode0224();
    Assert.assertEquals(3, solution.calculate(s));
  }

  @Test
  public void testProblemCase3() {
    String s = "(1+(4+5+2)-3)+(6+8)";
    LeetCode0224 solution = new LeetCode0224();
    Assert.assertEquals(23, solution.calculate(s));
  }
}
