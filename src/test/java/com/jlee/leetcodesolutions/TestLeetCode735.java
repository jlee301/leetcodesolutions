package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode735;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode735 {
  @Test
  public void testProblemCase1() {
    int[] asteroids = {5, 10, -5};
    LeetCode735 solution = new LeetCode735();
    Assert.assertArrayEquals(new int[] {5, 10}, solution.asteroidCollision(asteroids));
  }

  @Test
  public void testProblemCase2() {
    int[] asteroids = {8, -8};
    LeetCode735 solution = new LeetCode735();
    Assert.assertArrayEquals(new int[] {}, solution.asteroidCollision(asteroids));
  }

  @Test
  public void testProblemCase3() {
    int[] asteroids = {10, 2, -5};
    LeetCode735 solution = new LeetCode735();
    Assert.assertArrayEquals(new int[] {10}, solution.asteroidCollision(asteroids));
  }

  @Test
  public void testProblemCase4() {
    int[] asteroids = {-2, -1, 1, 2};
    LeetCode735 solution = new LeetCode735();
    Assert.assertArrayEquals(new int[] {-2, -1, 1, 2}, solution.asteroidCollision(asteroids));
  }
}
