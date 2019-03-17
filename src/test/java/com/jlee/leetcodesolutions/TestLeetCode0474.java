package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0474;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0474 {
  @Test
  public void testProblemCase1() {
    String[] strs = {"10", "0001", "111001", "1", "0"};
    int m = 5, n = 3;
    LeetCode0474 solution = new LeetCode0474();
    Assert.assertEquals(4, solution.findMaxForm(strs, m, n));
  }

  @Test
  public void testProblemCase2() {
    String[] strs = {"10", "0", "1"};
    int m = 1, n = 1;
    LeetCode0474 solution = new LeetCode0474();
    Assert.assertEquals(2, solution.findMaxForm(strs, m, n));
  }

  @Test
  public void testEmpty() {
    String[] strs = {};
    int m = 1, n = 1;
    LeetCode0474 solution = new LeetCode0474();
    Assert.assertEquals(0, solution.findMaxForm(strs, m, n));
  }

  @Test
  public void testNull() {
    String[] strs = null;
    int m = 1, n = 1;
    LeetCode0474 solution = new LeetCode0474();
    Assert.assertEquals(0, solution.findMaxForm(strs, m, n));
  }
}
