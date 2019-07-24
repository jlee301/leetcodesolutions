package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1131;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1131 {
  @Test
  public void testProblemCase1() {
    int[] arr1 = {1,2,3,4}, arr2 = {-1,4,5,6};
    LeetCode1131 solution = new LeetCode1131();
    Assert.assertEquals(13, solution.maxAbsValExpr(arr1, arr2));
  }

  @Test
  public void testProblemCase2() {
    int[] arr1 = {1,-2,-5,0,10}, arr2 = {0,-2,-1,-7,-4};
    LeetCode1131 solution = new LeetCode1131();
    Assert.assertEquals(20, solution.maxAbsValExpr(arr1, arr2));
  }
}
