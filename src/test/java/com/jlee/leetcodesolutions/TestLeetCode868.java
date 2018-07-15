package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode868;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode868 {
  @Test
  public void testProblemCase1() {
    int N = 22;
    LeetCode868 solution = new LeetCode868();
    Assert.assertEquals(2, solution.binaryGap(N));
  }

  @Test
  public void testProblemCase2() {
    int N = 5;
    LeetCode868 solution = new LeetCode868();
    Assert.assertEquals(2, solution.binaryGap(N));
  }

  @Test
  public void testProblemCase3() {
    int N = 6;
    LeetCode868 solution = new LeetCode868();
    Assert.assertEquals(1, solution.binaryGap(N));
  }

  @Test
  public void testProblemCase4() {
    int N = 8;
    LeetCode868 solution = new LeetCode868();
    Assert.assertEquals(0, solution.binaryGap(N));
  }
}
