package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0870;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0870 {
  @Test
  public void testProblemCase1() {
    // Input: A = [2,7,11,15], B = [1,10,4,11]
    // Output: [2,11,7,15]
    int[] A = {2,7,11,15}, B = {1,10,4,11};
    LeetCode0870 solution = new LeetCode0870();
    Assert.assertArrayEquals(new int[] {2,11,7,15}, solution.advantageCount(A, B));
  }

  @Test
  public void testProblemCase2() {
    // Input: A = [12,24,8,32], B = [13,25,32,11]
    // Output: [24,32,8,12]
    int[] A = {12,24,8,32}, B = {13,25,32,11};
    LeetCode0870 solution = new LeetCode0870();
    Assert.assertArrayEquals(new int[] {24,32,8,12}, solution.advantageCount(A, B));
  }

  @Test
  public void testProblemCase3() {
    // Input: A = [2,0,4,1,2], B = [1,3,0,0,2]
    // Output: [2,4,1,2,0]]
    int[] A = {2,0,4,1,2}, B = {1,3,0,0,2};
    LeetCode0870 solution = new LeetCode0870();
    Assert.assertArrayEquals(new int[] {2,4,1,2,0}, solution.advantageCount(A, B));
  }
}
