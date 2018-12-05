package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode258;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode258 {
  @Test
  public void testProblemCase1() {
    int num = 38;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(2, solution.addDigits(num));
  }

  @Test
  public void testProblemCase2() {
    int num = 99;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(9, solution.addDigits(num));
  }

  @Test
  public void testProblemCase3() {
    int num = 8;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(8, solution.addDigits(num));
  }

  @Test
  public void testProblemCase4() {
    int num = 0;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(0, solution.addDigits(num));
  }

  @Test
  public void testProblemCase5() {
    int num = -10;
    LeetCode258 solution = new LeetCode258();
    Assert.assertEquals(-10, solution.addDigits(num));
  }
}
