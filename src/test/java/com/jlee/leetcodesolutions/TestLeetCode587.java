package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode587;
import com.jlee.leetcodesolutions.LeetCode587.Point;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode587 {
  @Test
  public void testProblemCase1() {
    // Input: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
    // Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
    LeetCode587 solution = new LeetCode587();
    Point[] points = { solution.new Point(1, 1), solution.new Point(2, 2), solution.new Point(2, 0),
        solution.new Point(2, 4), solution.new Point(3, 3), solution.new Point(4, 2) };
    List<Point> result = solution.outerTrees(points);
    Assert.assertEquals(5, result.size());
    Assert.assertTrue(result.contains(points[0]));
    Assert.assertTrue(result.contains(points[2]));
    Assert.assertTrue(result.contains(points[3]));
    Assert.assertTrue(result.contains(points[4]));
    Assert.assertTrue(result.contains(points[5]));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1,2],[2,2],[4,2]]
    // Output: [[1,2],[2,2],[4,2]]
    LeetCode587 solution = new LeetCode587();
    Point[] points = { solution.new Point(1, 2), solution.new Point(2, 2), solution.new Point(4, 2) };
    List<Point> result = solution.outerTrees(points);
    Assert.assertEquals(3, result.size());
    Assert.assertTrue(result.contains(points[0]));
    Assert.assertTrue(result.contains(points[1]));
    Assert.assertTrue(result.contains(points[2]));
  }

  @Test
  public void testProblemCase3() {
    // Input: [[0,2],[1,1],[2,2],[2,4],[4,2],[3,3]]
    // Output: [[0,2],[1,1],[4,2],[3,3],[2,4]]
    LeetCode587 solution = new LeetCode587();
    Point[] points = { solution.new Point(0, 2), solution.new Point(1, 1), solution.new Point(2, 2),
        solution.new Point(2, 4), solution.new Point(4, 2), solution.new Point(3, 3) };
    List<Point> result = solution.outerTrees(points);
    Assert.assertEquals(5, result.size());
    Assert.assertTrue(result.contains(points[0]));
    Assert.assertTrue(result.contains(points[1]));
    Assert.assertTrue(result.contains(points[3]));
    Assert.assertTrue(result.contains(points[4]));
    Assert.assertTrue(result.contains(points[5]));
  }

  @Test
  public void testProblemCase4() {
    // Input: [[2,2],[2,0],[2,4],[3,3],[4,2],[1,1]]
    // Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
    LeetCode587 solution = new LeetCode587();
    Point[] points = { solution.new Point(2, 2), solution.new Point(2, 0), solution.new Point(2, 4),
        solution.new Point(3, 3), solution.new Point(4, 2), solution.new Point(1, 1) };
    List<Point> result = solution.outerTrees(points);
    Assert.assertEquals(5, result.size());
    Assert.assertTrue(result.contains(points[1]));
    Assert.assertTrue(result.contains(points[2]));
    Assert.assertTrue(result.contains(points[3]));
    Assert.assertTrue(result.contains(points[4]));
    Assert.assertTrue(result.contains(points[5]));
  }
}
