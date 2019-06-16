package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1089;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1089 {
  @Test
  public void testProblemCase1() {
    int[] arr = {1,0,2,3,0,4,5,0};
    LeetCode1089 solution = new LeetCode1089();
    solution.duplicateZeros(arr);
    Assert.assertArrayEquals(new int[] {1,0,0,2,3,0,0,4}, arr);
  }

  @Test
  public void testProblemCase2() {
    int[] arr = {1,2,3};
    LeetCode1089 solution = new LeetCode1089();
    solution.duplicateZeros(arr);
    Assert.assertArrayEquals(new int[] {1,2,3}, arr);
  }
}
