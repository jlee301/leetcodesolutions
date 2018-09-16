package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode905;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode905 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,1,2,4};
    LeetCode905 solution = new LeetCode905();
    Assert.assertArrayEquals(new int[] {2,4,1,3}, solution.sortArrayByParity(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {3};
    LeetCode905 solution = new LeetCode905();
    Assert.assertArrayEquals(new int[] {3}, solution.sortArrayByParity(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = null;
    LeetCode905 solution = new LeetCode905();
    Assert.assertNull(solution.sortArrayByParity(A));
  }
}
