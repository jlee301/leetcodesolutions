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
}
