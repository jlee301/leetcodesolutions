package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode210;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode210 {
  @Test
  public void testProblemCase1() {
    int numCourses = 2;
    int[][] prerequisites = {{1,0}};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0,1}, solution.findOrder(numCourses, prerequisites));
  }
  
  @Test
  public void testProblemCase2() {
    int numCourses = 4;
    int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0,1,2,3}, solution.findOrder(numCourses, prerequisites));
  }

  @Test
  public void testCantTakeAnyCourses() {
    int numCourses = 2;
    int[][] prerequisites = {{1,0},{0,1}};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {}, solution.findOrder(numCourses, prerequisites));
  }

  @Test
  public void testMultiplePreReqOneClass() {
    int numCourses = 3;
    int[][] prerequisites = {{0,1},{0,2}};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {1,2,0}, solution.findOrder(numCourses, prerequisites));
  }

  
  @Test
  public void testOneCourseEmptyPreReqs() {
    int numCourses = 1;
    int[][] prerequisites = {};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0}, solution.findOrder(numCourses, prerequisites));
  }

  @Test
  public void testSevenCoursesEmptyPreReqs() {
    int numCourses = 7;
    int[][] prerequisites = {};
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0,1,2,3,4,5,6}, solution.findOrder(numCourses, prerequisites));
  }

  @Test
  public void testOneCourseNullPreReq() {
    int numCourses = 1;
    int[][] prerequisites = null;
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0}, solution.findOrder(numCourses, prerequisites));
  }

  @Test
  public void testSevenCoursesNullPreReq() {
    int numCourses = 7;
    int[][] prerequisites = null;
    LeetCode210 solution = new LeetCode210();
    Assert.assertArrayEquals(new int[] {0,1,2,3,4,5,6}, solution.findOrder(numCourses, prerequisites));
  }
}
