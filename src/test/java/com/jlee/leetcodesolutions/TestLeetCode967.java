package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode967;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode967 {
  @Test
  public void testProblemCase1() {
    int N = 3, K = 7;
    LeetCode967 solution = new LeetCode967();
    Assert.assertArrayEquals(new int[] {181,292,707,818,929}, solution.numsSameConsecDiff(N, K));
  }

  @Test
  public void testProblemCase2() {
    int N = 2, K = 1;
    LeetCode967 solution = new LeetCode967();
    Assert.assertArrayEquals(new int[] {10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98}, solution.numsSameConsecDiff(N, K));
  }

  @Test
  public void testProblemCase3() {
    int N = 1, K = 0;
    LeetCode967 solution = new LeetCode967();
    Assert.assertArrayEquals(new int[] {0,1,2,3,4,5,6,7,8,9}, solution.numsSameConsecDiff(N, K));
  }

  @Test
  public void testProblemCase4() {
    int N = 2, K = 0;
    LeetCode967 solution = new LeetCode967();
    Assert.assertArrayEquals(new int[] {11,22,33,44,55,66,77,88,99}, solution.numsSameConsecDiff(N, K));
  }
}
