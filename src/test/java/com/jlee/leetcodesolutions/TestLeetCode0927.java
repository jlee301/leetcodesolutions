package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0927;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0927 {
  @Test
  public void testProblemCase1() {
    int[] A = {1,0,1,0,1};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {0,3}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,0,1,1};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = null;
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase5() {
    int[] A = {0,0,0};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {0,2}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase6() {
    int[] A = {1,1,1,0};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase7() {
    int[] A = {0,1,1,1,0};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }

  @Test
  public void testProblemCase8() {
    int[] A = {0,1,0,1,1,0};
    LeetCode0927 solution = new LeetCode0927();
    Assert.assertArrayEquals(new int[] {-1,-1}, solution.threeEqualParts(A));
  }
}
