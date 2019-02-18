package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode996;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode996 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,17,8};
    LeetCode996 solution = new LeetCode996();
    Assert.assertEquals(2, solution.numSquarefulPerms(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {2,2,2};
    LeetCode996 solution = new LeetCode996();
    Assert.assertEquals(1, solution.numSquarefulPerms(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2,2,2,2,2,2,2,2,2,2,2};
    LeetCode996 solution = new LeetCode996();
    Assert.assertEquals(1, solution.numSquarefulPerms(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,1};
    LeetCode996 solution = new LeetCode996();
    Assert.assertEquals(0, solution.numSquarefulPerms(A));
  }
}
