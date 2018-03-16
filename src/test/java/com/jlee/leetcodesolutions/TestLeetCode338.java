package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode338;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode338 {
  @Test
  public void testNum0() {
    int num = 0;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0}, solution.countBits(num));
  }

  @Test
  public void testNum1() {
    int num = 1;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0,1}, solution.countBits(num));
  }

  @Test
  public void testNum2() {
    int num = 2;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0,1,1}, solution.countBits(num));
  }

  @Test
  public void testNum3() {
    int num = 3;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0,1,1,2}, solution.countBits(num));
  }

  @Test
  public void testNum4() {
    int num = 4;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0,1,1,2,1}, solution.countBits(num));
  }

  @Test
  public void testNum5() {
    int num = 5;
    LeetCode338 solution = new LeetCode338();
    Assert.assertArrayEquals(new int[] {0,1,1,2,1,2}, solution.countBits(num));
  }
}
