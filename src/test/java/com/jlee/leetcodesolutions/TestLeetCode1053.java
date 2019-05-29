package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1053;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1053 {
  @Test
  public void testProblemCase1() {
    int[] A = {3,2,1};
    LeetCode1053 solution = new LeetCode1053();
    Assert.assertArrayEquals(new int[] {3,1,2}, solution.prevPermOpt1(A));
  }

  @Test
  public void testProblemCase2() {
    int[] A = {1,1,5};
    LeetCode1053 solution = new LeetCode1053();
    Assert.assertArrayEquals(new int[] {1,1,5}, solution.prevPermOpt1(A));
  }

  @Test
  public void testProblemCase3() {
    int[] A = {1,9,4,6,7};
    LeetCode1053 solution = new LeetCode1053();
    Assert.assertArrayEquals(new int[] {1,7,4,6,9}, solution.prevPermOpt1(A));
  }

  @Test
  public void testProblemCase4() {
    int[] A = {3,1,1,3};
    LeetCode1053 solution = new LeetCode1053();
    Assert.assertArrayEquals(new int[] {1,3,1,3}, solution.prevPermOpt1(A));
  }
}
