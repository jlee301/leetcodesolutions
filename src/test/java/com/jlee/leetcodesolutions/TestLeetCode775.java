package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode775;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode775 {
  @Test
  public void test102() {
    int[] A = {1,0,2};
    LeetCode775 solution = new LeetCode775();
    Assert.assertTrue(solution.isIdealPermutation(A));
  }

  @Test
  public void test120() {
    int[] A = {1,2,0};
    LeetCode775 solution = new LeetCode775();
    Assert.assertFalse(solution.isIdealPermutation(A));
  }

  @Test
  public void test012() {
    int[] A = {0,1,2};
    LeetCode775 solution = new LeetCode775();
    Assert.assertTrue(solution.isIdealPermutation(A));
  }

  @Test
  public void test201() {
    int[] A = {2,0,1};
    LeetCode775 solution = new LeetCode775();
    Assert.assertFalse(solution.isIdealPermutation(A));
  }

  @Test
  public void test021() {
    int[] A = {0,2,1};
    LeetCode775 solution = new LeetCode775();
    Assert.assertTrue(solution.isIdealPermutation(A));
  }
}
