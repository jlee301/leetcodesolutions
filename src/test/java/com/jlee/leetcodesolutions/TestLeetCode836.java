package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode836;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode836 {
  @Test
  public void testProblemCase1() {
    int[] rec1 = {0,0,2,2}, rec2 = {1,1,3,3};
    LeetCode836 solution = new LeetCode836();
    Assert.assertTrue(solution.isRectangleOverlap(rec1, rec2));
  }

  @Test
  public void testProblemCase2() {
    int[] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
    LeetCode836 solution = new LeetCode836();
    Assert.assertFalse(solution.isRectangleOverlap(rec1, rec2));
  }
  
  @Test
  public void testRec1AheadInXAxis() {
    int[] rec1 = {0,0,1,1}, rec2 = {-2,-2,-1, -1};
    LeetCode836 solution = new LeetCode836();
    Assert.assertFalse(solution.isRectangleOverlap(rec1, rec2));    
  }

  @Test
  public void testRec2AheadInXAxis() {
    int[] rec1 = {-2,-2,-1,-1}, rec2 = {0,0,1,1};
    LeetCode836 solution = new LeetCode836();
    Assert.assertFalse(solution.isRectangleOverlap(rec1, rec2));    
  }

  @Test
  public void testRec1AheadInYAxis() {
    int[] rec1 = {0,0,1,1}, rec2 = {0,1,2,2};
    LeetCode836 solution = new LeetCode836();
    Assert.assertFalse(solution.isRectangleOverlap(rec1, rec2));    
  }

  @Test
  public void testRec2AheadInYAxis() {
    int[] rec1 = {0,1,2,2}, rec2 = {0,0,1,1};
    LeetCode836 solution = new LeetCode836();
    Assert.assertFalse(solution.isRectangleOverlap(rec1, rec2));    
  }
}
