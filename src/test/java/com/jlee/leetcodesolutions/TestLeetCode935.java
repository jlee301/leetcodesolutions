package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode935;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode935 {
  @Test
  public void testProblemCase1() {
    int N = 1;
    LeetCode935 solution = new LeetCode935();
    Assert.assertEquals(10, solution.knightDialer(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 2;
    LeetCode935 solution = new LeetCode935();
    Assert.assertEquals(20, solution.knightDialer(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 3;
    LeetCode935 solution = new LeetCode935();
    Assert.assertEquals(46, solution.knightDialer(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 4;
    LeetCode935 solution = new LeetCode935();
    Assert.assertEquals(104, solution.knightDialer(N));
  }
}
