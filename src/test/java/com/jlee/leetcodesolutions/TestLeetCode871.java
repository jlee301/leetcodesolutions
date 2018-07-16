package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode871;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode871 {
  @Test
  public void testProblemCase1() {
    // Input: target = 1, startFuel = 1, stations = []
    // Output: 0
    int target = 1, startFuel = 1;
    int[][] stations = {};
    LeetCode871 solution = new LeetCode871();
    Assert.assertEquals(0, solution.minRefuelStops(target, startFuel, stations));
  }

  @Test
  public void testProblemCase2() {
    // Input: target = 100, startFuel = 1, stations = [[10,100]]
    // Output: -1
    int target = 100, startFuel = 1;
    int[][] stations = {{10,100}};
    LeetCode871 solution = new LeetCode871();
    Assert.assertEquals(-1, solution.minRefuelStops(target, startFuel, stations));
  }

  @Test
  public void testProblemCase3() {
    // Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
    // Output: 2
    int target = 100, startFuel = 10;
    int[][] stations = {{10,60},{20,30},{30,30},{60,40}};
    LeetCode871 solution = new LeetCode871();
    Assert.assertEquals(2, solution.minRefuelStops(target, startFuel, stations));
  }

  @Test
  public void testProblemCase4() {
    // Input: target = 100, startFuel = 10, stations = [[10,60]]
    // Output: -1
    int target = 100, startFuel = 10;
    int[][] stations = {{10,60}};
    LeetCode871 solution = new LeetCode871();
    Assert.assertEquals(-1, solution.minRefuelStops(target, startFuel, stations));
  }

  @Test
  public void testProblemCase5() {
    // Input: target = 100, startFuel = 25, stations = [[25,25],[50,25],[75,25]]
    // Output: -1
    int target = 100, startFuel = 25;
    int[][] stations = {{25,25},{50,25},{75,25}};
    LeetCode871 solution = new LeetCode871();
    Assert.assertEquals(3, solution.minRefuelStops(target, startFuel, stations));
  }
}
