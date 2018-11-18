package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode941;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode941 {
  @Test
  public void testProblemCase1() {
    int[] A = {2,1};
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3,5,5};
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {0,3,2,1};
    LeetCode941 solution = new LeetCode941();
    Assert.assertTrue(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {0,1,2,3};
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {3,2,1,0};
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {0,1,2,3,2,3};
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }

  @Test
  public void testProblemCase7() {
    int[] A = null;
    LeetCode941 solution = new LeetCode941();
    Assert.assertFalse(solution.validMountainArray(A));
  }
}
