package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode646;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode646 {
  @Test
  public void testProblemCase() {
    int[][] pairs = {{1,2}, {2,3}, {3,4}};
    LeetCode646 solution = new LeetCode646();
    Assert.assertEquals(2, solution.findLongestChain(pairs));
  }

  @Test
  public void testEmpty() {
    int[][] pairs = {};
    LeetCode646 solution = new LeetCode646();
    Assert.assertEquals(0, solution.findLongestChain(pairs));
  }

  @Test
  public void testNull() {
    int[][] pairs = null;
    LeetCode646 solution = new LeetCode646();
    Assert.assertEquals(0, solution.findLongestChain(pairs));
  }
}
