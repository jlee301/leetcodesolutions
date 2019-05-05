package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1037;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1037 {
  @Test
  public void testProblemCase1() {
    int[][] points = {{1,1},{2,3},{3,2}};
    LeetCode1037 solution = new LeetCode1037();
    Assert.assertTrue(solution.isBoomerang(points));
  }

  @Test
  public void testProblemCase2() {
    int[][] points = {{1,1},{2,2},{3,3}};
    LeetCode1037 solution = new LeetCode1037();
    Assert.assertFalse(solution.isBoomerang(points));
  }

  @Test
  public void testProblemCase3() {
    int[][] points = {{1,0},{2,0},{3,0}};
    LeetCode1037 solution = new LeetCode1037();
    Assert.assertFalse(solution.isBoomerang(points));
  }

  @Test
  public void testProblemCase4() {
    int[][] points = {{0,1},{0,2},{0,3}};
    LeetCode1037 solution = new LeetCode1037();
    Assert.assertFalse(solution.isBoomerang(points));
  }

  @Test
  public void testProblemCase5() {
    int[][] points = {{0,0},{0,2},{2,1}};
    LeetCode1037 solution = new LeetCode1037();
    Assert.assertTrue(solution.isBoomerang(points));
  }
}
