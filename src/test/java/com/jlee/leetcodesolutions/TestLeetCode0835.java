package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0835;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0835 {
  @Test
  public void testProblemCase() {
    int[][] A = { {1,1,0},
                  {0,1,0},
                  {0,1,0} };

    int[][] B = { {0,0,0},
                  {0,1,1},
                  {0,0,1} };
    
    LeetCode0835 solution = new LeetCode0835();
    Assert.assertEquals(3, solution.largestOverlap(A, B));
  }
}
