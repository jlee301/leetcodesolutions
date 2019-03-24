package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1020;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1020 {
  @Test
  public void testProblemCase1() {
    int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
    LeetCode1020 solution = new LeetCode1020();
    Assert.assertTrue(solution.canThreePartsEqualSum(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
    LeetCode1020 solution = new LeetCode1020();
    Assert.assertFalse(solution.canThreePartsEqualSum(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {3,3,6,5,-2,2,5,1,-9,4};
    LeetCode1020 solution = new LeetCode1020();
    Assert.assertTrue(solution.canThreePartsEqualSum(A));
  }
}
