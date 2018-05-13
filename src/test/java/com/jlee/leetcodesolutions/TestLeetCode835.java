package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode835;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode835 {
  @Test
  public void testProblemCase() {
    int[][] A = { {1,1,0},
                  {0,1,0},
                  {0,1,0} };

    int[][] B = { {0,0,0},
                  {0,1,1},
                  {0,0,1} };
    
    LeetCode835 solution = new LeetCode835();
    Assert.assertEquals(3, solution.largestOverlap(A, B));
  }
}
