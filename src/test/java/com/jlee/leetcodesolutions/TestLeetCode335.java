package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode335;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode335 {
  @Test
  public void testProblemCase1() {
    int[] x = {2,1,1,2};
    LeetCode335 solution = new LeetCode335();
    Assert.assertTrue(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase2() {
    int[] x = {1,2,3,4};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase3() {
    int[] x = {1,1,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertTrue(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase4() {
    int[] x = {1,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase5() {
    int[] x = null;
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase6() {
    int[] x = {1,1,2,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertTrue(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase7() {
    int[] x = {1,1,3,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase8() {
    int[] x = {1,2,3,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase9() {
    int[] x = {1,1,2,2,3,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase10() {
    int[] x = {2,5,5,4,4,3};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase11() {
    int[] x = {1,1,2,5,1,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase12() {
    int[] x = {2,2,3,3,2,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertTrue(solution.isSelfCrossing(x));
  }

  @Test
  public void testProblemCase13() {
    int[] x = {2,2,5,3,2,1};
    LeetCode335 solution = new LeetCode335();
    Assert.assertFalse(solution.isSelfCrossing(x));
  }
}
