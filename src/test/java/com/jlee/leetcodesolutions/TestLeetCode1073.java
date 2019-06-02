package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1073;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1073 {
  @Test
  public void testProblemCase1() {
    int[] arr1 = {1,1,1,1,1}, arr2 = {1,0,1};
    LeetCode1073 solution = new LeetCode1073();
    Assert.assertArrayEquals(new int[] {1,0,0,0,0}, solution.addNegabinary(arr1, arr2));
  }

  @Test
  public void testProblemCase2() {
    int[] arr2 = {1,1,1,1,1}, arr1 = {1,0,1};
    LeetCode1073 solution = new LeetCode1073();
    Assert.assertArrayEquals(new int[] {1,0,0,0,0}, solution.addNegabinary(arr1, arr2));
  }

  @Test
  public void testProblemCase3() {
    int[] arr2 = {1,0,1,0,1,0,1}, arr1 = {1,1,1,0,1,0,0};
    LeetCode1073 solution = new LeetCode1073();
    Assert.assertArrayEquals(new int[] {1,1,0,0,1,1,0,0,1}, solution.addNegabinary(arr1, arr2));
  }

  @Test
  public void testProblemCase4() {
    int[] arr2 = {1}, arr1 = {1,1};
    LeetCode1073 solution = new LeetCode1073();
    Assert.assertArrayEquals(new int[] {0}, solution.addNegabinary(arr1, arr2));
  }
}
