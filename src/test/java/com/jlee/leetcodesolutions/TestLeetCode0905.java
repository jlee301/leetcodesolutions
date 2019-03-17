package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0905;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0905 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,1,2,4};
    LeetCode0905 solution = new LeetCode0905();
    Assert.assertArrayEquals(new int[] {2,4,1,3}, solution.sortArrayByParity(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3};
    LeetCode0905 solution = new LeetCode0905();
    Assert.assertArrayEquals(new int[] {3}, solution.sortArrayByParity(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = null;
    LeetCode0905 solution = new LeetCode0905();
    Assert.assertNull(solution.sortArrayByParity(A));
  }
}
