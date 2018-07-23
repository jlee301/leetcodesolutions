package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode873;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode873 {
  @Test
  public void testProblemCase1() {
    // Input: [1,2,3,4,5,6,7,8]
    // Output: 5
    int[] A = {1,2,3,4,5,6,7,8};
    LeetCode873 solution = new LeetCode873();
    Assert.assertEquals(5, solution.lenLongestFibSubseq(A));
  }

  @Test
  public void testProblemCase2() {
    // Input: [1,3,7,11,12,14,18]
    // Output: 3
    int[] A = {1,3,7,11,12,14,18};
    LeetCode873 solution = new LeetCode873();
    Assert.assertEquals(3, solution.lenLongestFibSubseq(A));
  }

  @Test
  public void testProblemCase3() {
    // Input: [1,2,5]
    // Output: 0
    int[] A = {1,2,5};
    LeetCode873 solution = new LeetCode873();
    Assert.assertEquals(0, solution.lenLongestFibSubseq(A));
  }
}
