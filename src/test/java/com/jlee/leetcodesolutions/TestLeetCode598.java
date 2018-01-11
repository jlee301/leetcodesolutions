package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode598;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode598 {
  @Test
  public void testProblemCase() {
    int m = 3, n = 3;
    int[][] ops = {{2,2},{3,3}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(4, solution.maxCount(m, n, ops));
  }

  @Test
  public void testProblemCaseDiffOrder() {
    int m = 3, n = 3;
    int[][] ops = {{3,3},{2,2}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(4, solution.maxCount(m, n, ops));
  }
  
  @Test
  public void testLowerMin() {
    int m = 3, n = 3;
    int[][] ops = {{2,2},{1,1}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(1, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testM0() {
    int m = 0, n = 3;
    int[][] ops = {{2,2},{1,1}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testN0() {
    int m = 3, n = 0;
    int[][] ops = {{2,2},{1,1}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testOpsEmpty() {
    int m = 3, n = 3;
    int[][] ops = {};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testOpsOpEmpty() {
    int m = 3, n = 3;
    int[][] ops = {{}};
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }

  @Test
  public void testNull() {
    int m = 3, n = 3;
    int[][] ops = null;
    LeetCode598 solution = new LeetCode598();
    Assert.assertEquals(0, solution.maxCount(m, n, ops));    
  }
}
