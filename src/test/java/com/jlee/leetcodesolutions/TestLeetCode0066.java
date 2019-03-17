package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0066;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0066 {
  @Test
  public void testProblemCase1() {
    LeetCode0066 solution = new LeetCode0066();
    int[] digits = { 1 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(2, result[0]);
  }

  @Test
  public void testProblemCase2() {
    LeetCode0066 solution = new LeetCode0066();
    int[] digits = { 1, 2 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(3, result[1]);
  }

  @Test
  public void testProblemCase3() {
    LeetCode0066 solution = new LeetCode0066();
    int[] digits = { 9, 9 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
    Assert.assertEquals(0, result[1]);
    Assert.assertEquals(0, result[2]);
  }

  @Test
  public void testProblemCase4() {
    LeetCode0066 solution = new LeetCode0066();
    int[] digits = { 0 };
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
  }

  @Test
  public void testEmpty() {
    LeetCode0066 solution = new LeetCode0066();
    int[] digits = {};
    int[] result = solution.plusOne(digits);
    Assert.assertEquals(1, result[0]);
  }
}
