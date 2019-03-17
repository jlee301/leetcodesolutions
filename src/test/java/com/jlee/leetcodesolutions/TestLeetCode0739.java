package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0739;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0739 {
  @Test
  public void testProblemCase() {
    int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
    LeetCode0739 solution = new LeetCode0739();
    Assert.assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures(temperatures));
  }

  @Test
  public void testDescendingTemps() {
    int[] temperatures = {80, 79, 78, 77, 76, 75, 74, 73};
    LeetCode0739 solution = new LeetCode0739();
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, solution.dailyTemperatures(temperatures));
  }

  @Test
  public void testFlatTemps() {
    int[] temperatures = {80, 80, 80, 80, 80, 80, 80, 80};
    LeetCode0739 solution = new LeetCode0739();
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, solution.dailyTemperatures(temperatures));
  }

  @Test
  public void testAscendingTemps() {
    int[] temperatures = {81, 82, 83, 84, 85, 86, 87, 88};
    LeetCode0739 solution = new LeetCode0739();
    Assert.assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1, 0}, solution.dailyTemperatures(temperatures));
  }
}
