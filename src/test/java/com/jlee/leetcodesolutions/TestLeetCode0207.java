package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0207;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0207 {
  @Test
  public void testProblemCase() {
    int numCourses = 2;
    int[][] prerequisites = {{1,0}};
    LeetCode0207 solution = new LeetCode0207();
    Assert.assertTrue(solution.canFinish(numCourses, prerequisites));
  }

  @Test
  public void testProblemCase2() {
    int numCourses = 2;
    int[][] prerequisites = {{1,0},{0,1}};
    LeetCode0207 solution = new LeetCode0207();
    Assert.assertFalse(solution.canFinish(numCourses, prerequisites));
  }

  @Test
  public void testMultiplePreReqOneClass() {
    int numCourses = 3;
    int[][] prerequisites = {{0,1},{0,2}};
    LeetCode0207 solution = new LeetCode0207();
    Assert.assertTrue(solution.canFinish(numCourses, prerequisites));
  }

  @Test
  public void testEmptyPreReq() {
    int numCourses = 2;
    int[][] prerequisites = {};
    LeetCode0207 solution = new LeetCode0207();
    Assert.assertTrue(solution.canFinish(numCourses, prerequisites));
  }

  @Test
  public void testNullPreReq() {
    int numCourses = 2;
    int[][] prerequisites = null;
    LeetCode0207 solution = new LeetCode0207();
    Assert.assertTrue(solution.canFinish(numCourses, prerequisites));
  }
}
