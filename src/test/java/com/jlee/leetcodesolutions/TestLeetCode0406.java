package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0406;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0406 {
  @Test
  public void testProblemCase() {
    int[][] people = { {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2} };
    LeetCode0406 solution = new LeetCode0406();
    int[][] result = solution.reconstructQueue(people);
    Assert.assertEquals(6, result.length);
    Assert.assertArrayEquals(new int[] {5,0}, result[0]);
    Assert.assertArrayEquals(new int[] {7,0}, result[1]);
    Assert.assertArrayEquals(new int[] {5,2}, result[2]);
    Assert.assertArrayEquals(new int[] {6,1}, result[3]);
    Assert.assertArrayEquals(new int[] {4,4}, result[4]);
    Assert.assertArrayEquals(new int[] {7,1}, result[5]);
  }
}
