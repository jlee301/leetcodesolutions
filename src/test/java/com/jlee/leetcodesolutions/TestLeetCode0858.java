package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0858;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0858 {
  @Test
  public void testProblemCase1() {
    int p = 2, q = 1;
    LeetCode0858 solution = new LeetCode0858();
    Assert.assertEquals(2, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase2() {
    int p = 5, q = 2;
    LeetCode0858 solution = new LeetCode0858();
    Assert.assertEquals(0, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase3() {
    int p = 2, q = 2;
    LeetCode0858 solution = new LeetCode0858();
    Assert.assertEquals(1, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase4() {
    int p = 5, q = 4;
    LeetCode0858 solution = new LeetCode0858();
    Assert.assertEquals(0, solution.mirrorReflection(p, q));
  }
}
