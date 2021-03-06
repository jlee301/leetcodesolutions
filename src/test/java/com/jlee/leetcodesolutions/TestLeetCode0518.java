package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0518;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0518 {
  @Test
  public void testProblemCase1() {
    int amount = 5;
    int[] coins = {1, 2, 5};
    LeetCode0518 solution = new LeetCode0518();
    Assert.assertEquals(4, solution.change(amount, coins));
  }

  @Test
  public void testProblemCase2() {
    int amount = 3;
    int[] coins = {2};
    LeetCode0518 solution = new LeetCode0518();
    Assert.assertEquals(0, solution.change(amount, coins));
  }

  @Test
  public void testProblemCase3() {
    int amount = 10;
    int[] coins = {10};
    LeetCode0518 solution = new LeetCode0518();
    Assert.assertEquals(1, solution.change(amount, coins));
  }
}
