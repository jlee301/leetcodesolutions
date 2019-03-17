package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0959;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0959 {
  @Test
  public void testProblemCase1() {
    String[] grid = {" /", "/ "};
    LeetCode0959 solution = new LeetCode0959();
    Assert.assertEquals(2, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase2() {
    String[] grid = {" /", "  "};
    LeetCode0959 solution = new LeetCode0959();
    Assert.assertEquals(1, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase3() {
    String[] grid = {"\\/", "/\\"};
    LeetCode0959 solution = new LeetCode0959();
    Assert.assertEquals(4, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase4() {
    String[] grid = {"/\\", "\\/"};
    LeetCode0959 solution = new LeetCode0959();
    Assert.assertEquals(5, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase5() {
    String[] grid = {"//", "/ "};
    LeetCode0959 solution = new LeetCode0959();
    Assert.assertEquals(3, solution.regionsBySlashes(grid));
  }
}
