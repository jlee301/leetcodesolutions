package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode939;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode939 {
  @Test
  public void testProblemCase1() {
    int[][] points = {{1,1},{1,3},{3,1},{3,3},{2,2}};
    LeetCode939 solution = new LeetCode939();
    Assert.assertEquals(4, solution.minAreaRect(points));
  }

  @Test
  public void testProblemCase2() {
    int[][] points = {{1,1},{1,3},{3,1},{3,3},{4,1},{4,3}};
    LeetCode939 solution = new LeetCode939();
    Assert.assertEquals(2, solution.minAreaRect(points));
  }

  @Test
  public void testProblemCase3() {
    int[][] points = {{1,1},{3,3},{1,3}};
    LeetCode939 solution = new LeetCode939();
    Assert.assertEquals(0, solution.minAreaRect(points));
  }

  @Test
  public void testProblemCase4() {
    int[][] points = {{1,1},{3,3},{3,1}};
    LeetCode939 solution = new LeetCode939();
    Assert.assertEquals(0, solution.minAreaRect(points));
  }
}
