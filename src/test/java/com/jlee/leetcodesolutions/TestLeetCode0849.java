package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0849;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0849 {
  @Test
  public void testProblemCase1() {
    // Input: [1,0,0,0,1,0,1]
    // Output: 2
    int[] seats = {1,0,0,0,1,0,1};
    LeetCode0849 solution = new LeetCode0849();
    Assert.assertEquals(2, solution.maxDistToClosest(seats));
  }

  @Test
  public void testProblemCase2() {
    // Input: [1,0,0,0]
    // Output: 3
    int[] seats = {1,0,0,0};
    LeetCode0849 solution = new LeetCode0849();
    Assert.assertEquals(3, solution.maxDistToClosest(seats));
  }

  @Test
  public void testNoFloor() {
    // Input: [0,0,0,1]
    // Output: 3
    int[] seats = {0,0,0,1};
    LeetCode0849 solution = new LeetCode0849();
    Assert.assertEquals(3, solution.maxDistToClosest(seats));
  }
}
