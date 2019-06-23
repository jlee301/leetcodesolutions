package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1094;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1094 {
  @Test
  public void testProblemCase1() {
    int[][] trips = {{2,1,5},{3,3,7}};
    int capacity = 4;
    LeetCode1094 solution = new LeetCode1094();
    Assert.assertFalse(solution.carPooling(trips, capacity));
  }

  @Test
  public void testProblemCase2() {
    int[][] trips = {{2,1,5},{3,3,7}};
    int capacity = 5;
    LeetCode1094 solution = new LeetCode1094();
    Assert.assertTrue(solution.carPooling(trips, capacity));
  }

  @Test
  public void testProblemCase3() {
    int[][] trips = {{2,1,5},{3,5,7}};
    int capacity = 3;
    LeetCode1094 solution = new LeetCode1094();
    Assert.assertTrue(solution.carPooling(trips, capacity));
  }

  @Test
  public void testProblemCase4() {
    int[][] trips = {{3,2,7},{3,7,9},{8,3,9}};
    int capacity = 11;
    LeetCode1094 solution = new LeetCode1094();
    Assert.assertTrue(solution.carPooling(trips, capacity));
  }
}
