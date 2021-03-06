package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0768;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0768 {
  @Test
  public void testProblemCase1() {
    // Input: arr = [5,4,3,2,1]
    // Output: 1
    int[] arr = {5,4,3,2,1};
    LeetCode0768 solution = new LeetCode0768();
    Assert.assertEquals(1, solution.maxChunksToSorted(arr));
  }

  @Test
  public void testProblemCase2() {
    // Input: arr = [2,1,3,4,4]
    // Output: 4
    int[] arr = {2,1,3,4,4};
    LeetCode0768 solution = new LeetCode0768();
    Assert.assertEquals(4, solution.maxChunksToSorted(arr));
  }
}
