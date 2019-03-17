package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0731;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0731 {
  @Test
  public void testProblemCase() {
    LeetCode0731 solution = new LeetCode0731();
    Assert.assertTrue(solution.book(10, 20));
    Assert.assertTrue(solution.book(50, 60));
    Assert.assertTrue(solution.book(10, 40));
    Assert.assertFalse(solution.book(5, 15));
    Assert.assertTrue(solution.book(5, 10));
    Assert.assertTrue(solution.book(25, 55));
  }
}
