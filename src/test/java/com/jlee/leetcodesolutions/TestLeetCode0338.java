package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0338;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0338 {
  @Test
  public void testNum0() {
    int num = 0;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0}, solution.countBits(num));
  }

  @Test
  public void testNum1() {
    int num = 1;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0,1}, solution.countBits(num));
  }

  @Test
  public void testNum2() {
    int num = 2;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0,1,1}, solution.countBits(num));
  }

  @Test
  public void testNum3() {
    int num = 3;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0,1,1,2}, solution.countBits(num));
  }

  @Test
  public void testNum4() {
    int num = 4;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0,1,1,2,1}, solution.countBits(num));
  }

  @Test
  public void testNum5() {
    int num = 5;
    LeetCode0338 solution = new LeetCode0338();
    Assert.assertArrayEquals(new int[] {0,1,1,2,1,2}, solution.countBits(num));
  }
}
