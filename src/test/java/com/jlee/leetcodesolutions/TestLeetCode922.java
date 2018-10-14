package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode922;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode922 {
  @Test
  public void testProblemCase1() {
    int[] A = {4,2,5,7};
    LeetCode922 solution = new LeetCode922();
    Assert.assertArrayEquals(new int[] {4,5,2,7}, solution.sortArrayByParityII(A));
  }
}
