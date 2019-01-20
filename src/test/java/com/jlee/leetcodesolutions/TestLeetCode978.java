package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode978;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode978 {
  @Test
  public void testProblemCase1() {
    int[] A = {9,4,2,10,7,8,8,1,9};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(5, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {4,8,12,16};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(2, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {100};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(1, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {16,12,8,4};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(2, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(0, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase6() {
    int[] A = null;
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(0, solution.maxTurbulenceSize(A));
  }

  @Test
  public void testProblemCase7() {
    int[] A = {2,0,2,4,2,5,0,1,2,3};
    LeetCode978 solution = new LeetCode978();
    Assert.assertEquals(6, solution.maxTurbulenceSize(A));
  }
}
