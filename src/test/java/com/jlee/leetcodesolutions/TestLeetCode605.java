package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode605;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode605 {
  @Test
  public void testProblemCase1() {
    int[] flowerbed = {1,0,0,0,1};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase2() {
    int[] flowerbed = {1,0,0,0,1};
    int n = 2;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testInBeginning() {
    int[] flowerbed = {0,0,1};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testInEnd() {
    int[] flowerbed = {1,0,0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testInBetween() {
    int[] flowerbed = {1,0,0,0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testOneSpace() {
    int[] flowerbed = {0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testAllFull() {
    int[] flowerbed = {1,1,1,1};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testEnoughRoom() {
    int[] flowerbed = {0,0,0,0};
    int n = 2;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testNotEnoughRoom() {
    int[] flowerbed = {0,0,0,0};
    int n = 3;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testFlowerEmpty() {
    int[] flowerbed = {};
    int n = 3;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testFlowerNull() {
    int[] flowerbed = null;
    int n = 3;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testN0() {
    int[] flowerbed = {0,0,0,0};
    int n = 0;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }
}
