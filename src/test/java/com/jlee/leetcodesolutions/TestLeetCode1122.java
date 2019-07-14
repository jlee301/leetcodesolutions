package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode1122;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode1122 {
  @Test
  public void testProblemCase1() {
    int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
    LeetCode1122 solution = new LeetCode1122();
    Assert.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, solution.relativeSortArray(arr1, arr2));
  }
}
