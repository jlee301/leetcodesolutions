package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0864;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0864 {
  @Test
  public void testProblemCase1() {
    // Input: ["@.a.#","###.#","b.A.B"]
    // Output: 8
    String[] grid = { "@.a.#","###.#","b.A.B" };
    LeetCode0864 solution = new LeetCode0864();
    Assert.assertEquals(8, solution.shortestPathAllKeys(grid));
  }

  @Test
  public void testProblemCase2() {
    // Input: ["@..aA","..B#.","....b"]
    // Output: 6
    String[] grid = { "@..aA","..B#.","....b" };
    LeetCode0864 solution = new LeetCode0864();
    Assert.assertEquals(6, solution.shortestPathAllKeys(grid));
  }

  @Test
  public void testProblemCase3() {
    // Input: ["@..aA","..B##","...#b"]
    // Output: -1
    String[] grid = { "@..aA","..B##","...#b" };
    LeetCode0864 solution = new LeetCode0864();
    Assert.assertEquals(-1, solution.shortestPathAllKeys(grid));
  }

  @Test
  public void testProblemCase4() {
    String[] grid = { "@FEDCBA",".~#####", "abcdef#" };
    LeetCode0864 solution = new LeetCode0864();
    Assert.assertEquals(7, solution.shortestPathAllKeys(grid));
  }
}
