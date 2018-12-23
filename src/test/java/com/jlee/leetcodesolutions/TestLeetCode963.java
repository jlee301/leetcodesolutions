package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode963;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode963 {
  @Test
  public void testProblemCase1() {
    int[][] points = { {1,2},{2,1},{1,0},{0,1} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(2.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase2() {
    int[][] points = { {0,1},{2,1},{1,1},{1,0},{2,0} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(1.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase3() {
    int[][] points = { {0,3},{1,2},{3,1},{1,3},{2,1} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(0.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase4() {
    int[][] points = { {3,1},{1,1},{0,1},{2,1},{3,3},{3,2},{0,2},{2,3} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(2.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase5() {
    int[][] points = { {1,2},{2,1},{1,0} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(0.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase6() {
    int[][] points = { {2,1},{1,2},{1,0} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(0.0, solution.minAreaFreeRect(points), 0.00001);
  }

  @Test
  public void testProblemCase7() {
    int[][] points = { {1,0},{1,2},{2,1} };
    LeetCode963 solution = new LeetCode963();
    Assert.assertEquals(0.0, solution.minAreaFreeRect(points), 0.00001);
  }
}
