package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1028;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1028 {
  @Test
  public void testProblemCase1() {
    int N = 2;
    LeetCode1028 solution = new LeetCode1028();
    Assert.assertEquals("110", solution.baseNeg2(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 3;
    LeetCode1028 solution = new LeetCode1028();
    Assert.assertEquals("111", solution.baseNeg2(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 4;
    LeetCode1028 solution = new LeetCode1028();
    Assert.assertEquals("100", solution.baseNeg2(N));
  }

  @Test
  public void testProblemCase5() {
    int N = 0;
    LeetCode1028 solution = new LeetCode1028();
    Assert.assertEquals("0", solution.baseNeg2(N));
  }

  @Test
  public void testProblemCase6() {
    int N = 6;
    LeetCode1028 solution = new LeetCode1028();
    Assert.assertEquals("11010", solution.baseNeg2(N));
  }
}
