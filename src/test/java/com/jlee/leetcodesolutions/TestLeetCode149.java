package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode149;
import com.jlee.leetcodesolutions.Point;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode149 {
  @Test
  public void testProblemCase1() {
    Point[] points = { new Point(1,1), new Point(2,2), new Point(3,3) };
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(3, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase2() {
    Point[] points = { new Point(1,1), new Point(3,2), new Point(5,3), new Point(4,1), new Point(2,3), new Point(1,4) };
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(4, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase3() {
    Point[] points = { new Point(1,1), new Point(3,2), new Point(5,3), new Point(4,1), new Point(2,3), new Point(1,4), new Point(1,4), new Point(1,4) };
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(6, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase4() {
    Point[] points = { new Point() };
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(1, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase5() {
    Point[] points = {};
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(0, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase6() {
    Point[] points = null;
    LeetCode149 solution = new LeetCode149();
    Assert.assertEquals(0, solution.maxPoints(points));
  }
}
