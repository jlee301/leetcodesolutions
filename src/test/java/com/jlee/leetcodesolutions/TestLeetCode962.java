package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode962;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode962 {
  @Test
  public void testProblemCase1() {
    int[] A = {6,0,8,2,1,5};
    LeetCode962 solution = new LeetCode962();
    Assert.assertEquals(4, solution.maxWidthRamp(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {9,8,1,0,1,9,4,0,4,1};
    LeetCode962 solution = new LeetCode962();
    Assert.assertEquals(7, solution.maxWidthRamp(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {5,4,3,2,1};
    LeetCode962 solution = new LeetCode962();
    Assert.assertEquals(0, solution.maxWidthRamp(A));
  }
}
