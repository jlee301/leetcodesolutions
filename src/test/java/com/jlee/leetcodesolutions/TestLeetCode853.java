package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode853;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode853 {
  @Test
  public void testProblemCase1() {
    // Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
    // Output: 3
    int target = 12;
    int[] position = {10,8,0,5,3}, speed = {2,4,1,1,3};
    LeetCode853 solution = new LeetCode853();
    Assert.assertEquals(3, solution.carFleet(target, position, speed));
  }

  @Test
  public void testProblemCase2() {
    // Input: target = 10, position = [6,8], speed = [3,2]
    // Output: 2
    int target = 10;
    int[] position = {6,8}, speed = {3,2};
    LeetCode853 solution = new LeetCode853();
    Assert.assertEquals(2, solution.carFleet(target, position, speed));
  }

  @Test
  public void testProblemCase3() {
    // Input: target = 10, position = [8,3,7,4,6,5], speed = [4,4,4,4,4,4]
    // Output: 6
    int target = 10;
    int[] position = {8,3,7,4,6,5}, speed = {4,4,4,4,4,4};
    LeetCode853 solution = new LeetCode853();
    Assert.assertEquals(6, solution.carFleet(target, position, speed));
  }
}
