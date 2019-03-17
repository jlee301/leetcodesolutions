package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0922;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0922 {
  @Test
  public void testProblemCase1() {
    int[] A = {4,2,5,7};
    LeetCode0922 solution = new LeetCode0922();
    Assert.assertArrayEquals(new int[] {4,5,2,7}, solution.sortArrayByParityII(A));
  }
}
