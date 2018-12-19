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
  public void testProblemCase3() {
    int[] flowerbed = {0,0,1};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase4() {
    int[] flowerbed = {1,0,0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase5() {
    int[] flowerbed = {1,0,0,0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase6() {
    int[] flowerbed = {0};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase7() {
    int[] flowerbed = {1,1,1,1};
    int n = 1;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase8() {
    int[] flowerbed = {0,0,0,0};
    int n = 2;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase9() {
    int[] flowerbed = {0,0,0,0};
    int n = 3;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase10() {
    int[] flowerbed = {};
    int n = 3;
    LeetCode605 solution = new LeetCode605();
    Assert.assertFalse(solution.canPlaceFlowers(flowerbed, n));
  }

  @Test
  public void testProblemCase11() {
    int[] flowerbed = {0,0,0,0};
    int n = 0;
    LeetCode605 solution = new LeetCode605();
    Assert.assertTrue(solution.canPlaceFlowers(flowerbed, n));
  }
}
