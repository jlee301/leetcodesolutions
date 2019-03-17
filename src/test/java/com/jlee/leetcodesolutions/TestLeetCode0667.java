package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0667;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0667 {
  @Test
  public void testProblemCase1() {
    int n = 3, k = 1;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {1,2,3}, solution.constructArray(n, k));
  }

  @Test
  public void testProblemCase2() {
    int n = 3, k = 2;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {2,3,1}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K1() {
    int n = 10, k = 1;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K2() {
    int n = 10, k = 2;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {2,3,4,5,6,7,8,9,10,1}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K3() {
    int n = 10, k = 3;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {2,3,4,5,6,7,8,9,1,10}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K4() {
    int n = 10, k = 4;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {3,4,5,6,7,8,9,2,10,1}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K5() {
    int n = 10, k = 5;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {3,4,5,6,7,8,2,9,1,10}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K6() {
    int n = 10, k = 6;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {4,5,6,7,8,3,9,2,10,1}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K7() {
    int n = 10, k = 7;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {4,5,6,7,3,8,2,9,1,10}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K8() {
    int n = 10, k = 8;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {5,6,7,4,8,3,9,2,10,1}, solution.constructArray(n, k));
  }

  @Test
  public void testN10K9() {
    int n = 10, k = 9;
    LeetCode0667 solution = new LeetCode0667();
    Assert.assertArrayEquals(new int[] {5,6,4,7,3,8,2,9,1,10}, solution.constructArray(n, k));
  }
}
