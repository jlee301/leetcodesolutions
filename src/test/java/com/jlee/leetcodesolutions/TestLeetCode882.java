package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode882;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode882 {
  @Test
  public void testProblemCase1() {
    LeetCode882 solution = new LeetCode882(new int[][] { {1,1,5,5} });
    for(int i = 0; i < 10; i++) {
      int[] result = solution.pick();
      if(result[0] < 1 || result[0] > 5)
        Assert.fail("Coordinate outside of the rectangle was return.");
      if(result[1] < 1 || result[1] > 5)
        Assert.fail("Coordinate outside of the rectnalge was return.");
    }
  }

  @Test
  public void testProblemCase2() {
    LeetCode882 solution = new LeetCode882(new int[][] { {-2,-2,-1,-1},{1,0,3,0} });
    for(int i = 0; i < 10; i++) {
      int[] result = solution.pick();
      if(result[0] >= -2 && result[0] <= -1) {
        if(result[1] < -2 && result[1] > -1)
          Assert.fail("Coordinate outside of the rectangle was return.");
      }
      else if(result[0] >= 1 && result[0] <= 3) {
        if(result[1] != 0)
          Assert.fail("Coordinate outside of the rectangle was return.");
      }
      else
        Assert.fail("Coordinate outside of the rectangle was return.");
    }
  }
}
