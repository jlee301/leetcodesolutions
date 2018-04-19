package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode593;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode593 {
  @Test
  public void testProblemCase() {
    int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,1};
    LeetCode593 solution = new LeetCode593();
    Assert.assertTrue(solution.validSquare(p1, p2, p3, p4));
  }

  @Test
  public void testNonAdjacent() {
    int[] p1 = {1,0}, p2 = {-1,0}, p3 = {0,1}, p4 = {0,-1};
    LeetCode593 solution = new LeetCode593();
    Assert.assertTrue(solution.validSquare(p1, p2, p3, p4));
  }

  @Test
  public void testRectangleYLonger() {
    int[] p1 = {0,0}, p2 = {0,2}, p3 = {1,0}, p4 = {1,2};
    LeetCode593 solution = new LeetCode593();
    Assert.assertFalse(solution.validSquare(p1, p2, p3, p4));
  }

  @Test
  public void testRectangleXLonger() {
    int[] p1 = {0,0}, p2 = {0,1}, p3 = {2,0}, p4 = {2,1};
    LeetCode593 solution = new LeetCode593();
    Assert.assertFalse(solution.validSquare(p1, p2, p3, p4));
  }

  @Test
  public void testAllSamePoints() {
    int[] p1 = {0,0}, p2 = {0,0}, p3 = {0,0}, p4 = {0,0};
    LeetCode593 solution = new LeetCode593();
    Assert.assertFalse(solution.validSquare(p1, p2, p3, p4));
  }
}
