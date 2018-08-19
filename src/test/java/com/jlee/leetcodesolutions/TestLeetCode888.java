package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode888;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode888 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,1}, B = {2,2};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {1,2}, solution.fairCandySwap(A, B));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1}, B = {2,3};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {1,2}, solution.fairCandySwap(A, B));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {2}, B = {1,3};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {2,3}, solution.fairCandySwap(A, B));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {1,2,5}, B = {2,4};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {5,4}, solution.fairCandySwap(A, B));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {14,54,83,100,72,1,91,60,13,71,94,28,58,63,61,34,55,93,56,17};
    int[] B = {58,75,8,87,48,22,23,9,85,82,42,99,23,1,83,77,19,32,9,56};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {91,1}, solution.fairCandySwap(A, B));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {2}, B = {3};
    LeetCode888 solution = new LeetCode888();
    Assert.assertArrayEquals(new int[] {0,0}, solution.fairCandySwap(A, B));
  }
}
