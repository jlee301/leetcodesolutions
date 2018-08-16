package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode890;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode890 {
  @Test
  public void testProblemCase1() {
    // Input: N = 4, dislikes = [[1,2],[1,3],[2,4]]
    // Output: true
    int N = 4;
    int[][] dislikes = {{1,2},{1,3},{2,4}};
    LeetCode890 solution = new LeetCode890();
    Assert.assertTrue(solution.possibleBipartition(N, dislikes));
  }

  @Test
  public void testProblemCase2() {
    // Input: N = 3, dislikes = [[1,2],[1,3],[2,3]]
    // Output: false
    int N = 3;
    int[][] dislikes = {{1,2},{1,3},{2,3}};
    LeetCode890 solution = new LeetCode890();
    Assert.assertFalse(solution.possibleBipartition(N, dislikes));
  }

  @Test
  public void testProblemCase3() {
    // Input: N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
    // Output: false
    int N = 5;
    int[][] dislikes = {{1,2},{2,3},{3,4},{4,5},{1,5}};
    LeetCode890 solution = new LeetCode890();
    Assert.assertFalse(solution.possibleBipartition(N, dislikes));
  }
}