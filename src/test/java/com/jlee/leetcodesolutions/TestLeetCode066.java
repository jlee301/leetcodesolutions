package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode066;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode066 {
  @Test
  public void testOneNumber() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = { 1 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testTwoNumber() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = { 1, 2 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void test99() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = { 9, 9 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(0, result[1]);
    Assert.assertEquals(0, result[2]);
  }

  @Test
  public void test0() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = { 0 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
  }

  @Test
  public void testEmpty() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = {};
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
  }

  @Test
  public void testNull() {
    LeetCode066 solution = new LeetCode066();
    int[] digits = null;
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
  }
}
