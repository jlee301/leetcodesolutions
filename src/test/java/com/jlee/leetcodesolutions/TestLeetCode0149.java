package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0149;
import com.jlee.leetcodesolutions.Point;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0149 {
  @Test
  public void testProblemCase1() {
    Point[] points = { new Point(1,1), new Point(2,2), new Point(3,3) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(3, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase2() {
    Point[] points = { new Point(1,1), new Point(3,2), new Point(5,3), new Point(4,1), new Point(2,3), new Point(1,4) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(4, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase3() {
    Point[] points = { new Point(1,1), new Point(3,2), new Point(5,3), new Point(4,1), new Point(2,3), new Point(1,4), new Point(1,4), new Point(1,4) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(6, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase4() {
    Point[] points = { new Point() };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(1, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase5() {
    Point[] points = {};
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(0, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase6() {
    Point[] points = null;
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(0, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase7() {
    Point[] points = { new Point(4,0), new Point(4,-1), new Point(4,5) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(3, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase8() {
    Point[] points = { new Point(2,3), new Point(3,3), new Point(-5,3) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(3, solution.maxPoints(points));
  }

  @Test
  public void testProblemCase9() {
    Point[] points = { new Point(0,0), new Point(94911151,94911150), new Point(94911152,94911151) };
    LeetCode0149 solution = new LeetCode0149();
    Assert.assertEquals(2, solution.maxPoints(points));
  }
}
