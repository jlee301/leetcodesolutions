package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0799;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0799 {
  @Test
  public void testProblemCase1() {
    int poured = 1, query_glass = 1, query_row = 1;
    LeetCode0799 solution = new LeetCode0799();
    Assert.assertEquals(0.0, solution.champagneTower(poured, query_row, query_glass), 0.0);
  }

  @Test
  public void testProblemCase2() {
    int poured = 2, query_glass = 1, query_row = 1;
    LeetCode0799 solution = new LeetCode0799();
    Assert.assertEquals(0.5, solution.champagneTower(poured, query_row, query_glass), 0.0);
  }

  @Test
  public void testTopGlassOverPour() {
    int poured = 2, query_glass = 0, query_row = 0;
    LeetCode0799 solution = new LeetCode0799();
    Assert.assertEquals(1.0, solution.champagneTower(poured, query_row, query_glass), 0.0);
  }

  @Test
  public void testTopGlassUnderPour() {
    int poured = 0, query_glass = 0, query_row = 0;
    LeetCode0799 solution = new LeetCode0799();
    Assert.assertEquals(0.0, solution.champagneTower(poured, query_row, query_glass), 0.0);
  }
}
