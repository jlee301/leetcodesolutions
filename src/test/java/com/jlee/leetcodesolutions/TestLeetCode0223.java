package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0223;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0223 {
  @Test
  public void testProblemCase() {
    int A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2;
    LeetCode0223 solution = new LeetCode0223();
    Assert.assertEquals(45, solution.computeArea(A, B, C, D, E, F, G, H));
  }

  @Test
  public void testProblemCaseReversed() {
    int E = -3, F = 0, G = 3, H = 4, A = 0, B = -1, C = 9, D = 2;
    LeetCode0223 solution = new LeetCode0223();
    Assert.assertEquals(45, solution.computeArea(A, B, C, D, E, F, G, H));
  }

  @Test
  public void testRectangleDoNotOverlap1() {
    int A = 0, B = 0, C = 2, D = 2, E = 2, F = 3, G = 4, H = 5;
    LeetCode0223 solution = new LeetCode0223();
    Assert.assertEquals(8, solution.computeArea(A, B, C, D, E, F, G, H));
  }

  @Test
  public void testRectangleDoNotOverlap2() {
    int A = 0, B = 0, C = 2, D = 2, E = 0, F = -2, G = 2, H = 0;
    LeetCode0223 solution = new LeetCode0223();
    Assert.assertEquals(8, solution.computeArea(A, B, C, D, E, F, G, H));
  }
}
