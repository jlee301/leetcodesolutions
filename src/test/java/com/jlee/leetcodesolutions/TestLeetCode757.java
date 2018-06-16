package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode757;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode757 {
  @Test
  public void testProblemCase1() {
    // Input: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
    // Output: 3
    int[][] intervals = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
    LeetCode757 solution = new LeetCode757();
    Assert.assertEquals(3, solution.intersectionSizeTwo(intervals));
  }

  @Test
  public void testProblemCase2() {
    // Input: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
    // Output: 5
    int[][] intervals = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
    LeetCode757 solution = new LeetCode757();
    Assert.assertEquals(5, solution.intersectionSizeTwo(intervals));
  }
}
