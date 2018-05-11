package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode789;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode789 {
  @Test
  public void testProblemCase1() {
    int[][] ghosts = {{1, 0}, {0, 3}};
    int[] target = {0, 1};
    LeetCode789 solution = new LeetCode789();
    Assert.assertTrue(solution.escapeGhosts(ghosts, target));
  }

  @Test
  public void testProblemCase2() {
    int[][] ghosts = {{1, 0}};
    int[] target = {2, 0};
    LeetCode789 solution = new LeetCode789();
    Assert.assertFalse(solution.escapeGhosts(ghosts, target));
  }

  @Test
  public void testProblemCase3() {
    int[][] ghosts = {{2, 0}};
    int[] target = {1, 0};
    LeetCode789 solution = new LeetCode789();
    Assert.assertFalse(solution.escapeGhosts(ghosts, target));
  }
}
