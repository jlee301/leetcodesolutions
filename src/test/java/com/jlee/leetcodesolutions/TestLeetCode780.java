package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode780;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode780 {
  @Test
  public void testProblemCase1() {
    // Input: sx = 1, sy = 1, tx = 3, ty = 5
    // Output: True
    int sx = 1, sy = 1, tx = 3, ty = 5;
    LeetCode780 solution = new LeetCode780();
    Assert.assertTrue(solution.reachingPoints(sx, sy, tx, ty));
  }

  @Test
  public void testProblemCase2() {
    // Input: sx = 1, sy = 1, tx = 2, ty = 2
    // Output: False
    int sx = 1, sy = 1, tx = 2, ty = 2;
    LeetCode780 solution = new LeetCode780();
    Assert.assertFalse(solution.reachingPoints(sx, sy, tx, ty));
  }

  @Test
  public void testProblemCase3() {
    // Input: sx = 1, sy = 1, tx = 1, ty = 1
    // Output: True
    int sx = 1, sy = 1, tx = 1, ty = 1;
    LeetCode780 solution = new LeetCode780();
    Assert.assertTrue(solution.reachingPoints(sx, sy, tx, ty));
  }

  @Test
  public void testRTE1() {
    // Input: sx = 35, sy = 13, tx = 455955547, ty = 420098884
    // Output: True
    int sx = 35, sy = 13, tx = 455955547, ty = 420098884;
    LeetCode780 solution = new LeetCode780();
    Assert.assertFalse(solution.reachingPoints(sx, sy, tx, ty));
  }

  @Test
  public void testRTE2() {
    // Input: sx = 1, sy = 1, tx = 1000000000, ty = 1
    // Output: True
    int sx = 1, sy = 1, tx = 1000000000, ty = 1;
    LeetCode780 solution = new LeetCode780();
    Assert.assertTrue(solution.reachingPoints(sx, sy, tx, ty));
  }

  @Test
  public void testWrongAns() {
    // Input: sx = 9, sy = 10, tx = 9, ty = 19
    // Output: True
    int sx = 9, sy = 10, tx = 9, ty = 19;
    LeetCode780 solution = new LeetCode780();
    Assert.assertTrue(solution.reachingPoints(sx, sy, tx, ty));
  }
  
  @Test
  public void testStartingBehind() {
    // Input: sx = 9, sy = 10, tx = 9, ty = 9
    // Output: True
    int sx = 9, sy = 10, tx = 9, ty = 9;
    LeetCode780 solution = new LeetCode780();
    Assert.assertFalse(solution.reachingPoints(sx, sy, tx, ty));
  }
}
