package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode218;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode218 {
  @Test
  public void testProblemCase1() {
    int[][] buildings = { {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
    LeetCode218 solution = new LeetCode218();
    List<int[]> result = solution.getSkyline(buildings);
    Assert.assertEquals(7, result.size());
    Assert.assertArrayEquals(new int[] {2,10}, result.get(0));
    Assert.assertArrayEquals(new int[] {3,15}, result.get(1));
    Assert.assertArrayEquals(new int[] {7,12}, result.get(2));
    Assert.assertArrayEquals(new int[] {12,0}, result.get(3));
    Assert.assertArrayEquals(new int[] {15,10}, result.get(4));
    Assert.assertArrayEquals(new int[] {20,8}, result.get(5));
    Assert.assertArrayEquals(new int[] {24,0}, result.get(6));
  }

  @Test
  public void testProblemCase2() {
    int[][] buildings = { {2, 9, 10}, {2, 8, 9} };
    LeetCode218 solution = new LeetCode218();
    List<int[]> result = solution.getSkyline(buildings);
    Assert.assertEquals(2, result.size());
    Assert.assertArrayEquals(new int[] {2,10}, result.get(0));
    Assert.assertArrayEquals(new int[] {9,0}, result.get(1));
  }

  @Test
  public void testProblemCase3() {
    int[][] buildings = { {2, 9, 10}, {3, 9, 9} };
    LeetCode218 solution = new LeetCode218();
    List<int[]> result = solution.getSkyline(buildings);
    Assert.assertEquals(2, result.size());
    Assert.assertArrayEquals(new int[] {2,10}, result.get(0));
    Assert.assertArrayEquals(new int[] {9,0}, result.get(1));
  }

  @Test
  public void testProblemCase4() {
    int[][] buildings = { {2, 9, 10}, {9, 10, 10} };
    LeetCode218 solution = new LeetCode218();
    List<int[]> result = solution.getSkyline(buildings);
    Assert.assertEquals(2, result.size());
    Assert.assertArrayEquals(new int[] {2,10}, result.get(0));
    Assert.assertArrayEquals(new int[] {10,0}, result.get(1));
  }
}
