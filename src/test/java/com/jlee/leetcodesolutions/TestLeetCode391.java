package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode391;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode391 {
  @Test
  public void testProblemCase1() {
    int[][] rectangles = {{1,1,3,3},
                          {3,1,4,2},
                          {3,2,4,4},
                          {1,3,2,4},
                          {2,3,3,4}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertTrue(solution.isRectangleCover(rectangles));
  }

  @Test
  public void testProblemCase2() {
    int[][] rectangles = {{1,1,2,3},
                          {1,3,2,4},
                          {3,1,4,2},
                          {3,2,4,4}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }

  @Test
  public void testProblemCase3() {
    int[][] rectangles = {{1,1,3,3},
                          {3,1,4,2},
                          {1,3,2,4},
                          {3,2,4,4}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }

  @Test
  public void testProblemCase4() {
    int[][] rectangles = {{1,1,3,3},
                          {3,1,4,2},
                          {1,3,2,4},
                          {2,2,4,4}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }
  
  @Test
  public void testProblemCase5() {
    int[][] rectangles = {{0,0,3,3},
                          {0,0,3,3},
                          {1,1,2,2}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }  

  @Test
  public void testProblemCase6() {
    int[][] rectangles = {{0,0,3,3},
                          {0,0,3,3},
                          {0,0,3,2}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }  

  @Test
  public void testProblemCase7() {
    int[][] rectangles = {{0,0,3,3},
                          {0,0,3,3},
                          {0,0,2,3}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }  

  @Test
  public void testProblemCase8() {
    int[][] rectangles = {{0,0,3,3},
                          {0,0,3,3},
                          {0,0,3,3}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }  

  @Test
  public void testProblemCase9() {
    // x1 = 0, y1 = 0, x2 = 3, y2 = 3
    // x1y1
    // x1y2
    // x2y2
    // x2y1
    int[][] rectangles = {{0,0,3,3},
                          {2,0,3,1}};
    LeetCode391 solution = new LeetCode391();
    Assert.assertFalse(solution.isRectangleCover(rectangles));
  }  
}
