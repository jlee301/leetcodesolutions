package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0896;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0896 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,2,3};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {6,5,4,4};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,3,2};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertFalse(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,2,4,5};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {1,1,1};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {4,3,5};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertFalse(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase7() {
    int[] A = null;
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase8() {
    int[] A = {};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }

  @Test
  public void testProblemCase9() {
    int[] A = {1};
    LeetCode0896 solution = new LeetCode0896();
    Assert.assertTrue(solution.isMonotonic(A));
  }
}
