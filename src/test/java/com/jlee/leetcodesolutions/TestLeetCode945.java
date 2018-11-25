package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode945;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode945 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,2};
    LeetCode945 solution = new LeetCode945();
    Assert.assertEquals(1, solution.minIncrementForUnique(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,2,1,2,1,7};
    LeetCode945 solution = new LeetCode945();
    Assert.assertEquals(6, solution.minIncrementForUnique(A));
  }
}
