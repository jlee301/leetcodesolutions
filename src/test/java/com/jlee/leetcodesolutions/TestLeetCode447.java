package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode447;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode447 {
  @Test
  public void testProblemCase1() {
    int[][] points = {{0,0},{1,0},{2,0}};
    LeetCode447 solution = new LeetCode447();
    Assert.assertEquals(2, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase2() {
    int[][] points = {{0,0},{25,25},{50,50},{-25,-25}};
    // {25,25}, {0,0}, {50,50}
    // {25,25}, {50,50}, {0,0}
    // {0,0}, {25,25}, {-25,-25}
    // {0,0}, {-25,-25}, {25,25}
    LeetCode447 solution = new LeetCode447();
    Assert.assertEquals(4, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase3() {
    int[][] points = {{1,0},{1,0},{1,0},{1,0}};
    LeetCode447 solution = new LeetCode447();
    Assert.assertEquals(24, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase4() {
    int[][] points = {{0,0},{1,0}};
    LeetCode447 solution = new LeetCode447();
    Assert.assertEquals(0, solution.numberOfBoomerangs(points));
  }

  @Test
  public void testProblemCase5() {
    int[][] points = {};
    LeetCode447 solution = new LeetCode447();
    Assert.assertEquals(0, solution.numberOfBoomerangs(points));
  }
}
