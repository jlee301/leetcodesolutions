package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1012;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1012 {
  @Test
  public void testProblemCase1() {
    int N = 5;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(2, solution.bitwiseComplement(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 7;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(0, solution.bitwiseComplement(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 10;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(5, solution.bitwiseComplement(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 0;
    LeetCode1012 solution = new LeetCode1012();
    Assert.assertEquals(1, solution.bitwiseComplement(N));
  }
}
