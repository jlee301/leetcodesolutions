package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0598;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0598 {
  @Test
  public void testProblemCase1() {
    int m = 3, n = 3;
    int[][] ops = {{2,2},{3,3}};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(4, solution.maxCount(m, n, ops));
  }

  @Test
  public void testProblemCase2() {
    int m = 3, n = 3;
    int[][] ops = {{3,3},{2,2}};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(4, solution.maxCount(m, n, ops));
  }
  
  @Test
  public void testProblemCase3() {
    int m = 3, n = 3;
    int[][] ops = {{2,2},{1,1}};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(1, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testProblemCase4() {
    int m = 0, n = 3;
    int[][] ops = {{2,2},{1,1}};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testProblemCase5() {
    int m = 3, n = 0;
    int[][] ops = {{2,2},{1,1}};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testProblemCase6() {
    int m = 3, n = 3;
    int[][] ops = {};
    LeetCode0598 solution = new LeetCode0598();
    Assert.assertEquals(9, solution.maxCount(m, n, ops));    
  }
}
