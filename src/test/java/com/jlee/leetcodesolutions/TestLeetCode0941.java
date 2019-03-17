package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0941;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0941 {
  @Test
  public void testProblemCase1() {
    int[] A = {2,1};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,5,5};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {0,3,2,1};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertTrue(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {0,1,2,3};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {3,2,1,0};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {0,1,2,3,2,3};
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase7() {
    int[] A = null;
    LeetCode0941 solution = new LeetCode0941();
    Assert.assertFalse(solution.validMountainArray(A));
  }
}
