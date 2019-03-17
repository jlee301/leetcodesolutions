package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0630;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0630 {
  @Test
  public void testProblemCase1() {
    // Input: [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
    // Output: 3
    int[][] courses = new int[][] {{100,200},{200,1300},{1000,1250},{2000,3200}};
    LeetCode0630 solution = new LeetCode0630();
    Assert.assertEquals(3, solution.scheduleCourse(courses));
  }

  @Test
  public void testProblemCase2() {
    // Input: [[1,2], [2,3]]
    // Output: 2
    int[][] courses = new int[][] {{1,2},{2,3}};
    LeetCode0630 solution = new LeetCode0630();
    Assert.assertEquals(2, solution.scheduleCourse(courses));
  }

  @Test
  public void testProblemCase3() {
    // Input: [[914,9927],[333,712],[163,5455],[835,5040],[905,8433],[417,8249],[921,9553],[913,7394],[303,7525],[582,8658],[86,957],[40,9152],[600,6941],[466,5775],[718,8485],[34,3903],[380,9996],[316,7755]]
    // Output: 18
    int[][] courses = new int[][] { { 914, 9927 }, { 333, 712 }, { 163, 5455 }, { 835, 5040 }, { 905, 8433 },
        { 417, 8249 }, { 921, 9553 }, { 913, 7394 }, { 303, 7525 }, { 582, 8658 }, { 86, 957 }, { 40, 9152 },
        { 600, 6941 }, { 466, 5775 }, { 718, 8485 }, { 34, 3903 }, { 380, 9996 }, { 316, 7755 } };
    LeetCode0630 solution = new LeetCode0630();
    Assert.assertEquals(18, solution.scheduleCourse(courses));
  }

  @Test
  public void testProblemCase5() {
    int[][] courses = new int[][] {{3,4},{3,5}};
    LeetCode0630 solution = new LeetCode0630();
    Assert.assertEquals(1, solution.scheduleCourse(courses));
  }

  @Test
  public void testProblemCase6() {
    int[][] courses = new int[][] {{6,5}};
    LeetCode0630 solution = new LeetCode0630();
    Assert.assertEquals(0, solution.scheduleCourse(courses));
  }
}
