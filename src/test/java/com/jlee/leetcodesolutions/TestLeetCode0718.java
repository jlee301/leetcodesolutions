package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0718;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0718 {
  @Test
  public void testProblemCase() {
    int[] A = {1,2,3,2,1};
    int[] B = {3,2,1,4,7};
    LeetCode0718 solution = new LeetCode0718();
    Assert.assertEquals(3, solution.findLength(A, B));
  }

  @Test
  public void testNoCommon() {
    int[] A = {1,2,3,4,5};
    int[] B = {6,7,8,9,0};
    LeetCode0718 solution = new LeetCode0718();
    Assert.assertEquals(0, solution.findLength(A, B));
  }

  @Test
  public void testAllCommon() {
    int[] A = {1,2,3,4,5};
    int[] B = {1,2,3,4,5};
    LeetCode0718 solution = new LeetCode0718();
    Assert.assertEquals(5, solution.findLength(A, B));
  }
}
