package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0898;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0898 {
  @Test
  public void testProblemCase1() {
    int[] A = {0};
    LeetCode0898 solution = new LeetCode0898();
    Assert.assertEquals(1, solution.subarrayBitwiseORs(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,2};
    LeetCode0898 solution = new LeetCode0898();
    Assert.assertEquals(3, solution.subarrayBitwiseORs(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,2,4};
    LeetCode0898 solution = new LeetCode0898();
    Assert.assertEquals(6, solution.subarrayBitwiseORs(A));
  }
}
