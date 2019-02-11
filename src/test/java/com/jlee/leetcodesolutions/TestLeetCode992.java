package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode992;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode992 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,2,1,2,3};
    int K = 2;
    LeetCode992 solution = new LeetCode992();
    Assert.assertEquals(7, solution.subarraysWithKDistinct(A, K));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,2,1,3,4};
    int K = 3;
    LeetCode992 solution = new LeetCode992();
    Assert.assertEquals(3, solution.subarraysWithKDistinct(A, K));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2,1,2,1,2};
    int K = 2;
    LeetCode992 solution = new LeetCode992();
    Assert.assertEquals(10, solution.subarraysWithKDistinct(A, K));
  }
}
