package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode959;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode959 {
  @Test
  public void testProblemCase1() {
    String[] grid = {" /", "/ "};
    LeetCode959 solution = new LeetCode959();
    Assert.assertEquals(2, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase2() {
    String[] grid = {" /", "  "};
    LeetCode959 solution = new LeetCode959();
    Assert.assertEquals(1, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase3() {
    String[] grid = {"\\/", "/\\"};
    LeetCode959 solution = new LeetCode959();
    Assert.assertEquals(4, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase4() {
    String[] grid = {"/\\", "\\/"};
    LeetCode959 solution = new LeetCode959();
    Assert.assertEquals(5, solution.regionsBySlashes(grid));
  }

  @Test
  public void testProblemCase5() {
    String[] grid = {"//", "/ "};
    LeetCode959 solution = new LeetCode959();
    Assert.assertEquals(3, solution.regionsBySlashes(grid));
  }
}
