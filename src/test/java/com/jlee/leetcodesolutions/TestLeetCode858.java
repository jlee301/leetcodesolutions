package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode858;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode858 {
  @Test
  public void testProblemCase1() {
    int p = 2, q = 1;
    LeetCode858 solution = new LeetCode858();
    Assert.assertEquals(2, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase2() {
    int p = 5, q = 2;
    LeetCode858 solution = new LeetCode858();
    Assert.assertEquals(0, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase3() {
    int p = 2, q = 2;
    LeetCode858 solution = new LeetCode858();
    Assert.assertEquals(1, solution.mirrorReflection(p, q));
  }

  @Test
  public void testProblemCase4() {
    int p = 5, q = 4;
    LeetCode858 solution = new LeetCode858();
    Assert.assertEquals(0, solution.mirrorReflection(p, q));
  }
}
